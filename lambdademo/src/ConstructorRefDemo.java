class Employee
{
    int age;
    String name;
    String city;

    public Employee(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
@FunctionalInterface
interface Generator
{
    Employee createEmployee(int age,String name,String city);
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        //constructor reference
        Generator generator=Employee::new;
        System.out.println(generator.createEmployee(23,"Surbhi Garg","Delhi"));

    }
}
