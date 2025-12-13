/*
Q10.Java Program to check whether the sum of two numbers is even or odd
*/
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a+b) % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
