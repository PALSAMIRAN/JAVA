package Sorting;

import java.util.Scanner;

public class selectionSort {
    static void selection(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){//i represents current index

            //find the minimum element in unsorted part of the array
            int min_index= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            //swap current element and minimum element --> current index i will have correct element
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
