package operators;

public class Bitwise {
    public static void main(String[] args) {
        int p = 9, q = 10;

        System.out.println(p | q);//bitwise or
        System.out.println(p & q);//bitwise and 
        System.out.println(p ^ q);//bitwise exclusive or 
        System.out.println(p << 1);//bitwise left shift
        System.out.println(p << 2);
        System.out.println(q >> 1);//bitwise right shift
        System.out.println(q >> 2);
        
    }
}
