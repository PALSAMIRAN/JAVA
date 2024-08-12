/*Given a string , wam to print all its subsequences */

package Recursion;

public class problem17 {
    static void printSSQ(String s, String currAns) {
        
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);

        //char curr-->chooses to be a part of currAns
        printSSQ(remString, currAns + curr);
        //char curr-->does not choose to be a part of currAns
        printSSQ(remString, currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
