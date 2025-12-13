/*
Q1. Java Program to check whether a given character is a vowel or consonant
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
                System.out.println("Vowel");
            else 
                System.out.println("Consonant");
        sc.close();
        }
    }
}
