/*
Q1. Write a java program to print N natural numbers.
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
