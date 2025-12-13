package Scenorio;
import java.util.Scanner;
public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234; 
        int balance = 5000;  
        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == storedPin) {
            System.out.println("PIN Verified!");
            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal Successful!");
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }
        sc.close();
    }
}
