/*
Q10.Write a Java program to print a reverse hollow pyramid pattern.
*/
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
