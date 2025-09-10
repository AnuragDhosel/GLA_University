package Class_work;

// 15. Create a class with multiple methods accessing the same instance variable. Show how changes made in one method affect another.
class q15{
    int value = 0;

    void setValue(int v) {
        value = v;
        System.out.println("Value set to: " + value);
    }

    void increment() {
        value++;
        System.out.println("Value after increment: " + value);
    }

    void display() {
        System.out.println("Current value: " + value);
    }
}

public class Q15 {
    public static void main(String[] args) {
        q15 Q = new q15();

        Q.display();
        Q.setValue(10);
        Q.increment();
        Q.display();
    }
}
