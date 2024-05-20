import java.util.Scanner;

public class suvam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int percentage = sc.nextInt();

        if (percentage < 25) {
            System.out.println("Grade= D");
        } else if (percentage >= 25 && percentage < 45) {
            System.out.println("Grade= C");
        } else if (percentage >= 45 && percentage < 50) {
            System.out.println("Grade= B");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade= B+");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("Grade= A");
        } else if (percentage > 80 && percentage <= 100) {
            System.out.println("Grade= A+");
        } else {
            System.out.println("Invalid Input");
        }
    }
}

