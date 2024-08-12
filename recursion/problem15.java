// Q)write a program to reverse a string using recursion
// Q2)wirte a program to check given string is pallindrome or not

package Recursion;

import java.util.Scanner;

public class problem15 {

    static String reverse(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    //Second method of checking pallindrome (using own method)

    static boolean isPallindrome(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && isPallindrome(s, l + 1, r - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s, 0));
        /*First method of pallindrome check(using reverse method)
        
        rev = reverse(s, 0);
        if (rev.equals(s)) {
            System.out.printf("%s is Pallindrome",s);
        } else {
            System.out.printf("%s is Not Pallindrome",s);
        }*/
        System.out.println(isPallindrome(s, 0, s.length()-1));
    }
}
