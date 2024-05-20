//PRACTICE FOR 2-D ARRAYS

package Arrays;

import java.util.Scanner;

public class problemSolving6 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Q1)WAP TO DISPLAY TRANSPOSE OF MATRIX ENTERED BY THE USER.

    static int[][] transposeMatrix(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    // solve tranposematrix by in place method (not using an extra array)
    //NOTE:-IN THIS METHOD WE CANNOT MAKE A TRANSPOSE OF NON SQUARE MATRIX
    static void transposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    //Q2)Turn a square matrix by 90 degree in a clockwise direction using extra space
    
    static void rotateMatrix(int[][] matrix, int n) {//here as given matrix is square then only n will be called
                                                     // because r==c
        transposeInPlace(matrix, n, n);
        //reverse each row of transposed matrix
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }
    //Q3)Given an integer n,return the first n rows of PASCAL's Traingle. 
    static int[][] PascalTraingle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];//ans[0]=new int[1]
                                    //ans[1]=new int[2].....
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);
        /*System.out.println("Tranposed matrix : ");
        // int[][] ans = transposeMatrix(matrix, r, c);
        //printMatrix(ans);
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);*/
       /*  System.out.println("Matrix after 90 degree rotation: ");
       rotateMatrix(matrix, c);// here r==c (square matrix)
       printMatrix(matrix);*/

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n: ");
       int n = sc.nextInt();
       int[][] ans = PascalTraingle(n);
       printMatrix(ans);

    }
}
