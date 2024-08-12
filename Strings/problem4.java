/*Reverse each word of a string
 * I/P: I am a cricketer
 * o/p:I ma a retekcirc
 */

package Strings;

public class problem4 {
    public static void main(String[] args) {
        String str = "I am a cricketer";
        String ans = " ";//This initializes an empty string to store the final result.
        StringBuilder s = new StringBuilder("");//his initializes a StringBuilder object to build each word in reverse.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {//If the character is not a space, it is added to the StringBuilder s.
                s.append(ch);
            } else {//When a space is encountered:
                s.reverse();//The StringBuilder s is reversed.
                ans += s;
                 ans += " ";//A space is added to separate words.
                s.delete(0, s.length());//The StringBuilder is cleared for the next word.
                s = new StringBuilder("");//A new StringBuilder object is created.
            }
        }
        s.reverse();//After the loop, the last word is not followed by a space, so the reverse
                    // and append steps are done one more time:
        ans += s;
        System.out.println(ans);
    }
}
