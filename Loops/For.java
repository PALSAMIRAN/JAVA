package Loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int sum = 0;

        /*for (int num = 1; num <= n; num++) {
            System.out.println(num);
            sum += num;
        }
        System.out.println("The sum is "+sum);*/

        //print numbers in reverse order
        for (int num = n; num >= 0; num--) {//num-=2-->num=num -2 decremented by 2

            System.out.println(num);
        }
    }
    
}
