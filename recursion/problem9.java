/*given two numbers x & y. Find the gcd of x and y using recursion
Constraints: x >= 0,y <= 10^6
input : x = 4, y = 9
output : 1
*/

package Recursion;

import java.util.Scanner;

public class problem9 {
    static int iGCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
     } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:"); 
        int x = sc.nextInt();
        System.out.println("Enter y :"); 
        int y = sc.nextInt();
        System.out.println(iGCD(x,y));
        System.out.println(gcd(x,y));

    }
}
