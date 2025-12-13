import java.util.Scanner;
public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        if (sum % 2 == 0) {
            System.out.println("The sum is EVEN.");
        } else {
            System.out.println("The sum is ODD.");
        }
    }
}
