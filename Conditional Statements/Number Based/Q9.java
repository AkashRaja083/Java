/*
Q9.Java Program to check odd or even using bitwise operator
*/
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        sc.close();
    }
}
