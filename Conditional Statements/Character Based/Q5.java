/*
Q5. Java Program to check whether two characters are equal or not
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    char c = sc.next().charAt(0);
    if(ch == c)
        System.out.println("Equal");
    else 
        System.out.println("Not Equal");
    sc.close();
    }
}
