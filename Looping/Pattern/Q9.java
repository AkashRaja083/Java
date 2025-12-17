/*
Q9.Write a Java program to print a reverse pyramid pattern.
*/
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num;i>=1;i--){
            for(int k = 1;k<=num-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
