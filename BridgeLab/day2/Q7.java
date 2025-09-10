package Class_work;

class q7 {
    final int value = 100;

    void changeValue() {
        // Trying to change final variable
        // value = 200; // Compile-time error
        System.out.println("Value = " + value);
    }
}
public class Q7 {
    public static void main(String[] args) {
        q7 Q = new q7();
        Q.changeValue();
    }
}
