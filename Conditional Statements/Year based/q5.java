package year;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (e.g. 2025): ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        if (year <= 0) {
            System.out.println("Invalid year. Please enter a positive year (e.g. 2025).");
            sc.close();
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Month must be between 1 and 12.");
            sc.close();
            return;
        }
        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        int days;
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                days = 31;
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                days = 30;
                break;
            case 2: 
                days = isLeap ? 29 : 28;
                break;
            default:
                days = 0;
        }
        System.out.printf("Year: %d, Month: %d → %d day%s%s%n",
                          year,
                          month,
                          days,
                          (days == 1 ? "" : "s"),
                          (month == 2 ? (isLeap ? " (leap year)" : "") : ""));
        sc.close();
    }
}
