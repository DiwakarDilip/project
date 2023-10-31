class Person {
    String name;
    int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Create objects of the Person class using constructors
        Person person1 = new Person("Diwakar", 30);
        Person person2 = new Person("Dilip", 25);

        // Access attributes directly and display
        System.out.println("Person 1 - Name: " + person1.name + ", Age: " + person1.age);
        System.out.println("Person 2 - Name: " + person2.name + ", Age: " + person2.age);
    }
}
