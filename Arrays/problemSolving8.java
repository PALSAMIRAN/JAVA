//practice for 2-D matrix

package Arrays;

import java.util.Scanner;

public class problemSolving8 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q1) Given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1)and
    // (l2,r2).Return the sum of the rectangle
    // from (l1,r1) to (l2,r2). l2>=l1, r2>=r1, 0<=(l1,l2)<n, 0<=(r1,r2)<m.

    // METHOD -1 :- BRUTE-FORCE METHOD
    static int PrefixSumInMatrix(int[][] matrix, int r, int c, int l1, int l2, int r1, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // METHOD -2:- PRE-CALCULATING THE HORIZONTAL SUM FOR EACH ROW IN THE MATRIX

    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;// if(r>0)then only c can be calculated otherwise irt will show error
        int c = matrix[0].length;
        // travarse horizontally to calculte roe-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];// here j loop will start from 1 otherswise in this step
                                                 // index j will be out of bound
            }
        }
    }

    static int PrefixSumInMatrix2(int[][] matrix, int r, int c, int l1, int l2, int r1, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i
            if (r1 >= 1) {
                sum += (matrix[i][r2] - matrix[i][r1 - 1]);
            } else {
                sum += matrix[i][r2];// because if r1 =0 then r1-1 =-1 that means index will be out of bound
            }
        }
        return sum;
    }

    // METHOD -3 :- PREFIX SUM OVER COLUMNS AND ROWS BOTH

    static void findPrefixSumMatrixWithRowAndColumn(int[][] matrix) {
        int r = matrix.length;// if(r>0)then only c can be calculated otherwise irt will show error
        int c = matrix[0].length;
        // travarse horizontally to calculte row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];// here j loop will start from 1 otherswise in this step
                                                 // index j will be out of bound
            }
        }
        // travarse vertically to calculate column wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
        // it will results matrix[i][j]=sumRectangle((0,0),(i,j))
    }

    static int PrefixSumInMatrix3(int[][] matrix, int r, int c, int l1, int l2, int r1, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;
        findPrefixSumMatrixWithRowAndColumn(matrix);
        sum = matrix[l2][r2];
        if (l1 >= 1) {
            up = matrix[l1 - 1][r2];
        }
        if (r1 >= 1) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 >= 1 && r1 >= 1) {
            leftup = matrix[l1 - 1][r1 - 1];

        }

        ans = sum - up - left + leftup;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column number : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX : ");
        printMatrix(matrix);
        System.out.println("Enter l1 : ");
        int l1 = sc.nextInt();
        System.out.println("Enter l2 : ");
        int l2 = sc.nextInt();
        System.out.println("Enter r1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter r2 : ");
        int r2 = sc.nextInt();

        //System.out.println("The sum of the rectagle is : " + PrefixSumInMatrix(matrix, r, c, l1, l2, r1, r2));
        //System.out.println("The sum of the rectangle with second method is : " + PrefixSumInMatrix2(matrix, r, c, l1, l2, r1, r2));
        System.out.println("The sum of the rectangle with third method is : " + PrefixSumInMatrix3(matrix, r, c, l1, l2, r1, r2));

    }
}
