/*
Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.
*/
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int last = a%10;
        int first = a/100;
        int sum = first + last;
        System.out.println("Sum of First and Last digit is : "+sum);
        sc.close();
    }
}
