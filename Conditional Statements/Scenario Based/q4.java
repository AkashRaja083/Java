import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter battery percentage (0–100): ");
        int battery = sc.nextInt();
        if (battery < 20) {
            System.out.println("Low Battery");
        } 
        else if (battery == 50) {
            System.out.println("50% Consumed");
        } 
        else if (battery == 100) {
            System.out.println("Battery Full");
        } 
        else {
            System.out.println("Battery Status: " + battery + "%");
        }
        sc.close();
    }
}
