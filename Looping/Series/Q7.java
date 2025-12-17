/*
Q7. Write a java program to print N odd numbers.
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
                System.out.print(2*i-1+" ");
        }
        sc.close();
    }
}
