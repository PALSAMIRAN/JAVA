// Q) Remove all occurences of 'a' from string s="abcax"

package Recursion;

import java.util.Scanner;

public class problem14 {
    // First method

    static String RemoveA(String s, int idx) {
        //base case
        if (idx == s.length())
            return "";
        //recursive work
        String smallAns = RemoveA(s, idx + 1);
        char currchar = s.charAt(idx);
        //self work
        if (currchar != 'a') {
            return currchar + smallAns;
        } else {
            return smallAns;
        }
    }

    //Second Method
    static String RemoveA2(String s) {
        if (s.length() == 0) {
            return "";
        }
        String smallAns = RemoveA2(s.substring(1));
        char currchar = s.charAt(0);
        //self work
        if (currchar != 'a') {
            return currchar + smallAns;
        } else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RemoveA(s,0));
        System.out.println(RemoveA2(s));
    }
}
