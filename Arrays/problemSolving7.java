//practice for 2-D matrix

package Arrays;

import java.util.Scanner;

import javax.annotation.processing.Generated;

public class problemSolving7 {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q1)GIVEN AN N*M MATRIX "a", return all elements of the matrix in spiral order
    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int toprow = 0, bottomrow = r - 1, leftcolumn = 0, rightcolumn = c - 1;
        int totalelements = 0;
        while (totalelements < r * c) {
            // toprow-->leftcol to rightcol
            for (int j = leftcolumn; j <= rightcolumn && totalelements < r * c; j++) {
                System.out.print(matrix[toprow][j] + " ");
                totalelements++;
            }
            toprow++;
            // rightcol-->toprow to bottomrow
            for (int i = toprow; i <= bottomrow && totalelements < r * c; i++) {
                System.out.print(matrix[i][rightcolumn] + " ");
                totalelements++;

            }
            rightcolumn--;
            // bottomrow-->rightcol to leftcol
            for (int j = rightcolumn; j >= leftcolumn && totalelements < r * c; j--) {
                System.out.print(matrix[bottomrow][j] + " ");
                totalelements++;
            }
            bottomrow--;
            // leftcol-->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && totalelements < r * c; i--) {
                System.out.print(matrix[i][leftcolumn] + " ");
                totalelements++;
            }
            leftcolumn++;
        }
    }

    // Q2)GIVEN A POSITIVE INTEGER N , GENERATE AN N*N MATRIX FILLED WITH ELEMENTS
    // FROM 1 TO N^2 IN SPIRAL ORDER
    static int[][] genrateSpiralMatrix(int n) {
        int toprow = 0, bottomrow = n - 1, leftcolumn = 0, rightcolumn = n - 1;
        int current = 1;
        int [][] matrix = new int[n][n];        
        while (current <= n * n) {
            // toprow-->leftcol to rightcol
            for (int j = leftcolumn; j <= rightcolumn && current <= n * n; j++) {
                matrix[toprow][j] = current;
                current++;
            }
            toprow++;
            // rightcol-->toprow to bottomrow
            for (int i = toprow; i <= bottomrow && current <= n * n; i++) {
                matrix[i][rightcolumn] = current;
                current++;

            }
            rightcolumn--;
            // bottomrow-->rightcol to leftcol
            for (int j = rightcolumn; j >= leftcolumn && current <= n * n; j--) {
                matrix[bottomrow][j] = current;
                current++;
            }
            bottomrow--;
            // leftcol-->bottomrow to toprow
            for (int i = bottomrow; i >= toprow && current <= n * n; i--) {
                matrix[i][leftcolumn] = current;
                current++;
            }
            leftcolumn++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter rows and columns: ");
         * int r = sc.nextInt();
         * int c = sc.nextInt();
         * int[][] matrix = new int[r][c];
         * System.out.println("Enter " + r * c + " elements : ");
         * for (int i = 0; i < r; i++) {
         * for (int j = 0; j < c; j++) {
         * matrix[i][j] = sc.nextInt();
         * }
         * //System.out.println();
         * }
         * System.out.println("ORIGINAL MATRIX :- ");
         * printMatrix(matrix);
         * System.out.println("SPIRAL ORDER OF THE MATRIX IS : ");
         * printSpiralOrder(matrix, r, c);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[][] matrix = genrateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
