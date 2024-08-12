/*Q7)Given a number num and a value k.print k multiple times of num.
    Constraints: k>0
    I/P 1:num=12,k=5
    O/P 1:12,24,36,48,60 */

package Recursion;

import java.util.Scanner;

public class problem7 {
   
   // general way to solve 
    /*  public static void main(String[] args) {
         int num = 12;
         int k = 5;
         
         for (int i = 1; i <= k; i++) {
             int res = num * i;
             System.out.println(res);
         }
     }*/
    //  using recursion

    static void printMultiple(int num, int k) {
        //base case 
        if (k == 1) {
            System.out.println(num);
            return;
        }
        //recursive work
        printMultiple(num, k - 1);
        //self work
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        System.out.println("Enter k:"); 
        int k = sc.nextInt();
        printMultiple(num,k);
    }
}
