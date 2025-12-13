/*
Q17. Java Program to check whether two numbers have the same last digit
*/
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a%10) == (b%10))
            System.out.println("Two numbers have the same last digit");
        else
            System.out.println("Two numbers doesn't have the same last digit");
        sc.close();
    }
}
