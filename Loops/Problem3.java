//Q)COUNT THE NUMBER OF DIGITS FOR A GIVEN NUMBER n
package Loops;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numdigit = 0;

        while (n > 0) {
            n = n / 10;
            numdigit++;
        }
        System.out.println(numdigit);
    }

    
}
