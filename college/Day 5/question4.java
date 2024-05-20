/*You have to develop one application for managing Students and Teachers information. They have some common
 property, hence you have to define a class Person. Design the application maintaining hierarchy of classes.
 Override the toString method to print the values of an object. The students and teachers information should 
be kept using array of objects.*/

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
}

class Teacher extends Person {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

public class question4 {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        people[0] = new Student("Sachin", 50, 101);
        people[1] = new Student("So", 17, 102);
        people[2] = new Teacher("Carol", 35, "Math");
        people[3] = new Teacher("David", 40, "Science");
        people[4] = new Student("Eve", 16, 103);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
