/*
Q2.Write a Java Program to find area of Square

Area of Square = side * side
*/
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int Area = side * side;
        System.out.print("The Area of square is : " + Area);
        sc.close();
    }
}
