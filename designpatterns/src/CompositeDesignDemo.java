import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *       Employee
 *           |
 *       ---------------
 *       |               |
 * Technical             Non Technical
 *     |                     |
 *   -----------         --------------
 *   |           |       |             |
 *   Surbhi      Gagan   Ajay        Shreya
 *
 * component--->Directory (All are of type directory)
 * Comppsite---->EmployeeDirectory,TechnicalEmployeeDirectory,Non-TechnicalEmployeeDirectory
 * Leaf-->TechnicalEmployee,NonTechnicalEmployee
 *
 * */
//Component
interface Directory {
    void showDirectoryInfo();
}

//Leaf
class TechnicalEmployee implements Directory {
    private String name;
    private String specialization;

    public TechnicalEmployee(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void showDirectoryInfo() {
        System.out.println("TechnicalEmployee{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}');

    }
}

class NonTechnicalEmployee implements Directory {
    String name;

    public NonTechnicalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDirectoryInfo() {
        System.out.println("NonTechnicalEmployee{" +
                "name='" + name + '\'' +
                '}');
    }
}

//Composite
class TechnicalEmployeeDirectory implements Directory {
    List<TechnicalEmployee> technicalEmployees;

    public TechnicalEmployeeDirectory() {
        technicalEmployees = new ArrayList<>();
    }

    public List<TechnicalEmployee> getTechnicalEmployees() {
        return technicalEmployees;
    }

    public void setTechnicalEmployees(List<TechnicalEmployee> technicalEmployees) {
        this.technicalEmployees = technicalEmployees;
    }

    @Override
    public void showDirectoryInfo() {
        technicalEmployees.forEach(e -> e.showDirectoryInfo());
    }
}

class NonTechnicalEmployeeDirectory implements Directory {
    List<NonTechnicalEmployee> nonTechnicalEmployees;

    public NonTechnicalEmployeeDirectory() {
        nonTechnicalEmployees = new ArrayList<>();
    }

    public List<NonTechnicalEmployee> getNonTechnicalEmployees() {
        return nonTechnicalEmployees;
    }

    public void setNonTechnicalEmployees(List<NonTechnicalEmployee> nonTechnicalEmployees) {
        this.nonTechnicalEmployees = nonTechnicalEmployees;
    }

    @Override
    public void showDirectoryInfo() {
        nonTechnicalEmployees.forEach(e -> e.showDirectoryInfo());
    }
}

class EmployeeDirectory implements Directory {
    List<Directory> employeeDirectories;

    public EmployeeDirectory() {
        employeeDirectories = new ArrayList<>();
    }

    public List<Directory> getEmployeeDirectories() {
        return employeeDirectories;
    }

    public void setEmployeeDirectories(List<Directory> employeeDirectories) {
        this.employeeDirectories = employeeDirectories;
    }

    @Override
    public void showDirectoryInfo() {
        employeeDirectories.forEach(e -> e.showDirectoryInfo());
    }
}

public class CompositeDesignDemo {
    //Client
    public static void main(String[] args) {

        TechnicalEmployee technicalEmployee1 = new TechnicalEmployee("Surbhi", "JVM");
        TechnicalEmployee technicalEmployee2 = new TechnicalEmployee("Gagan", "JVM");

        NonTechnicalEmployee nonTechnicalEmployee1 = new NonTechnicalEmployee("Ajay");
        NonTechnicalEmployee nonTechnicalEmployee2 = new NonTechnicalEmployee("Shreya");

        TechnicalEmployeeDirectory technicalEmployeeDirectory = new TechnicalEmployeeDirectory();
        technicalEmployeeDirectory.getTechnicalEmployees().addAll(Arrays.asList(technicalEmployee1, technicalEmployee2));

        NonTechnicalEmployeeDirectory nonTechnicalEmployeeDirectory = new NonTechnicalEmployeeDirectory();
        nonTechnicalEmployeeDirectory.getNonTechnicalEmployees().addAll(Arrays.asList(nonTechnicalEmployee1, nonTechnicalEmployee2));

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.getEmployeeDirectories().addAll(Arrays.asList(technicalEmployeeDirectory, nonTechnicalEmployeeDirectory));

        employeeDirectory.showDirectoryInfo();

    }
}
