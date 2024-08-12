/*Q8)Given a number n.Find the sum of natural numbers till n but with alternate signs.
    If n =5 then you have to return 1-2+3-4+5 = 3 as your answer
    Constraints :0<=n <=10^6
    I/P 1:10
    O/P 1:-5*/

package Recursion;

import java.util.Scanner;

public class problem8 {
    static int seriesSum(int n) {
        if (n == 0) {
            return 0;

        }
        if (n % 2 == 0) {//even
            return seriesSum(n - 1) - n;
        } else {//odd
            return seriesSum(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:"); 
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
