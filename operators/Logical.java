package operators;

public class Logical {
    public static void main(String[] args) {
        int p = 14, q = 10, r = 5;
        
        //AND OPERATOR
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));
        
        //OR OPERATOR
        System.out.println((p > q) || (p > r));
        System.out.println((p > q) || (p > r));
        
        //NOT OPERATOR
        System.out.println(!(p == q));
        System.out.println(!(p<q));
        

    }
}
