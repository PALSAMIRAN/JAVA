//find the value of n!(factorial n)
package Recursion;

import java.util.Scanner;

public class problem3 {
    static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Result = "+ factorial(n));

    }
}

