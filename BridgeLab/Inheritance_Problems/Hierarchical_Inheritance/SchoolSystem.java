package InheritanceProblem.Hierarchical_Inheritance;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayRole() {
        System.out.println("Generic Person");
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    void displayRole() {
        System.out.println("Teacher: " + subject);
    }
}

class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    @Override
    void displayRole() {
        System.out.println("Student: " + grade);
    }
}

class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    @Override
    void displayRole() {
        System.out.println("Staff: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 30, "Math");
        Student s = new Student("Bob", 16, "10th Grade");
        Staff st = new Staff("Charlie", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

