package Scenorio;
import java.util.Scanner;
public class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of the week (1–7): ");
        int day = sc.nextInt();
        int price;
        if (day >= 1 && day <= 5) {
            price = 100;   // Weekday price
            System.out.println("It's a Weekday.");
        } 
        else if (day == 6 || day == 7) {
            price = 150;   // Weekend price
            System.out.println("It's a Weekend.");
        } 
        else {
            System.out.println("Invalid day number!");
            sc.close();
            return;
        }
        System.out.println("Ticket Price: ₹" + price);
        sc.close();
    }
}
