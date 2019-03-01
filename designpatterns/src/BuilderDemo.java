class Student
{
    private int rollNumber;
    private String name;
    private String course;
    private int yearOfEnrollment;
    private int yearOfPassing;
    private String fatherName;
    private String motherName;
    public Student(StudentBuilder studentBuilder)
    {
        this.rollNumber=studentBuilder.getRollNumber();
        this.name=studentBuilder.getName();
        this.course=studentBuilder.getCourse();
        this.yearOfEnrollment=studentBuilder.getYearOfEnrollment();
        this.yearOfPassing=studentBuilder.getYearOfPassing();
        this.fatherName=studentBuilder.getFatherName();
        this.motherName=studentBuilder.getMotherName();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", yearOfEnrollment=" + yearOfEnrollment +
                ", yearOfPassing=" + yearOfPassing +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
class StudentBuilder
{
    private int rollNumber;
    private String name;
    private String course;
    private int yearOfEnrollment;
    private int yearOfPassing;
    private String fatherName;
    private String motherName;

    public int getRollNumber() {
        return rollNumber;
    }

    public StudentBuilder hasRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }


    public String getName() {
        return name;
    }

    public StudentBuilder hasName(String name) {
        this.name = name;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder studiesInCourse(String course) {
        this.course = course;
        return this;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public StudentBuilder hasEnrolledInYear(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
        return this;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public StudentBuilder hasPassingYear(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }
    public Student createStudent()
    {
        return new Student(this);
    }

}
public class BuilderDemo {
    public static void main(String[] args) {
        Student student=new StudentBuilder()
                .hasRollNumber(1)
                .hasName("Surbhi Garg")
                .studiesInCourse("MCA")
                .setFatherName("Umesh Chand Garg")
                .setMotherName("Rama Garg")
                .hasEnrolledInYear(2016)
                .hasPassingYear(2019)
                .createStudent();
        System.out.println(student);
    }
}
