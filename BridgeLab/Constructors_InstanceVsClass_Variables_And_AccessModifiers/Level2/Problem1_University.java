package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level2;

// Problem1_University.java
class Student {
    public int rollNumber;        // Public: accessible everywhere
    protected String name;        // Protected: accessible in same package & subclasses
    private double CGPA;          // Private: accessible only inside class

    Student(int roll, String n, double c) {
        rollNumber = roll;
        name = n;
        CGPA = c;
    }

    // Public methods to access and modify CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected member
class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int roll, String n, double c, String spec) {
        super(roll, n, c);
        specialization = spec;
    }

    public void showDetails() {
        // Accessing protected 'name' from parent
        System.out.println("Postgraduate Student: " + name + " specializes in " + specialization);
    }
}
public class Problem1_University {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Alice", 8.5, "AI");
        pg.display();
        pg.showDetails();

        pg.setCGPA(9.0); // Updating CGPA using public method
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
