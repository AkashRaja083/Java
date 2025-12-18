import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int evenCount = 0;
        int oddCount = 0;
        if (num == 0) {
            evenCount = 1; // 0 is even
        } else {
            while (num > 0) {
                int digit = (int)(num % 10);
                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }

                num /= 10;
            }
        }
        if (evenCount > 0 && oddCount == 0) {
            System.out.println("All digits are EVEN.");
        } else if (oddCount > 0 && evenCount == 0) {
            System.out.println("All digits are ODD.");
        } else {
            System.out.println("Digits are MIXED (even and odd).");
        }
        sc.close();
    }
}
