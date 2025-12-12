/*
Q5.Write a Java Program to find the distance between two points
Formula :
√((x2 − x1)² + (y2 − y1)²)
*/
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);
        sc.close();
    }
}