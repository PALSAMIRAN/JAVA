package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ProblemOfArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        Collections.reverse(list);
        System.out.println("Reversed List :" + list);
        Collections.sort(list);
        System.out.println("Ascending order : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order "+list);


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("to");
        l1.add("Techno International New Town");
        System.out.println("OG" + l1);
        Collections.sort(l1,Collections.reverseOrder(null));
        System.out.println("Sorted"+ l1);
    }
}
