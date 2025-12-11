/*
Q14.Write a Java Program to print two numbers with a tab space between them.
*/
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + "\t" + b);
        sc.close();
    }    
}