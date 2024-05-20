package Conditionals;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER :");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println("Found answer : " + num);
        }
    }
    
}
