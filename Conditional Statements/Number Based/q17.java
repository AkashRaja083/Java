import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int last1 = num1 % 10;
        int last2 = num2 % 10;
        if (last1 == last2) {
            System.out.println("Both numbers have the SAME last digit.");
        } else {
            System.out.println("The numbers have DIFFERENT last digits.");
        }
    }
}
