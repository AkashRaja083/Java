/*
Q11.Write a Java Program to print the ASCII value of a character.
*/
import java.util.Scanner;
public class Q11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    System.out.printf("ASCII Value of Charracter is: %d",(int)ch);
    sc.close();
    }   
}
