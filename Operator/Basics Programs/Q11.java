/*
Q11.Write a Java Program to print the middle digit of a 3-digit number.
*/
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int last2 = a%100;
        int middle = last2/10;
        System.out.println("Middle digit is : "+middle);
        sc.close();
    }
}
