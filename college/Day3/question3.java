package college.Day3;

public class question3 {
        // Outer class variable
        private static int outerVariable = 10;
    
        // Outer class static method
        public static void outerMethod() {
            System.out.println("Outer method called.");
        }
    
        // Static nested class
        public static class NestedClass {
            // Nested class variable
            private int nestedVariable;
    
            public NestedClass(int nestedVariable) {
                this.nestedVariable = nestedVariable;
            }
    
            public void display() {
                System.out.println("Outer Variable: " + outerVariable);
                System.out.println("Nested Variable: " + nestedVariable);
            }
        }
    
        public static void main(String[] args) {
            // Creating an instance of the static nested class
            NestedClass nestedObj = new NestedClass(20);
    
            // Accessing the nested class method
            nestedObj.display();
        }
    }
    

