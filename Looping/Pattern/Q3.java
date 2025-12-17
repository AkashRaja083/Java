/*
Q3.Write a Java program to print a hollow square pattern with both diagonals.
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i == j || i+j == num+1 || i == 1 || j == 1 || i == num|| j == num)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
