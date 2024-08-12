/*Given a string , the task is toogle all the characters of a string i.e. to convert uppercase 
to lowercase and vice versa
I/P:Physics
O/P:pHYSICS
*/
package Strings;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        
        //toggle using stringBuilder
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;//capital letter(let)
            char ch = s.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;//65
            if (asci >= 97)
                flag = false;//small letter(let)
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                s.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char) asci;
                s.setCharAt(i, dh);
            }

        }

        // toggle using string -->its time complexity very high thats why use stringBuilder form
        String s1 = "Samiran";
        for (int i = 0; i < s1.length(); i++) {
            boolean flag = true;//capital letter(let)
            char ch = s1.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;//65
            if (asci >= 97)
                flag = false;//small letter(let)
            if (flag == true) {
                asci += 32;
                char dh = (char) asci;
                s1= s1.substring(0, i)+dh+s1.substring(i+1);
            } else {
                asci -= 32;
                char dh = (char) asci;
                s1= s1.substring(0, i)+dh+s1.substring(i+1);
            }

        }
        System.out.println(s);
        System.out.println(s1);
    }
}
