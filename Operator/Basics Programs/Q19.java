/*
Q19.Write a Java Program to find the greatest of three numbers.
*/
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a > b && a>c){
            System.out.print("A is greater");
        }
    else if(b > c){
        System.out.println("B is greater");
    }
    else{
        System.out.println("C is greater");
    }
    sc.close();
    }
}
