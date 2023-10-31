// Base class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Subclass 
class bike extends vehicle {
    void break() {
        System.out.println("bike has stopped");
    }
}

// Subclass 
class Car extends bike {
    void start() {
        System.out.println("Car has started");
    }
}



public class Main {
    public static void main(String[] args) {
        car myCar = new Car();
        myCar.drive();
        myCar.start(); 
	myCar.break(); 
    }
}
