//PREFIX SUM
package Arrays;

import java.util.Scanner;

public class ProblemSolving4 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    
    //Q1)Given an integer array "a",return the prefix sum / running sum in the same array without creating a new array
    //prefix sum (pref[i]= (j=0to i)a[j])summation of a[j])

    static int[] prefixsum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {

            pref[i] = pref[i - 1] + arr[i];
        }
        return pref;
    }
    //Calculate prefix sum using only one array

    static void newprefixsum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            arr[i] += arr[i - 1];

        }
    }
    

    //Q2) Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given 
    //    range of indices from lto r(both included). NOTE:-THE VALUES OF l AND r IN QUERIES FOLLOW 1-BASED INDEXING

    // in java ,in case of 1 based indexing array 0-th index is valid but it will store 0; 
    static int[] makeprefixSumArray(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {

        arr[i] += arr[i - 1];

    }
    return arr;
}

//Q3)Check if we partition an array into two subarrays with equal sum. More formally check that the prefix sum 
//   of a part of the array is equal to the suffix sum of rest of the array.
static int findArraySum(int[]arr) {
        int totalsum = 0;
    for (int i = 0; i < arr.length; i++) {
        totalsum += arr[i];
    }
    return totalsum;
}
static boolean equalsumPartition(int []arr) {
    int totalsum = findArraySum(arr);

    int prefixsum = 0;
    for (int i = 0; i < arr.length; i++) {
        prefixsum += arr[i];
        int suffixsum = totalsum - prefixsum;
        if (prefixsum == suffixsum) {
            return true;
        }

    }
       return false;

} 

    public static void main(String[] args) {
        //Q1) 
      /* Scanner sc = new Scanner(System.in);
      System.out.println("Enter no of elements : ");
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter " + n + " elements");
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      System.out.println("Original array : ");
      printArray(arr);
      //     int[] pref = prefixsum(arr);
      //    System.out.println("Sorted array : ");
      //    printArray(pref);
       newprefixsum(arr);
       System.out.println("Sorted array : ");
       printArray(arr);*/

       //Q2) 
       /*Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of elements : ");
       int n = sc.nextInt();
       int arr[] = new int[n+1];
       System.out.println("Enter " + n + " elements");
       for (int i = 1; i <= n; i++) {
           arr[i] = sc.nextInt();
       }
       int[] prefixsum = makeprefixSumArray(arr);
       System.out.println("Enter no of queries : ");
       int queries = sc.nextInt();
       while (queries-- > 0) {
       System.out.println("Enter range : ");
          int l = sc.nextInt();
          int r = sc.nextInt();
          int ans = prefixsum[r]-prefixsum[l-1];
          System.out.println("Sum "+ans);
       } */

        //Q3)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
                System.out.print("Enter "+n+" elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal sum possible :"+equalsumPartition(arr));
        }
    }
    

