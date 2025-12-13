package Scenorio;
import java.util.Scanner;

public class q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;
        if (amount >= 5000) {
            discount = amount * 0.20; 
        } 
        else if (amount >= 3000) {
            discount = amount * 0.15;  
        } 
        else if (amount >= 1000) {
            discount = amount * 0.10;   
        } 
        else {
            discount = amount * 0.05;
        }
        double finalAmount = amount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
        sc.close();
    }
}
