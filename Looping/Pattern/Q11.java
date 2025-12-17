/*
	Q11.Write a Java program to print a hollow pyramid pattern.
*/
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int k = 1;k<=num-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j == 1 || j == 2*i-1 || i == num){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
