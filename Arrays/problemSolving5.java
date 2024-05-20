//  2D Arrays
package Arrays;

import java.util.Scanner;

public class problemSolving5 {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//row
            for (int j = 0; j < arr[i].length; j++) {//column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    //Q1) MATRIX ADDITION
    static void add(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printArray(sum);

    }


    //Q2)MATRIX MULTIPLICATION

    static void matrixmultiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible -  wrong dimension.....");
            return;
        }
        int [][]mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {//mul[i][j]= i-th row of a *j-th col of b
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("MULTIPLICATION OF 2 MATRICES : ");
        printArray(mul);
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int r = sc.nextInt();
        System.out.println("Enter column : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter "+r*c+" elements");
        for (int i = 0; i < r; i++) {//row
            for (int j = 0; j < c; j++) {//column
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The final 2-D array is : ");
        printArray(arr);*/

        /*int [][]arr2={{4,5,6},
                      {7,9,12},
                     { 12, 16, 7 }
                };
        printArray(arr2);*/

//MATRIX ADDITION & MULTIPLICATION
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of array a: ");
        int r1 = sc.nextInt();
        System.out.println("Enter column of array a : ");
        int c1 = sc.nextInt();
        
        int[][] a = new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elements");
        for (int i = 0; i < r1; i++) {//row
            for (int j = 0; j < c1; j++) {//column
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX a ["+r1+"]["+c1+"]: ");
        printArray(a);
        
        
        System.out.println("Enter rows of array b : ");
        int r2 = sc.nextInt();
        System.out.println("Enter column of array b : ");
        int c2 = sc.nextInt();
        
        int[][] b = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elements");
        for (int i = 0; i < r2; i++) {//row
            for (int j = 0; j < c2; j++) {//column
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIX b ["+r2+"]["+c2+"]  : ");
        printArray(b);
        
        System.out.println("Sum of matricx a and b is : ");
        //add(a,b ,r1,c1,r2,c2);//FOR ADDITION 
        //NOTE:- the sequence of passing arguments of method must be in same order
        matrixmultiplication(a, r1, c1, b, r2, c2);//FOR MULTIPLICATION
 

    }
}
