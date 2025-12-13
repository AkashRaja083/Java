/*
Q4.Java Program to find whether the difference between two numbers is even or odd
*/
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff;
        if(a>b){
            diff = a-b;
            if(diff % 2 == 0){
                System.out.println("Even");
            }
            else
                System.out.println("Odd");
        }
        else{
            diff = b-a;
            if(diff % 2 == 0)
                System.out.println("Odd");
            else
                System.out.println("Odd");
        }
        sc.close();
    }
}
