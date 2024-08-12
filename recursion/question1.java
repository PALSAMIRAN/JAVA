package Recursion;

import java.util.Scanner;

//write a program to print all natural numbers from 1 to n using recursion

public class question1 {

    static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        printIncreasing(n - 1);
    System.out.println(n);
}    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
