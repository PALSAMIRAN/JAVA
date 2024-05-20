package Arrays;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        //WRAPPER CLASS
        /*Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);
*/
        ArrayList<Integer> l1 = new ArrayList<>();
        
        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(1));

        //print with for loop

       /*  for (int i = 0; i < l1.size(); i++) {//here l1.size()contains "()" because its a method .
           System.out.println(l1.get(i));
       }*/
        
        //printing the array list directly
        System.out.println(l1);

        //adding an element at some index i [5 100 6 7 8 ]
        l1.add(1, 100);
        System.out.println(l1);

        //modifying an element at index i

        l1.set(1, 10);
        System.out.println(l1);
        
        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));//this method contains a boolean value if you print this line then you can see it
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class ,you can put anything inside l
        ArrayList l = new ArrayList<>();
        l.add("pqresse");
        l.add(5.99999);
        l.add(true);
        l.add(1);
        System.out.println(l);
    }
}
