class AccessModifier {

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        AccessModifiers demo = new AccessModifiers();

        // Access public members from anywhere
        demo.publicMethod();

        // Access protected and default members in the same class
        demo.protectedMethod();
        demo.defaultMethod();

        // Private members are not accessible from outside the class
        // demo.privateMethod(); // This will result in a compilation error
    }
}
