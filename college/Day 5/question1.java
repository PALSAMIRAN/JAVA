// Write a program to implement multilevel in heritance.
class grandfather {
    static int a = 50000;
}

class father extends grandfather {
    static int b = 55000;
}

class question1 extends father {
    static int c = 60000;
 
        public static void main(String[] args) {
            question1 obj = new question1();
            int total = a + b + c;
            System.out.println(total);
           
        }
    }

