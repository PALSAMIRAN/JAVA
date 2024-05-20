package Basic;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount: ");
        int p = sc.nextInt();

        System.out.println("Enter rate of return : ");
        float r = sc.nextFloat();

        System.out.println("Enter time : ");
        float t = sc.nextFloat();

        System.out.println("principle " + p);
        System.out.println("Rate of return"+r);
        System.out.println("Time " + t);
        
        float i = (p * r * t) / 100;
        System.out.println("Enter interest : " + i);
    }
}
