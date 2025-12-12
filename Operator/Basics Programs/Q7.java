/*
Q7.Write a Java Program to Swap of two numbers without using third variable
*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("A : %d \nB : %d",a,b);
        sc.close();
    }
}
