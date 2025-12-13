import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int product = a * b;
        if (product > 0) {
            System.out.println("The product is POSITIVE.");
        } 
        else if (product < 0) {
            System.out.println("The product is NEGATIVE.");
        } 
        else {
            System.out.println("The product is ZERO.");
        }
    }
}
