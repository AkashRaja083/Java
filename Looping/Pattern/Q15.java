/*
Q15.Write a Java program to print a half diamond pattern.
*/
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k = 1;k<=n;k++){
                if(i+k >= n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k = 1;k<=n;k++){
                if(k>=i){
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
