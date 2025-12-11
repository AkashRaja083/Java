/*
Q3.Write a Java Program to Print the given Message.
*/

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Given Message is : "+str);
        sc.close();
    }
}