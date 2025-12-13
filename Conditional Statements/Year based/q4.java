package year;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first year: ");
        int year1 = sc.nextInt();
        System.out.print("Enter second year: ");
        int year2 = sc.nextInt();
        int last1 = year1 % 10;
        int last2 = year2 % 10;
        if (last1 == last2) {
            System.out.println("Both years have the SAME last digit.");
        } else {
            System.out.println("The years do NOT have the same last digit.");
        }
        sc.close();
    }
}
