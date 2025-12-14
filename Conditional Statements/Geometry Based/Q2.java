/*
Q2. Java Program to check whether a triangle is right-angled or not
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2))
            System.out.println("is Rightangled Triangle");
        else
            System.out.println("Not a Rightangled Triangle");
        sc.close();
    }
}