//ADD TWO NUMBERS USING METHODS

package NumberSystem;

import java.util.Scanner;

class algebra {//here we are  not using any access modifier that's why it will take default access modifier
    int add(int a, int b) {
        //Method forming
        int ans = a + b;
        return ans;
    }
// HOW TO CONSTRUCTOR CALLED?
    algebra() {
        System.out.println("CONSTRUCTOR OF ALGEBRA CLASS CALLED");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        //MAKING AN OBJECT IN MAIN
        algebra obj = new algebra();//algebra()--->constructor
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("The answer is : ");
        // Method calling
        int ans =obj.add(x, y);
        System.out.println(ans);
    }
}
