//Q)FIND THE SUM OF DIGITS IN A GIVEN NUMBER N

package Loops;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while ( n>0) {
            sum += (n % 10);
             
            n = n / 10;
        }
        System.out.println(sum);
    }
    
}
