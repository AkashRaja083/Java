/*
Q17.Write a Java Program to print two words in double quotes.
*/

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf(" \" %s \" ",str);
        sc.close();
    }
}
