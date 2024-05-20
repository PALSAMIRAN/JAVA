//Q)FIND THE SUM OF THE FOLLOWING SERIES S=1-2+3-4....n

package Loops;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if ((i % 2) != 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println(sum);

    }
}
