package NumberSystem;
  


class algebra {
    int a;//this a and b we can use anywhere in this class
    int b;

    algebra(int x, int y) {
        System.out.println("CONSTRUCTOR OF ALGEBRA CLASS CALLED");
        a = x;
        b = y;
    }

    int add() {

        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}
// HOW TO CONSTRUCTOR CALLED?
  

public class Constructor{
    public static void main(String[] args) {
        algebra obj = new algebra(6,8);//algebra()--->constructor
    

        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
      
        algebra obj2 = new algebra(10, 8);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
       
    }
}
