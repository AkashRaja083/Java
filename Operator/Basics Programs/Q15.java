/*
Q15. Write a Java Program to calculate the average of three numbers
*/
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int average = (a+b+c)/3;
        System.out.printf("Average of three number"+average);
        s.close();
    }
}
