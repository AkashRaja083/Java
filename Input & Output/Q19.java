/*
Q19.Write a Java Program to print an integer with a plus sign (+) before it.
*/
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("+"+num);
        sc.close();
    }
}
