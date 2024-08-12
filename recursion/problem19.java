/*There are N stones, numbered 0,1,2.....N-1.For each i(0<=i<N),the height of stone is hi.There is a frog 
who is initially on stone 0. He will repeat the following action some number of times to reach stone N-1:
    if the frog is currently on stone i,jump to stone i+1 or stone i+2,
    Here , a cost of |hi-hj| is incurred, where j is the stone to land on. 
    Find the minimum possible total cost incurred before the frog reaches stone N-1.
    I/P: N=4
    arr[]=10 30 40 20 
    O/P: 30*/

package Recursion;

public class problem19 {
    static int frogJump(int[] h, int n, int idx) {
        if (idx == n - 1) {
            return 0;
        }
        int op1 = Math.abs(h[idx] - h[idx + 1]) + frogJump(h, n, idx + 1);
        if (idx == n - 2) {
            return op1;
        }
        int op2 = Math.abs(h[idx]-h[idx+2])+frogJump(h, n, idx + 2);
        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int[] h = { 10, 30, 40, 20 };
        System.out.println(frogJump(h,h.length,0));
    }
}
