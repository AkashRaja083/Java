import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int minDigit = 9;
        if (num == 0) {
            minDigit = 0;
        } else {
            while (num > 0) {
                int digit = (int)(num % 10);
                if (digit < minDigit) {
                    minDigit = digit;
                }
                num /= 10;
            }
        }
        System.out.println("Smallest digit in the number is: " + minDigit);
        sc.close();
    }
}
