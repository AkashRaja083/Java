/*
Q2. Java Program to check whether a given character is uppercase, lowercase, digit, or special symbol
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z')
        System.out.println("Lower case");
    else if(ch >= 'A' && ch <= 'Z')
        System.out.println("Upper case");
    else if(ch >= 0 && ch<=9)
        System.out.println("Digits");
    else
        System.out.println("Special symbol");
    sc.close();
    }
}
