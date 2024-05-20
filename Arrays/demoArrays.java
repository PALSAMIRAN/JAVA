package Arrays;

class demo {
    void Arraysexample() {
        int[] ages = new int[3];

        ages[0] = 10;
        ages[1] = 15;
        ages[2] = 20;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages.length);//length of an array
    }

    void MultiArray() {
        int[][] arr = { { 46, 59, 49 }, { 12, 15, 18 }, { 89, 45, 78 } };
        System.out.println(arr[0][0]);//46
        System.out.println(arr[0][1]);//59
        System.out.println(arr[0][2]);//49

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }

    void traversal() {
        int[] ages = { 45, 48, 70, 78, 91, 99 };
        //using for loop
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        //using for each loop
        for (int age : ages) {//here whole array is stored in age integer and print it
            System.out.println(age);
        }
        //using while loop
        int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }
    }

    void traversalformultiArrays() {
        int[][] arr = { { 46, 59, 49 }, { 12, 15, 18 }, { 89, 45, 78 } };
        //using for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println();
        }
    }
}

public class demoArrays{
    public static void main(String[] args) {
        demo obj = new demo();
    
        //obj.Arraysexample();
        //obj.MultiArray();
        //obj.traversal();
        obj.traversalformultiArrays();
    }
}