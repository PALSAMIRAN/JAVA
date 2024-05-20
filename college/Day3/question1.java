package college.Day3;

 public class question1 {
    private int num1;
    private int num2;
    private String name;

    // Default Constructor
    public question1() {
        this.num1 = 0;
        this.num2 = 0;
        this.name = "Default";
    }

    // Parameterized Constructor 1
    public question1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = "Parameterized 1";
    }

    // Parameterized Constructor 2
    public question1(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }

    // Copy Constructor
    public question1(question1 other) {
        this.num1 = other.num1;
        this.num2 = other.num2;
        this.name = other.name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    public static void main(String[] args) {
        question1 defaultConstructor = new question1();
        question1 paramConstructor1 = new question1(10, 20);
        question1 paramConstructor2 = new question1(30, 40, "samiran");
        question1 copyConstructor = new question1(paramConstructor1);

        System.out.println("Default Constructor:");
        defaultConstructor.display();

        System.out.println("\nParameterized Constructor 1:");
        paramConstructor1.display();

        System.out.println("\nParameterized Constructor 2:");
        paramConstructor2.display();

        System.out.println("\nCopy Constructor:");
        copyConstructor.display();
    }
}

