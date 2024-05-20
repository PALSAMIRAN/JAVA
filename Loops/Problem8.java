//Q)GIVEN 2 NUMBERS a AND b.FIND a raise to the power b.

package Loops;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println("ANSWER IS "+ result);

    }
}
