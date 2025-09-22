package InheritanceProblem.Hierarchical_Inheritance;

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int age) { super(name, age); }
    public void performDuties() { System.out.println("Cooking food"); }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int age) { super(name, age); }
    public void performDuties() { System.out.println("Serving food"); }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Worker w1 = new Chef("John", 35);
        Worker w2 = new Waiter("Emma", 25);

        w1.performDuties();
        w2.performDuties();
    }
}

