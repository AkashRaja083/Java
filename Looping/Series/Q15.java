/*
Write a java program to print all prime numbers from 1 to N.
*/

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2;i<=n;i++){
            boolean isprime = true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
