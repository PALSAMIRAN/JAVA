//Write a program to print all natural numbers from n to 1 using recursion
package Recursion;

import java.util.Scanner;

public class problem2 {
    static void printDecreasing(int x) {
        //base case
        if (x == 1) {
            System.out.println(x);
            return;
        }
        //self work
        System.out.println(x);
        //recursive work
        printDecreasing(x - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");

        int n = sc.nextInt();
        printDecreasing(n);
    }
}
