/*
Q21. Write a java program to print Fibonacci series up to a given number limit.
*/
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}