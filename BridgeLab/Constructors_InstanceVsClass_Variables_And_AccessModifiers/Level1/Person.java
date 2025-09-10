package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level1;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) { // Copy Constructor
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}

