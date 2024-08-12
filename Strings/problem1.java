//print all the substring of s

package Strings;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length();j++)// if j=i then during substring fn call it will give an empty str.
            System.out.print(s.substring(i,j)+" ");
        }
    }
}
