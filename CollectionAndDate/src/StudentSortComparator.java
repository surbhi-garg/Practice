import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    String name;
    double age;
    double score;

    public Student1(String name, double age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
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

public class StudentSortComparator {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student("Vagish",23,20),
                new Student("Surbhi",23,20),
                new Student("Rishabh",23,18),
                new Student("Yukti",23,14));
        System.out.println("------------Student list before sorting-----");
        for(Student student:studentList)
            System.out.println(student);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score)
                    return o1.name.compareTo(o2.name);
                return (int) (o1.score-o2.score);
            }
        });
        System.out.println("-------Student list after sorting----------");
        for(Student student:studentList)
            System.out.println(student);
    }
}
