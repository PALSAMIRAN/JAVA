package Loops;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
//while loop
       /*  while (num != -1) {
          sum += num;
          num = sc.nextInt();
       }
       System.out.println(sum);*/

       //Do while loop

       do{
        sum+=num;
        num = sc.nextInt();

    } while (num != -1);
    System.out.println(sum);
    }
}
