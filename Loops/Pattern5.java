// Q)      *
//        ***
//       *****
//      *******
//     *********

package Loops;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            //FOR (r-i) SPACES
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            //FOR (2*i - 1) STARS
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
       
    }
}
