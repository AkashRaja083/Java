/*
Q6.Write a Java Program to Swap two numbers using third variable
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("A : %d \nB : %d",a,b);
        sc.close();
    }
}
