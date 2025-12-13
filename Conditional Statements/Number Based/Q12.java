/*
Q12. Java Program to check whether the last digit of a number is odd or even
*/
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = num % 10;
        if(last % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
