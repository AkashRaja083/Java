package Scenorio;
import java.util.Scanner;
public class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption (in liters): ");
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000) {
            bill = 0;  
        }
        else if (liters <= 3000) {
            bill = (liters - 1000) / 1000.0 * 5;  
        }
        else {
            bill = (2000 / 1000.0) * 5;                 
            bill += (liters - 3000) / 1000.0 * 10;       
        }
        System.out.println("Total Water Bill: ₹" + bill);
        sc.close();
    }
}
