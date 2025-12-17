/*
Q6. Write a java program to calculate sum of first N natural numbers.
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of first N natural numbers : "+ sum);
        sc.close();
    }
}
