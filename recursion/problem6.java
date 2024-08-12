//given teo numbers p7q, find the value of p^q using a recursive function
package Recursion;

public class problem6 {
    static int power(int p, int q) {
/*//using recursion
if (q == 0) {
    return 1;
}
return power(p, q - 1) * p;*/
        //T.C:-O(q)

        /*// using loop
         //int res=1;
        for (int i = 0; i < q; i++) {
        res = res * p;
        }
        return res;
        */

        //Alternate method using recursion
        if (q == 0) {
            return 1;
        }
        int smallpow = power(p, q / 2);
        if (q % 2 == 0) {//even
            return smallpow * smallpow;
        }
        //odd
            return p * smallpow * smallpow;
        

    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
 