//Write a program to implement concept of method overriding.
class sports {
    void a() {
        System.out.println("Sports ");
    }
}

class Cricket extends sports {
   
    void a() {
        System.out.println("Cricket is a sport");
    }
}

class football extends sports {
    
    void a() {
        System.out.println("Football is a sport.");
    }
}

public class question2 {
    public static void main(String[] args) {
        sports sports1 = new Cricket();
        sports sports2 = new football();

        sports1.a();   
        sports2.a();   
    }
}

