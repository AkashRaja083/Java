package Scenorio;
import java.util.Scanner;
public class q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();
        if (speed > 100) {
            System.out.println("Speed Limit Exceeded!");
        } else {
            System.out.println("Speed is within limit.");
        }
        sc.close();
    }
}
