package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int num = 1;
        int sum =0;

        while (num <= n) {
            // System.out.println(num);
            sum += num;
           
            num++;
          System.out.println(sum);
         }

    }
    
}
