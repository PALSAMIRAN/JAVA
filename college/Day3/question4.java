package college.Day3;
public class question4 {
    private int outerVariable = 10;

    // Member Inner Class
    class InnerClass {
        private int innerVariable = 20;

        public void display() {
            System.out.println("Outer Variable: " + outerVariable);
            System.out.println("Inner Variable: " + innerVariable);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the OuterClass
        question4 outerObj = new question4();

        // Create an instance of the InnerClass
        question4.InnerClass innerObj = outerObj.new InnerClass();

        // Call the display method of the InnerClass
        innerObj.display();
    }
}
