package college.Day3;
public class question2 {
    // Static variable
    static int staticVariable = 10;

    // Static block
    static {
        System.out.println("This is a static block.");
        System.out.println( "It runs only once when the class is loaded.");
        System.out.println("Static Variable Value: " + staticVariable);
        System.out.println("-----------------------------------------");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static Variable Value: " + staticVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Static Variable Value (accessed directly): " + staticVariable);

        // Accessing static method
        staticMethod();

        // Modifying the static variable
        staticVariable = 20;

        // Accessing static variable after modification
        System.out.println("Static Variable Value (after modification): " + staticVariable);

        // Accessing static method after modification
        staticMethod();
    }
}
