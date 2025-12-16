/*
Q3. Write a Java program to check whether the given digit is occurred in a number.
*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();
        boolean isdigit = false;
        while(num > 0){
            int rem = num % 10;
            if(rem == digit){
                isdigit = true;
                break;
            }
            num/=10;
        }
        if(isdigit)
            System.out.println("given digit is occured in number");
        sc.close();
    }
}