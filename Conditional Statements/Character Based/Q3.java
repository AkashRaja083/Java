/*
Q3. Java Program to check whether a character is alphabet or not
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
        System.out.println("Alphabet");
    else 
        System.out.println("Not an Alphabet");
    sc.close();
    }
}