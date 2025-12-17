/*
Q25. Write a java program to print all numbers between 1 to N which are perfect squares.
*/

import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        sc.close();
    }
}
