// Base class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass 
class Car extends Vehicle {
    void start() {
        System.out.println("Car has started");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.start(); 
    }
}
