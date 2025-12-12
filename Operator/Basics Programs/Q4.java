/*
Q4.Write a Java Program to print Quoficient of two numbers
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quoficient =a/b;
        System.out.println("Sum of Two Number :"+ quoficient);
        sc.close();
    }
}
