package Arrays;

import java.util.Scanner;

//lecture 4
public class Problemsolving2 {
    static void swap(int a, int b) {
        System.out.println("values before Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b:" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("values after Swapping: ");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    static void swapwithoutTemp(int a, int b) {
        System.out.println("values before Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b:" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("values after Swapping: ");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    //reverse an array using another array

    static int[] revereseArray(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     ans[j++] = arr[i];
        // }
        int i = n - 1;
        while (i >= 0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    //reverse an array not using another array

    static void reverseArrayinplace(int[] arr) {// in place means without using extra memory array will be reveresed.
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }

    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    //Rotate the given array "a"by k steps .where k is non negative and can be greater than n
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    
    //rotate an array without using extra space
   
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }
    
    //Check given number is present in the array or not

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /*int a = 9;
        int b = 3;*/
        //swap(a, b);
        // swapwithoutTemp(a, b);
        //int arr[] = { 1, 2, 3, 4, 5 };
       /*  int[] ans = revereseArray(arr);
       printArray(ans);*/
       /*reverseArrayinplace(arr);
       printArray(arr);*/

       //for rotate array & rotate array without using extra space

      /*  Scanner sc = new Scanner(System.in);
       System.out.println("Enter array size : ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter " + n + " elements");
       for (int i = 0; i < n; i++) {
       arr[i] = sc.nextInt();
       }
      
       System.out.println("Enter k :");
       int k = sc.nextInt();
       System.out.println("Original array : ");
       printArray(arr);
      
       //int[] ans = rotate(arr, k);
       rotateInPlace(arr, k);
       System.out.println("Array after rotation : ");
       printArray(arr);
       */
      //present in array or not
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter array size : ");
      int n = sc.nextInt();
      int[] arr = new int[n];

      System.out.println("Enter " + n + "elements");
      for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
      }
      int[] frequency = makeFrequencyArray(arr);
      System.out.println("Enter no of queries : ");
      int q = sc.nextInt();
      while (q > 0) {
          System.out.println("Enter number to be searched:");
          int x = sc.nextInt();
          if (frequency[x] > 0) {
              System.out.println("Yes");
          } else {
            System.out.println("No");
        }
          q--;
      }
    }
}
