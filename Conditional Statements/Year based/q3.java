package year;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();
        int firstTwo = year / 100;  
        int lastTwo = year % 100;  
        if (firstTwo == lastTwo) {
            System.out.println("First two digits and last two digits are EQUAL.");
        } else {
            System.out.println("First two digits and last two digits are NOT equal.");
        }
        sc.close();
    }
}
