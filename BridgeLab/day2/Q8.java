package Class_work;

class q8 {
    static int count;

    static {
        count = 10;
        System.out.println("Static block executed! count initialized to " + count);
    }
}

public class Q8 {
    public static void main(String[] args) {
        q8 Q = new q8();
        System.out.println(q8.count);
    }
}
