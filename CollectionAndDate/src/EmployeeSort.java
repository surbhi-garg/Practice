import java.util.*;

class Employee
{
    String name;
    double age;
    double salary;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee("Surbhi",23,20000),
                new Employee("Vagish",23,15000),
                new Employee("Rishabh",23,18000),
                new Employee("Yukti",23,14000));
        System.out.println("------------Employee list before sorting-----");
        System.out.println(employeeList);
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.salary-o1.salary);
            }
        });
        System.out.println("-------Employee list after sorting----------");
        System.out.println(employeeList);
    }
}
