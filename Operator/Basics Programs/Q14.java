/*
Q14. Write a Java Program to print the cube of a given number
*/
import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long cube = a*a*a;
        System.out.printf("Cube is: "+ cube);
        s.close();
    }
}