package Class_work;

class Demo {
    int num;
    void setNum(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Instance variable num = " + this.num);
    }
}

public class demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
