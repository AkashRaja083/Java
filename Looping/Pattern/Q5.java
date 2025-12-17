/*
Q5.Write a Java program to print a reverse right angle triangle pattern.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num;i >=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
