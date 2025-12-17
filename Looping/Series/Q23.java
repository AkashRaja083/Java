/*
Q23. Write a java program to print all Magic numbers between 1 to N.
*/

import java.util.Scanner;
public class Q23 {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp > 9) {
                temp = digitSum(temp);
            }
            if (temp == 1)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
