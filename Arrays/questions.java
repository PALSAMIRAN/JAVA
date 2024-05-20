/*Calculate the sum of all elements in the given array
arr[]={1,5,3}*/
/*Calculate the max value out of all the elements in the array */
/*Search the given element x in the array. If present then return the index else return -1 */
package Arrays;

import java.util.Arrays;

class Firstlecture{
    void firstquestion() {
        int arr[] = { 1, 5, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    void secondquestion() {
        int arr[] = { 1, 5, 3 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }
        System.out.println(ans);

    }
    
    void thirdquestion() {
        int arr[] = { 8, 5, 3,9,15,17 };//if any elements occur twice in a loop then we need to conside the first occurence only that's why we need to use'break'keyword
        int x = 19;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println("Found"+x + "at index"+ans);

    }
}

class secondlecture {
    //count the number of occurences of a particular elemnt x
    void firstquestion() {
        int arr[] = { 10, 15, 14, 10, 18, 10, 19, 17, 10 };
        int x = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("No of occurences are : " + count);
    }

    //Find the last occurrence of an element x in a given array
    void secondquestion() {
        int arr[] = { 10, 15, 14, 10, 18, 10, 19, 17, 10 };
        int x = 10;
        int lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastindex = i;
            }
        }
        System.out.println("The last index will be " + lastindex);
    }

    //count the number of elements strictly greater than value x
    void thirdquestion() {
        int arr[] = { 10, 15, 14, 10, 18, 10, 19, 17, 10 };
        int x = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println("No of elements greater than x is : " + count);
    }

    //Check if the given array is sorted or not
    void fourthquestion() {
        int arr[] = { 10, 15, 14, 10, 18, 10, 19, 17, 10 };
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return;
            } else {
                System.out.println("Not sorted");
                break;
            }
        }
    }
    /*Go through the main code logic only !!!
    static boolean isSorted(int arr[]){
        boolean check=true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }  */

    //Return an array which consist the smallest element and largest elememt of a given array
 static int[] smallandlargestelement(int arr[]) {
         int[] arr = { 10, 15, 1, 19, 20 };
        Arrays.sort(arr);
        int[] arr_1 = { arr[0], arr[arr.length-1] };
        return arr_1;
        
    } 
}

public class questions {
    public static void main(String[] args) {
       /*  Firstlecture obj = new Firstlecture();
       //obj.firstquestion();
       //obj.secondquestion();
       obj.thirdquestion();*/
        
       secondlecture obj = new secondlecture();
       //obj.firstquestion();
       //obj.secondquestion();
       //obj.thirdquestion();
       //obj.fourthquestion();
       //int arr[] = { 10, 15, 1, 19, 20 };
       int arr_1[] = smallandlargestelement();
       System.out.println("Smallest :" + arr_1[0]);
      System.out.println("Largest : "+arr_1[1]);
    }

    private static int[] smallandlargestelement() {
        return null;
    }

}
//PROBLEM ON CALLING SMALLAND LARGEST ELEMENT
