// Q)   ******
//      *****
//      ****
//      ***
//      **
//      *

package Loops;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : " );
        int r = sc.nextInt();
        

        for (int i = 1; i <= r; i++) {// for(i = r;i>=1;i--)   for(j=1;j<=i;j++)   Reverse process
            for (int j = 1; j <= (r+1-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
