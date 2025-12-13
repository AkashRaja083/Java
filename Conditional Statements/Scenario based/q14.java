package Scenorio;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        int price;
        if (age < 12) {
            price = 50;   // Child ticket
            System.out.println("Category: Child");
        } 
        else if (age < 60) {
            price = 100;  // Adult ticket
            System.out.println("Category: Adult");
        } 
        else {
            price = 70;   // Senior ticket
            System.out.println("Category: Senior");
        }
        System.out.println("Ticket Price: ₹" + price);
        sc.close();
    }
}
