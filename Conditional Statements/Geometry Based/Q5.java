/*
Q5. Java Program to check whether three sides form a valid triangle
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0)
            System.out.println("Invalid Triangle");
        else if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
        sc.close();
    }
}
