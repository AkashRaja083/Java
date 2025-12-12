/*
Q3.Write a Java Program to print product of two numbers
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Sum of Two Number :" + product);
        sc.close();
    }
}
