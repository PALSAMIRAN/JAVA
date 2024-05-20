package college.Day3;

class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }

    void modifyValue(int newValue) {
        value = newValue;
    }

    void modifyObjectValue(MyClass obj) {
        obj.value = 100;
    }
}

public class question5 {
    public static void main(String[] args) {
        // Call by value example
        int num = 10;
        System.out.println("Original Value: " + num);
        modifyValue(num);
        System.out.println("After call by value: " + num);

        // Call by reference example
        MyClass obj = new MyClass(50);
        System.out.println("Original Object Value: " + obj.value);
        modifyObjectValue(obj);
        System.out.println("After call by reference: " + obj.value);
    }

    static void modifyValue(int num) {
        num = 20;
    }

    static void modifyObjectValue(MyClass obj) {
        obj.modifyValue(100);
    }
}
