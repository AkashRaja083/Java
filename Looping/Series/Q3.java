/*
Q3. Write a java program to print odd numbers till N
*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i+=2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
