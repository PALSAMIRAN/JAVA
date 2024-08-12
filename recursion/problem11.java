//print the max value of the array [3,10,3,2,5],where arr.length>=1

package Recursion;

public class problem11 {

    static int max(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int smallAns = max(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }

    //find the sum of elements of the array .
    static int sum(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int total = sum(arr, idx + 1);
        return arr[idx] + total;
    }

public static void main(String[] args) {
    int arr[] = { 3, 10, 3, 2, 5 };
    int idx = 0;
    System.out.println(max(arr, 0));
    System.out.println(sum(arr, 0));   
}
}
