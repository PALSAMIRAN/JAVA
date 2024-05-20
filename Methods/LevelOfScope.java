package Methods;

class Algebra {
//CLASS LEVEL SCOPE OF VARIABLES
    
    //a and b can be called from anywhere from the class 
   /*int a = 10;//member variables
    int b = 1;

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }
*/
    //METHOD LEVEL SCOPE OF VARIABLES
    /*int sum() {//Here we can't  call this p and q from other method
        int p = 100;
        int q = 50;
        return p + q;

    }

    int subtraction() {
        int p = 50;
        int q = 60;
        return p - q;
    }*/
    //BLOCK LEVEL SCOPE OF VARIABLES
    void demo() {
        int a = 10;
        System.out.println(a);
       // System.out.println(b);//here b is not be printed
        {
            int b = 50;//this b can be called from intside the '{}' only
            System.out.println(b);//here only will be printed
        }
        {
            int b = 45;
            System.out.println(b);
        }
        
    }
}
public class LevelOfScope {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        obj.demo();
    }
}
