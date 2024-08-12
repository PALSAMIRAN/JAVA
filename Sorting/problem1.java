/*Given an integer array arr , move all 0's to the end of it while maintaining the relative order of the 
 *non zero elements.
 *Note:- you must do this without making a copy of the array.
 *I/P:-  0 5 0 3 4 2  
 *O/P: - 5 3 4 2 0 0 
 */
package Sorting;

public class problem1 {
 
    public static void main(String[] args) {
        int[] arr = { 0, 5, 0, 3, 4, 2 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int val : arr) {
            System.out.print(val+ " ");
        }
    }
}
