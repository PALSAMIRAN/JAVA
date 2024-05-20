package Basic;

public class datatype {
    public static void main(String[] args) {
        boolean flag = true;//it gives only true or false
        int a = 12345;//size:4 bytes;range:2^-31 to 2^31 - 1
        short s = 1200;//size:2 bytes=16 bits;range:-32768 to 32767(-2^15 to 2^15 - 1)
        byte b = 120;//size: 1 byte=8 bit;range:-128 to 127
        long l = 456978784;//size:8 byte; range:-2^64 to 2^64-1
        float f = 854.1456f;//size:4 bytes
        double d = 7878.87654;//size:8 bytes
        char ch = 'p';//size:2 bytes

        System.out.println("The boolean variable is " + flag);
        System.out.println("The integer variable is " + a);
        System.out.println("The short variable is " + s);
        System.out.println("The byte variable is " + b);
        System.out.println("The long variable is " + l);
        System.out.println("The float variable is " + f);
        System.out.println("The double variable is " + d);
        System.out.println("The char variable is " + ch);
    }
}
