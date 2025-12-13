/*
Q11. Java Program to check whether the first digit of a 3 digit number is odd or even
*/
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = num/100;
        if ((first & 1) == 0)
            System.out.println("First digit is Even");
        else
            System.out.println("First digit is Odd");
        sc.close();
    }
}
