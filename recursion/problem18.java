/*Given an array of integers , print sums of all subsets in it. output sums can be printed in any order
 * i/p:arr[]:{2,3}
 * o/p:0 2 3 5
 */

package Recursion;

public class problem18 {
    static void subsetSum(int arr[], int n, int idx, int sum) {
        if (idx >= n) {
            System.out.println(sum);
            return;
        }
        subsetSum(arr, n, idx+1, sum+arr[idx]);//include
        subsetSum(arr, n, idx+1, sum );//exclude
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5 };
        int n = arr.length;
        subsetSum(arr, n, 0, 0);
}
}
