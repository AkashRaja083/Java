/*
Q5.Write a Java Program to print remainder of two numbers
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int remainder = a%b;
        System.out.println("Sum of Two Number :" + remainder);
        sc.close();
    }
}
