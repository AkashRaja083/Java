/*
Q19. Java Program to check whether the product of two numbers is positive or negative
*/
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a*b) > 0)
            System.out.println("Positive");
        else if((a*b) < 0)
            System.out.println("Negative");
        sc.close();
    }
}
