package Arrays;

import java.lang.reflect.Array;
import java.security.Principal;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    static void ChangeArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }



    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The array is :");
        printArray(arr);
        
        //TRYING TO COPY ARR TO ARR_2(ARRAY REFERENCE)
        //int[] arr_2 = arr;
        //int[]arr=arr.clone();//here original array will be same 
        //int arr_2[] = Arrays.copyOf(arr, arr.length);//same function as clone.It has two parameters one is arr and another is how long we want to copy
        int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length);//it has three parameters one is array name, starting point another is ending point
        System.out.println("The copied array is :");
        printArray(arr_2);
        
        //CHANGING SOME VALUES OF arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("Original array after changing arr_2");
        printArray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
        
/* 
        //FOR CHANGE ARRAY
        int arr[] = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;

        ChangeArray(arr);
        printArray(arr);
        */
    }
}
    

