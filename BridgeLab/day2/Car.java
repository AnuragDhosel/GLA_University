package Class_work;

// 1. Create a class Car with instance variables model and year. Create two car objects and display their details.
// 2. Add a static variable numberOfCars in the Car class from Q1 to count how many objects have been created.
// 3. Create a method inside a class that declares a local variable. Try printing it outside the method. What happens?
class CarQ{
    String model;
    int year;
    static int numberOfCars = 0;
    CarQ(String model , int year){
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    void display(){
        int localVariable = 5;
        System.out.println("the car model is " + model + " and model year is " + year);
    }
}

public class Car {
    public static void main(String[] args) {
        CarQ car1 = new CarQ("Toyota", 2020);
        CarQ car2 = new CarQ("Honda", 2022);
        car1.display();
        car2.display();
        System.out.println("total number of cars: " + CarQ.numberOfCars);
        // System.out.println(localVariable); // variable is not found
    }
}
