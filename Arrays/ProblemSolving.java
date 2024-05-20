package Arrays;

import java.util.Scanner;

public class ProblemSolving {

    //Q1)FIND THE TOTAL NUMBER OF PAIRS IN THE ARRAY WHOSE SUM IS EQUAL TO THE GIVEN VALUE X. 
    static void targetsum1() {
        int[] arr = { 4, 6, 3, 5, 89, 2 };
        int target = 7;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if ((arr[i] + arr[j]) == target) {
                    count++;
                    System.out.print("(" + arr[i]);
                    System.out.print(",");
                    System.out.print(arr[j] + ")");
                    System.out.println();
                }
            }
        }
        System.out.println("Total no of pairs are :" + count);
    }

    //Q2)COUNT THE NUMBER OF TRIPLETS WHOSE SUM IS EQUAL TO THE GIVEN VALUE X.
    static void targetsum2() {
        int[] arr = { 1, 4, 5, 6, 3 };
        int target = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        count++;
                        System.out.print("(" + arr[i]);
                        System.out.print(",");
                        System.out.print(arr[j]);
                        System.out.print(",");
                        System.out.print(arr[k] + ")");
                        System.out.println();
                    }
                }
            }
        }
        System.out.println(count);
    }

    //Q3)FIND THE UNIQUE NUMBER IN A GIVEN ARRAY WHERE ALL THE ELEMENTS ARE BEING REPEATED (only for +ve numbers)TWICE WITH ONE VALUE BEING UNIQUE

    static int pattern1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    //Q4)FIND THE SECOND LARGEST ELEMENT IN A GIVEN ARRAY(ans will always exist)

    static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;//it gives the range of integer
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findsecondmax(int[] arr) {
        int max = findmax(arr);
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }

    //Q5)FIND THE VALUE THAT IS REPEATING IN AN ARRAY. IF NO VALUE IS REPEATING RETURN -1

    static int firstrepeatvalue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];//return statement ends the method
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //targetsum1();
        //targetsum2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //for pattern1
        //System.out.println("Unique element : "+pattern1(arr));
        //for pattern2(Q4)
        // System.out.println("Second maximum elements :"+findsecondmax(arr));
        //for first repeat value(Q5)
        System.out.println("First repeat value is : " + firstrepeatvalue(arr));
    }
}

