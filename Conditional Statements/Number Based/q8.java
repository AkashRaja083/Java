import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int a = number % 10;
        if (a < 0) {
            a = -a;
        }
        if (a % 3 == 0) {
            System.out.println("The last digit (" + a + ") is divisible by 3.");
        } else {
            System.out.println("The last digit (" + a + ") is NOT divisible by 3.");
        }
    }
}
