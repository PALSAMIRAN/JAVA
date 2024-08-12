package Sorting;

public class quickSort {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.println(val + " ");
        }
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
            int pivotIdx = st + count;
            swap(arr, st, pivotIdx);
            int i = st, j = end;

            //elements lesser or equal left to the pivot , greater ->right side of the pivotidx
            while (i < pivotIdx && j > pivotIdx) {
                while (arr[i] <= pivot) {
                    i++;
                }
                while (arr[j] >  pivot) {
                    j--;
                }

                if (i < pivotIdx && j > pivotIdx) {
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }
            
            return pivotIdx;
        
}
    static void quickSortfn(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }
        int pivot = partition(arr, st,end);
         quickSortfn(arr, st, pivot-1);
         quickSortfn(arr, pivot+1, end);
    }
    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 1, 2 };
        System.out.println("Array before Sorting");
        displayArr(arr);
        System.out.println();
        quickSortfn(arr, 0, arr.length-1);
        System.out.println("Array after Sorting");
        displayArr(arr);

    }
}
