public class CustomException extends Exception{
    public CustomException(String message)
    {
        super(message);
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
       return this;
    }

}
