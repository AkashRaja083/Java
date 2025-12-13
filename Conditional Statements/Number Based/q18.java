import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (num >= 0 && num <= 9) {
            System.out.println("It is a SINGLE-digit number.");
        } 
        else if (num >= 10 && num <= 99) {
            System.out.println("It is a TWO-digit number.");
        } 
        else if (num >= 100 && num <= 999) {
            System.out.println("It is a THREE-digit number.");
        } 
        else {
            System.out.println("It has MORE than three digits.");
        }
    }
}
