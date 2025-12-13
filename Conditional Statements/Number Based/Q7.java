/*
Q7.Java Program to find smallest among three numbers
*/
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.printf("%d is the Smallest among three numbers.",a);
        }
        else if(b<c){
            System.out.printf("%d id the Smallest among three numbers.",b);
        }
        else{
            System.out.printf("%d is the Smalllest among three numbers.",c);
        }
        sc.close();
    }
}
