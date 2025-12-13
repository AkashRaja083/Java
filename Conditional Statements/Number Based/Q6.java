/*
Q6.Java Program to find greatest among three numbers
*/
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.printf("%d is the greatest among three numbers.",a);
        }
        else if(b>c){
            System.out.printf("%d id the greatest among three numbers.",b);
        }
        else{
            System.out.printf("%d is the greatest among three numbers.",c);
        }
        sc.close();
    }
}
