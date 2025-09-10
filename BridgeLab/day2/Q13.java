package Class_work;

//13. Create two classes: A and B. Inside A, create a static variable x. In class B, change and print it.
class A {
    static int x = 4; // static variable
}
class B {
    void modify() {
        A.x = 40;
        System.out.println("Value of x after modification: " + A.x);
    }
}
public class Q13 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.modify();
    }
}
