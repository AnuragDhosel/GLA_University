package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level1;

class Circle {
    double radius;

    Circle() {
        this(5.0); // constructor chaining
    }

    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.5);
        c1.display();
        c2.display();
    }
}
