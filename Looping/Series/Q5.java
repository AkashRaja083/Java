/*
Q5. Write a java program to print N natural numbers in reverse.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            System.out.print(i+" ");
        }
        sc.close();
    }    
}
