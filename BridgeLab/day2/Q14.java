package Class_work;
// 14. Create a method that accepts a parameter with the same name as a class variable. Use this keyword to assign it.
class q14 {
    String name;
    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }
}
public class Q14 {
    public static void main(String[] args) {
        q14 s1 = new q14();
        s1.setName("Anurag");  // assigning via parameter
        s1.display();
    }
}
