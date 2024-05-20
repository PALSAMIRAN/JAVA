//package college;
 public class complex {
    private double real;
    private double imaginary;

    // Constructor
    public complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public complex add(complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new complex(realSum, imaginarySum);
    }
    //Method to subtract two complex number
        public complex subtract(complex other) {
        double realSub  = this.real - other.real;
        double imaginarySub = this.imaginary - other.imaginary;
        return new complex(realSub, imaginarySub);
    }
    // Method to get the string representation of the complex number
    
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        complex num1 = new complex(3, 2);
        complex num2 = new complex(2, 1);

        complex sum = num1.add(num2);
        System.out.println("Sum: " + sum);
        
        complex subtract = num1.subtract(num2);
        System.out.println("Subtract: " + subtract);

    }
}