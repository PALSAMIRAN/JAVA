import java.util.Scanner;

public class suvam1{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter cost: ");
    int cost= sc.nextInt();

    if(cost <= 600000){
            System.out.println("tax = 3%");
    }else if(cost>600000 && cost <=1000000){
            System.out.println("tax = 6%");
    }else if(cost >1000000 && cost<=2000000){
            System.out.println("tax = 8%");
    }else{
            System.out.println("tax = 9%");
    }
 }
}
