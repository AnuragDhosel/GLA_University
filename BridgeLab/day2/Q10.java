package Class_work;
/*
10. Create a class that uses all three types of variables:
Instance variable
Static variable
Local variable
Print all of them in a method.
 */

class q10{
    int instanceVar = 50;
    static String staticVar = "I am a static variable";

    void showVariables() {
        int localVar = 100;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
}

public class Q10 {
    public static void main(String[] args) {
        q10 Q = new q10();
        Q.showVariables();
    }
}
