/*
Q11. Write a java program to print "Hello World" for N times.
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Hello World");
        }
        sc.close();
    }
}
