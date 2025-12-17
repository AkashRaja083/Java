/*
Q19. Write a java program to print all Perfect numbers between 1 to N.
*/
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
