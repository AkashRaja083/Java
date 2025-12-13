package year;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            System.out.println(year + " is a Century Year.");
        } else {
            System.out.println(year + " is NOT a Century Year.");
        }
        sc.close();
    }
}
