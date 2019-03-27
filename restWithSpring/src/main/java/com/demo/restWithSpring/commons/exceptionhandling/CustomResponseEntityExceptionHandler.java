package com.demo.restWithSpring.commons.exceptionhandling;

import com.demo.restWithSpring.student.exception.DuplicateStudentFoundException;
import com.demo.restWithSpring.student.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @Autowired
    MessageSource messageSource;

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception exception, WebRequest webRequest) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public final ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException studentNotFoundException, WebRequest webRequest) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), studentNotFoundException.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateStudentFoundException.class)
    public final ResponseEntity<Object> handleDuplicateStudentFoundException(DuplicateStudentFoundException duplicateStudentFoundException, WebRequest webRequest) {
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), duplicateStudentFoundException.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.CONFLICT);
    }

    //Question3
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errorMessages = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .filter(e -> e instanceof FieldError)
                .map(e -> {
                    FieldError fieldError = (FieldError) e;
                    return messageSource.getMessage(fieldError, null);
                }).collect(Collectors.toList());
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), "Validation Failed", errorMessages.toString());
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
