package Recursion;

import java.util.ArrayList;

public class problem13 {
    static ArrayList<Integer> allIndices(int[] arr, int n, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //base case
        if (idx >= n) {
            return ans;//return empty arraylist
        }
   
        //self work
        if (arr[idx] == target) {
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallAns = allIndices(arr, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 4, 5, 4 };
        int target = 4;
        int n = arr.length;
        ArrayList<Integer> ans = allIndices(arr, n, target, 0);
        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
