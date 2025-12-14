
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = 0; // free
        } 
        else if (units <= 300) {
            bill = (units - 100) * 5;
        } 
        else {
            bill = (200 * 5) + (units - 300) * 10;
        }
        if (units > 500) {
            double surcharge = bill * 0.10; 
            bill += surcharge;
        }
        System.out.println("Total Electricity Bill: ₹" + bill);
        sc.close();
    }
}
