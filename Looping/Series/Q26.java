/*
Q26. Write a java program to print all numbers between 1 to N which are perfect cubes.
*/
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i * i * i <= N; i++) {
            System.out.print((i * i * i) + " ");
        }
        sc.close();
    }
}
