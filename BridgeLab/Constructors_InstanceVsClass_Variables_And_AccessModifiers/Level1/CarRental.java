package Constructors_InstanceVsClass_Variables_And_AccessModifiers.Level1;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0; // Example cost per day

    CarRental() {
        customerName = "Unknown";
        carModel = "Unknown";
        rentalDays = 0;
    }

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    double calculateCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Bob", "Toyota Innova", 5);
        cr1.display();
        cr2.display();
    }
}

