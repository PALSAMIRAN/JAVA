package NumberSystem;

public class AccessModifiers {
    public String str_1 = "I AM A PUBLIC MEMBER";// THIS PUBLIC CLASS IS ACCESSABLE FROM EVERYWHERE IN OUTSIDE PACKAGE,NON CHILD CLASS
    public String str;

    void printFromclass() {
        System.out.println("Within class : " + str_1);
    }

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.printFromclass();
        System.out.println("Within class : " + obj.str_1);
        AccessModifiers2 obj2 = new AccessModifiers2();
        obj2.printFromOutsideClass();

    }

}

class AccessModifiers2 {
    void printFromOutsideClass() {
        AccessModifiers obj = new AccessModifiers();
        System.out.println("WITHIN PACAKGE, OUTSIDE CLASS : " + obj.str_1);
    }

}

//NOW CHECK THAT CAN WE CALL THE PUBLIC CLASS FROM OUTSIDE PACKAGE OR NOT THAT'S WHY
// I MADE A FILE IN BASIC PACKAGE;FILE NAME:-AccesssModifires_help.java
