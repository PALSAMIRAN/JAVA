/*Give an array of names of friuits: you are supposed to sort it in lexicographical order using the selection sort
 * i/p:["papaya","lime","watermelon","apple","mango","kiwi"]
 * o/p:["apple","kiwi","lime","mango","papaya","watermelon"]
  */

package Sorting;

public class problem2 {
    static void sortFruits(String fruits[]) {
        int n = fruits.length;
        for (int i = 0; i < n; i++) {
           int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index])<0) {
                    min_index=j;
                }
             }
             String temp= fruits[i];
             fruits[i]=fruits[min_index];
             fruits[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        sortFruits(fruits);
        for (String val : fruits) {
            System.out.print(val+" ");
        }
    }
}
