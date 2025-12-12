/*
Q16.Write a Java Program to check whether two numbers are equal if equal True else False.
*/
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
