/*The string should be compressed such that consecutive duplicates of characters are replaced with the character and
 * followed by the number of consecutive duplicates
 * I/P:aaabbbbccddde
 * o/p:a3b4c2d3e
 */

package Strings;

public class problem5 {
    public static void main(String[] args) {

        String s = "aaabbbbccdddeeeef";
        String ans = " " + s.charAt(0);//initialize first char in the ans array
        int count = 1;//as first char already in ans 
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                }
                count = 1;
                ans += curr;
            }
        }
        if (count > 1)
            ans += count;
        System.out.println(ans);
    }
}
