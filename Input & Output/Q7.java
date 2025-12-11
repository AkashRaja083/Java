/*
Q7.Write a Java Program to print given integer number in Hexadecimal format.
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.printf("Hex value: %X", num);
        s.close();
    }
}
