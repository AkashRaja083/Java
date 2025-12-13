/*
Q20.Java Program to check whether the ASCII value of a character is even or odd.
*/

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(((int)ch % 2) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
