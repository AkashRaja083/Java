
import java.util.Scanner;
public class q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();
        if (speed > 100) {
            System.out.println("Over-speeding! Fine imposed.");
        } else {
            System.out.println("Speed is within limit.");
        }
        sc.close();
    }
}
