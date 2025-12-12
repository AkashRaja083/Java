/*
Q8.Java Program to print the last digit of given number N
*/
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int last = N%10;
        System.out.printf("Last digit is : "+last);
        sc.close();
    }
}
