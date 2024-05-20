//HERE WE CHECK THAT CAN WE CALL A PUBLIC CLASS FROM OUTSIDE PACKAGE OR NOT.
package Basic;

import NumberSystem.AccessModifiers;

public class AccessModifiers_help {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("Outside Package,non-child class : " + obj.str_1);
        AccessModifiers3 obj3 = new AccessModifiers3();
        obj3.PrintFromChildClass();
    }
}
//child class           //parent class
class AccessModifiers3 extends AccessModifiers{
    void PrintFromChildClass() {
        AccessModifiers3 obj3 = new AccessModifiers3();
        System.out.println("OUTSIDE PACKAGE ,CHILD CLASS : "+obj3.str_1);
        
    }
}
