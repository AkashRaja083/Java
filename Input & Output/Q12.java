/*
Q12.Write a Java Program to print the character for given ASCII value.
*/

import java.util.Scanner;
public class Q12 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int val = sc.nextInt();
    System.out.println("ASCII value is : " + (char)val);
    sc.close();
    }   
}
