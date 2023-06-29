package demo1;

public class AccessModifiers {

    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myObject = new MyClass();

        // Accessing public members
        myObject.publicMethod();
        System.out.println("Public variable: " + myObject.publicVariable);

        // Accessing protected members
        myObject.protectedMethod();
        System.out.println("Protected variable: " + myObject.protectedVariable);

        // Accessing default (package-private) members
        myObject.defaultMethod();
        System.out.println("Default variable: " + myObject.defaultVariable);

       
    }
}

class MyClass {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30;
    private int privateVariable = 40;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}
