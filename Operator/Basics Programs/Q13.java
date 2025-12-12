/*
Q13. Write a Java Program to print the square of a given number
*/
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    double power = a*a;
    System.out.printf("Square of %d is %.2f ",a,power); 
    sc.close();  
    }
}
