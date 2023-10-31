// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();
        myDog.bark();

        myCat.eat(); 
        myCat.meow();
    }
}
