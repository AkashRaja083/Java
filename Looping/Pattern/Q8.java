/*
Q8.Write a Java program to print a pyramid pattern.
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k = 1;k<=num-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}