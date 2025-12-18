import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int maxDigit = 0;
        if (num == 0) {
            maxDigit = 0;
        } else {
            while (num > 0) {
                int digit = (int)(num % 10);
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                num /= 10;
            }
        }
        System.out.println("Largest digit in the number is: " + maxDigit);
        sc.close();
    }
}
