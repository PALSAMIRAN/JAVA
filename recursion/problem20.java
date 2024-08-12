/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the 
number could represent . Return the answer in any order
I/P:digits: "23"
O/P:["ad","ac","af","bd","be","bf","cd","ce","cf"] */

package Recursion;

public class problem20 {
    static void combo(String dig, String res,String[] kp ) {
        if (dig.length() == 0) {
            System.out.println(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for (int i = 0; i < currChoices.length(); i++) {
            combo(dig.substring(1),res+currChoices.charAt(i),kp);
        }
    }
    public static void main(String[] args) {
        String dig = "23";
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
                    //  0   1       2       3   4       5       6       7       8   9
        combo(dig, "", kp);
    }
}
