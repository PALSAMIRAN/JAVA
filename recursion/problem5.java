//given an integer ,find out the sum of its digits using recursion

package Recursion;

public class problem5 {
    static int SumOfDigits(int n) {
        //base case
        if (n >= 0 && n <= 9) {
            return n;
        }
        /* 
        //recursive work ----> small ans
        int smallAns = SumOfDigits(n / 10);
        //self work
        return smallAns + n % 10;
        */
        return SumOfDigits(n / 10) + n % 10;

    }
    
    // Function for Counting the Number of digits
static int CountNoDigits(int n){
    if(n/10==0) return 1;  //Base case
    return CountNoDigits(n/10) + 1; // Recusive case and Self work
    }
    public static void main(String[] args) {
        System.out.println(SumOfDigits(1234));
        System.out.println(CountNoDigits(1234));
    }
}
