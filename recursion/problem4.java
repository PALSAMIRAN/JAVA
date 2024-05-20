//WAP to find n th fibonacci number
package Recursion;

import java.util.Scanner;

public class problem4 {
    static int fib(int n) {
        //base ecase
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
       /*  //subproblem - recursive work
        int prev = fib(n - 1);
        int prevprev = fib(n - 2);

        //self work
        return prev + prevprev;
      */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println( fib(i));
        }
    }
}
