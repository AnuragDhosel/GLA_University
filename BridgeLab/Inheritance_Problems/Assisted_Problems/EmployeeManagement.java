package InheritanceProblem.Assisted_Problems;

class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;
    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.internshipDuration = duration;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 101, 90000, 10);
        Developer d = new Developer("Bob", 102, 70000, "Java");
        Intern i = new Intern("Charlie", 103, 20000, 3);

        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
