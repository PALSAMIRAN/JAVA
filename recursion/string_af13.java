package Recursion;

import java.util.Scanner;

public class string_af13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);

        //String s1 = sc.nextLine();
        //System.out.println(s1);
        char ch = s.charAt(0);//print the element in that specific index
        System.out.println(ch);
        for (int i = 0; i < s.length(); i++) {//here s.length is a function
            System.out.println(s.charAt(i));
        }
        System.out.println(s.substring(1, 4));
    }
}