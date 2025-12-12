/*
Q2.Write a Java Program to print difference of two numbers
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = a+b;
        System.out.println("difference of Two Number : " +difference);
        sc.close();
    }
}
