/*
Q2.Java Program to find smallest among two numbers
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.printf("%d is the smaller of the two numbers",a);
        else
            System.out.printf("%d is the smaller of the two numbers",b);
        sc.close();
    }
}
