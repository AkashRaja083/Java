/*
Q17.Write a Java Program to check if a number is power of 2 using bitwise AND.
*/
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0){
            System.out.println(n + " is a power of 2");
        }
        else{
            System.out.println(n + " is not a power of 2");
        }
        sc.close();
    }
}
