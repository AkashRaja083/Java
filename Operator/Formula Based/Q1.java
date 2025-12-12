/*
Q1.Write a Java Program to find area of Rectangle

Formula :
    Area of Rectangle = Width * Length
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int Area = length * width;
        System.out.print("The Area of Rectangle is : " + Area);
        sc.close();
    }
}
