package Class_work;

// 4. Create a class Student with name (String) and marks (int). Use a constructor to initialize values. Create two objects and print their data.
// 5. Write a program where you modify a static variable using one object, and access it from another object. Show how it reflects the change.
class StudentQ {
    String name;
    int marks;
    static int variable1 = 0;
    StudentQ(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void displayStudent() {
        System.out.println("Name: " + name + ", Marks: " + marks);
        variable1++;
    }
}

public class Student {
    public static void main(String[] args) {
        // 4.
        StudentQ s1 = new StudentQ("Anurag", 95);
        StudentQ s2 = new StudentQ("harsh", 92);
        s1.displayStudent();
        s2.displayStudent();
        System.out.println("variable 1 is: " + StudentQ.variable1);
    }
}
