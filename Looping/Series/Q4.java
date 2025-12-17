/*
Q4. Write a java program to print even numbers till N.
*/
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
