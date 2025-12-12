/*
Q1.Write a Java Program to print sum of two numbers
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        System.out.println("Sum of Two Number :"+ add);
        sc.close();
    }
}
