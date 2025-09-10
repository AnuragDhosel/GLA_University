package Class_work;

//11. Declare a class variable (static) without initialization. Print its default value. Then assign and print again.
class q11 {
    static int number;
    static void printNo() {
        System.out.println("Value of number = " + number);
    }
}

public class Q11 {
    public static void main(String[] args) {
        q11.printNo();
        q11.number = 25;
        q11.printNo();
    }
}
