/*
Q13.Write a Java Program to print two numbers with a space between them.
*/
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " " + b);
        sc.close();
    }    
}