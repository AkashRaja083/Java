/*
Q3.Java Program to find whether the given number is odd or even number
*/

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
