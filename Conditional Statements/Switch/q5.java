
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000; 
        int choice, amount;
        System.out.println("---- Mini ATM ----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                amount = sc.nextInt();
                balance += amount;
                System.out.println("Updated Balance: " + balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                amount = sc.nextInt();
                if (amount > balance) {
                    System.out.println("Insufficient Balance!");
                } else {
                    balance -= amount;
                    System.out.println("Updated Balance: " + balance);
                }
                break;
            case 4:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
