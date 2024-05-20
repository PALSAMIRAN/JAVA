package Loops;

public class Continue {
    public static void main(String[] args) {
        int i = 1;
        /* lables*/ /*myloop:for (; i <= 50; i++) {
            if (i % 3 == 0) {
                continue myloop;
            }
            System.out.println(i);
        }*/
        // USING WHILE LOOP

        while (i <= 50) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
        }
        System.out.println(i);
        i++;
    }
    
}
