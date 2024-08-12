//Q) Given an array , print all its values using recursion

package Recursion;

import java.util.Scanner;

public class problem10 {

    static void printArray(int[] arr, int idx) {
      //base case
        if (idx == arr.length) {
            return;
        }
        //self work
        System.out.println(arr[idx]);
        //recursive work
        printArray(arr, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idx = 0;
        System.out.println("Enter n: ");
        int n =sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elements for " + i + " elements");
            arr[i] = sc.nextInt();
        }
        printArray(arr, 0);

    }
}
