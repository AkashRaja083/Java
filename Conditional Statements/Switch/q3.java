
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1–7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
                System.out.println("It is a Weekday.");
                break;
            case 6: 
            case 7: 
                System.out.println("It is a Weekend.");
                break;
            default:
                System.out.println("Invalid day number! Enter between 1 and 7.");
        }
        sc.close();
    }
}
