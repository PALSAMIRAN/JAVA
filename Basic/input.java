package Basic;

import java.util.Scanner;/*To keep your code readable and less verbose, a Java Scanner import is recommended.
                         When you add an import statement to your code, you are telling the Java compiler 
                         that you need access to a class that isn't accessible by default.*/

public class input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // TAKING INPUT AS AN INTEGER
            System.out.println("Enter your jersey number: ");
            int num_1 = sc.nextInt();
            System.out.println("Your jersey number is: " + num_1);

            // TAKING INPUT AS A STRING
            System.out.println("Enter your name :");
            String name = sc.next();/*  SC.NEXT CAN NOT READ ANY SPACE;EXM: if we taking a input "SAMIRAN PAL" IT
                                  WILL PRINT ONLY "SAMIRAN"*/
            System.out.println("Your jersey name is: " + name);

            // TAKING INPUT AS A SENTENCE
            System.out.println("ENTER YOUR FULL NAME:");
            String fullname = sc.nextLine();
            System.out.println("Your full nmae in jersey is :" + fullname);
        }
    }
}

// JAVA SCANNER METHODS TO TAKE
// INPUT:-nextInt(),nextFloat(),nextBoolean(),nextLine(),next(),nextByte(),nextDouble(),nextShort(),nextLong()