/*
Q15. Java Program to check whether a number is divisible by either 3 or 7
*/
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 7 == 0)
            System.out.println("A number is divisible by both 3 and 7");
        else
            System.out.println("A number is not divisible by both 3 and 7");
        sc.close();
    }
}
