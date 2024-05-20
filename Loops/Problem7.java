//Q)PRINT THE FIRST N FACTORIAL NUMBERS

package Loops;

import java.util.Scanner;


public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int fact=1;
        for ( i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println("Factorial of "+i +" is :"+fact);
        }
       

    }
    
}
