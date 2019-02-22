import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable
{
    String name;
    double age;
    double score;

    public Student(String name, double age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student student=null;
        if(o instanceof Student) {
            student = (Student) o;
        }
        if(student!=null)
            if (this.score == student.score)
                return name.compareTo(student.name);
            return (int) (this.score-student.score);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}


public class StudentSort {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student("Vagish",23,20),
                new Student("Surbhi",23,20),
                new Student("Rishabh",23,18),
                new Student("Yukti",23,14));
        System.out.println("------------Student list before sorting-----");
        for(Student student:studentList)
            System.out.println(student);
        Collections.sort(studentList);
        System.out.println("-------Student list after sorting----------");
        for(Student student:studentList)
            System.out.println(student);
    }
}
