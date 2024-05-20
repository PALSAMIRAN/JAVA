package NumberSystem;

class Student {
    int rollno;
    String studentname;
}

public class Main { 
    //in a java file there can be multiple classes but there will be only one public class;
    public static void main(String[] args) {
    //    How can we access a class? 
        Student obj1 = new Student();
        obj1.rollno = 1;
        obj1.studentname = "Samiran";

        System.out.println(obj1.rollno);
        System.out.println(obj1.studentname);

        Student obj2 = new Student();
        obj2.rollno = 2;
        obj2.studentname = "Debmalya";

        System.out.println(obj2.rollno);
        System.out.println(obj2.studentname);
    }
}
