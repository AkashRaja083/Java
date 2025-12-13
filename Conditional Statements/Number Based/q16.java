import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num % 5 == 0 && num % 8 != 0) {
            System.out.println(num + " is divisible by 2 and 5 but NOT by 8.");
        } else {
            System.out.println(num + " does NOT satisfy the condition.");
        }
    }
}
