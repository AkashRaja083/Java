/*
Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number
*/
import java.util.Scanner;
public class Q18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0 && num<=9)
            System.out.println("Single digit");
        else if(num>=10 && num<=99)
            System.out.println("Double digit");
        else if(num>=100 && num<=999)
            System.out.println("Triple digit");
        sc.close();
    }
}
