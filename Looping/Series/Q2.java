/*
Q2. Write a java program to print whole numbers till N.
*/
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
