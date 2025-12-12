/*
Q18.Write a Java Program to print whether a number is positive or negative.
*/
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.print("Positive");
        }
        else{
            System.out.println("Negative");
        }
        sc.close();
    }
}
