/*
Q12. Write a java program to print multiplication table of N.
*/

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.print(n*i + " ");
        }
        sc.close();
    }
}
