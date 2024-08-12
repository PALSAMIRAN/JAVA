package Sorting;

import java.util.Scanner;

public class bubbleSort {
 

    static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//n-1:- because we know only n-1 passes happens
            boolean flag = false;//has any swapping happens? 
            for (int j = 0; j < n - i - 1; j++) {//n-i-1:- as last i elements are already in correct sorted position son we don't need to check
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {//has any swapping happens?
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter array elemnts for " + i + " elements");
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        for (int i : arr) {//foreach loop
            System.out.print(i+" ");
        }
    }
    
}
