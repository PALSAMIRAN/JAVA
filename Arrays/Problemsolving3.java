//TWO POINTERS APPROACH
package Arrays;

import java.util.Scanner;

public class Problemsolving3 {
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    //Sort an array consisting of only 0s and 1s
    static void sortzerosAndones(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        //count no of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroes++;
        }
        //0 to zeroes-1 :0 ,Zeroes to n-1:1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void newsortzeroesAndones(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;

            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    static void sortArrayByParity(int[] arr) {
        //parity means any number is even or odd if number is even then it is called even parity .
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    //Q3)Given an integer array 'a' is non-decreasing order,return an array of the squares of 
    //each number sorted in non decreasing order
    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];//here in k++ at first k==0 th index will fill 
                                                 //then k=1 will fill and so on.. actually arr[k]=...;k++;
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            
            }
        }
        return ans;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of elements");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Original Array : ");
            printArray(arr);
            //sortzerosAndones(arr);
           // newsortzeroesAndones(arr);// HERE TWO POINTER IS USED 1)LEFT,2)RIGHT THAT'S WHY IT IS CALLED TWO POINTER'S APPROACH
           //sortArrayByParity(arr);
           //System.out.println(" SORTED ARRAY ");
          // printArray(arr);
           int[] ans = sortSquare(arr);
           System.out.println(" SORTED ARRAY ");
           reverse(ans);
//if we don't want to use reverse function then we need to use "k-- "in both cases and "k" will be initialized in "n-1";
            printArray(ans);

        }
}




