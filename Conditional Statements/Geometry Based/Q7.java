/*
Q7. Java Program to calculate the distance between two points (x1,y1) and (x2,y2).
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double dx = Math.pow((x2-x1),2);
        double dy = Math.pow((y2-y1),2);
        double distance = Math.sqrt((dx+dy));
        System.out.printf("Distance between Two Points is %.2f", distance);
        sc.close();
    }
}
