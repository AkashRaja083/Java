package Scenorio;
import java.util.Scanner;
public class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data usage percentage (0–100): ");
        int usage = sc.nextInt();
        if (usage < 50) {
            System.out.println("Low Data");
        }
        else if (usage == 50) {
            System.out.println("Half Consumed");
        }
        else if (usage >= 100) {
            System.out.println("Data Over");
        }
        else {
            System.out.println("Data Being Used: " + usage + "%");
        }
        sc.close();
    }
}
