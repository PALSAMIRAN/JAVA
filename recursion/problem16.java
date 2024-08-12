/*Given a string,write a method to return all its subsequences in an Arraylist.A string is a subsequence of a given 
string that is generated by deleting some character of a given string without changing its order.
I/P:abc
O/P:a,b,c,ab,bc,ac,abc  */
package Recursion;

import java.util.ArrayList;

public class problem16 {
   static ArrayList<String> getSSQ(String s){
       ArrayList<String> ans = new ArrayList<>();
       //base case
       if (s.length() == 0) {
           ans.add(" ");
        return ans;
        }
       char curr = s.charAt(0);//a
       ArrayList<String> smallAns = getSSQ(s.substring(1));//["bc" "b" "c" " "]
       //ans=["bc" "b" "c" " " "abc" "ab" "ac" "a"]
       for (String ss : smallAns) {
           ans.add(ss);//bc
           ans.add(curr + ss);//abc
       }
       return ans;
   }
   
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss: ans){
            System.out.println(ss);;
        }
    }
}