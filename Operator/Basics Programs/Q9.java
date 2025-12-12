/*
Q9.Java Program to print the all digits Except last digit of given number N
*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Exceptlast = a/10;
        System.out.printf("Except Last digit is : "+Exceptlast);
        sc.close();
    }
}
