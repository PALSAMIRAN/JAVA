package Strings;

import java.util.Scanner;

public class stringbasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String s = sc.next();
        System.out.println(s);*///print only those elements present before the spaces

        /*String s = sc.nextLine();
        System.out.println(s);//print the whole string */

        String str = "Samiran";//string declaration
        String gtr = "Soumik";
       
       /* 
       System.out.println("The length of the string is : " + str.length());
       System.out.println(str.charAt(4));
       System.out.println(str.indexOf('a'));//find the index of the character.for duplicate char only the first occurence will be considered
       */
        /* 
        System.out.println(str.compareTo(gtr));
        */
        /* 
        System.out.println(str.contains("ari"));//checks the availability of the substring passed in the parameter
        System.out.println(str.startsWith("Sam"));
        System.out.println(str.endsWith("an"));
        */
        /* 
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));
        */
        /* 
        str += " Pal";
        str += 21;
        str += 'C';
        System.out.println(str);
        System.out.println("abc" + 10 + 20);//it will show abc1020 because left to right precedence
        System.out.println("abc" +( 10 + 20));//it will show abc30 because bracket precedence
        System.out.println(10+20+"abc" );//it will show 30abc because l to r  precedence
        */

        /* 
        System.out.println(str.substring(0, 5));// it will print 0th idx to 5-1=4th idx
        System.out.println(str.substring(0, 0));//returns empty string
        System.out.println(str.substring(0));// it will print 0th idx to last idx
        */
        /*  //Internings
        String s = "SAM";
        String x = "SAM";//this s & x points the same string "SAM" in the memory
        x = "saM";
        String s2=new String("SAM");//this will be a new string 
        System.out.println(x);
        System.out.println(s);
        */
      
        /* 
        // immutability of string
        String s = "Samiran";
        // s.charAt(2) = 'x';//this can't be happen due to immutability of strings
        s = s.substring(0, 2) + 'x' + s.substring(3);
        System.out.println(s);
        */
        String s1 = "sam";
        String s2 = "sam";
        String s3 = new String("sam");
        System.out.println(s1 == s2);//== checks the address of the strings that's why it will be true
        System.out.println(s1 == s3);//diff address so its will give false
        System.out.println(s1.equals(s3));



    }
}
