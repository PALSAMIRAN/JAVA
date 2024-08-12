/*Given an array of n integers and a target value x.Print wheather x exists in the array or not.
 * Constraints:0<=n<=10^6, -10^8<=x<=10^8 ,   -10^8<=a[i]<=10^8
 * I/P1: n=8,x =14, arr=[4,12,54,14,3,8,6,1]            O/P:Yes
 * I/P2:n=1, x=9,arr=[2]                                O/P:No
*/
package Recursion;

import java.util.Scanner;

public class problem12 {
    static boolean search(int[] arr, int n, int target, int idx) {
        //base case
        if (idx >= n) {
            return false;
        }
        //self work
        if (arr[idx] == target)
            return true;
        //recursive work
        return search(arr, n, target, idx + 1);// same as below 

        /*if (search(arr, n, target, idx + 1)) {
            return true;
        } else {
            return false;
        }*/
    }
    
    //return index of target if target in array , otherwise return -1
    static int findIndex(int[] arr, int target, int n, int idx) {
        if (idx >= n)
            return -1;
        if (arr[idx] == target) {
            return idx;
        }
        return findIndex(arr, target, n, idx + 1);
    }
    
    /*Given an array arr of size N and an integer x. The task is to find all the indices of integer x in the array
     * I/P:1,2,3,2,2,5                  X=2
     * O/P:1,3,4
     */

    static void findAllIndices(int []arr, int n, int target, int idx){
        if (idx >= n) {
            return;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        findAllIndices(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array values for " + i + " elements ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        //int n = arr.length;
        if (search(arr, n,target, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
       // System.out.println(findIndex(arr, target, n, 0));
        findAllIndices(arr, n, target,  0);
    }
}
