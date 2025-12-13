package Scenorio;
import java.util.Scanner;
public class q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Weather: Cold");
        } 
        else if (temp >= 15 && temp < 25) {
            System.out.println("Weather: Pleasant");
        } 
        else if (temp >= 25 && temp < 35) {
            System.out.println("Weather: Hot");
        } 
        else {
            System.out.println("Weather: Heatwave");
        }
        sc.close();
    }
}
