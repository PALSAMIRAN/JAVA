/*Given a string s , return the number of palindrome substring in it
 * I/P:s="abc"
 * O/P:3
 */

package Strings;

public class problem3 {
    public static boolean ispallindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        Boolean flag = true;//pallindrome
        while (i < j) {
            if (str.charAt(i) != (str.charAt(j))) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abbd";

        //first way to check pallindrome(using stringBuilder)
        
        /*StringBuilder gtr = new StringBuilder(str);
        gtr = gtr.reverse();
        String s = gtr + "";
        if (str.equals(s)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Non Pallindrome");
        }*/

        // second way (using string)
        /*int i = 0;
        int j = str.length() - 1;
        Boolean flag = true;//pallindrome
        while (i < j) {
            if (str.charAt(i) != (str.charAt(j))) {
                flag = false;
                break;
            }
            i++;
            j--;
        
        }
        if (flag == true) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Non Pallindrome");
        }*/
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (ispallindrome(str.substring(i, j)) == true) {
                    System.out.print(str.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThe number of pallindromic substrings are: "+count);
    }
}
