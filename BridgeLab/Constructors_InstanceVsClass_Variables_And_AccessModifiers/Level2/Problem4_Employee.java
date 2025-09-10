package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level2;

// Problem4_Employee.java
class Employee {
    public int employeeID;       // Public
    protected String department; // Protected
    private double salary;       // Private

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // Public method to modify salary
    public void setSalary(double sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

// Subclass to access public & protected members
class Manager extends Employee {
    String teamName;

    Manager(int id, String dept, double sal, String team) {
        super(id, dept, sal);
        teamName = team;
    }

    public void showDetails() {
        // Accessing employeeID (public) and department (protected)
        System.out.println("Manager ID: " + employeeID + " from " + department + " leads " + teamName);
    }
}
public class Problem4_Employee {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Development Team");
        m.display();
        m.showDetails();

        m.setSalary(80000); // Updating salary using public method
        System.out.println("Updated Salary: " + m.getSalary());
    }
}
