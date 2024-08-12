//Write a program to print all natural numbers from 1 to n using recursion
package Recursion;

import java.util.Scanner;

public class problem1 {
    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        printIncreasing(x);
    }
}
