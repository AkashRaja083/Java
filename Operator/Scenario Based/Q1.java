/*
A shop offers festival discounts. The customer enters the original price and discount percentage. The program must calculate the discount amount and the final price payable after applying the discount.
Sample Input : 
Original Price: 1000
Discount: 10
Sample Output :
Discount Amount: 100.0
Final Price: 900.0
*/
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double originalPrice = sc.nextDouble();
        double discount = sc.nextDouble();
        double discountAmount = (originalPrice * discount) / 100.0;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
        sc.close();
    }

}
