/*
Q8.Write a Java Program to print given integer number in octal format.
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.printf("%o\n", num);
        s.close();
    }
}