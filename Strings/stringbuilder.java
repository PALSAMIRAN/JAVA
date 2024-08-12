package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        //str.setCharAt(0, 's');
        //str += "world";//it will throw error we can't append a string to stringbuilder
        //str.append("World");// can append int also
        // str.insert(2, 'y');
        // str.deleteCharAt(2);
        // str.reverse();
        // str.delete(0, 2);
        
        System.out.println(str);
    }
    
}
