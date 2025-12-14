import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();
        double discount = 0;
        if (bill >= 5000) {
            discount = bill * 0.20;  // 20% discount
        } 
        else if (bill >= 3000) {
            discount = bill * 0.15;  // 15% discount
        } 
        else if (bill >= 1000) {
            discount = bill * 0.10;  // 10% discount
        } 
        else {
            discount = bill * 0.05;  // 5% discount
        }
        double finalAmount = bill - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
        sc.close();
    }
}
