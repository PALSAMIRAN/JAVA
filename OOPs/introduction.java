import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {
        //store 5 roll no 
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        //data of 5 students: {roll no ,name ,marks}

        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student samiran;
        System.out.println(Arrays.toString(students));
    }

    //create a class
    class Student {
        int roll;
        float marks;
        String name;
    }
}