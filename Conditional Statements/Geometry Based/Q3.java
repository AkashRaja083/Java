/*
Q3. Java Program to check whether a point (x, y) lies in which quadrant
*/
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == 0 || y == 0)
            System.out.println("No Quadrant");
        else if(x>0 && y>0)
            System.out.println("1st Quadrant");
        else if(x<0 && y>0)
            System.out.println("2nd Quadrant");
        else if(x<0 && y<0)
            System.out.println("3rd Quadrant");
        else
            System.out.println("4th Quadrant");
        sc.close();
    }
}