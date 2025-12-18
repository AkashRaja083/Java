import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int evenSum = 0;
        int oddSum = 0;
        if (num == 0) {
            evenSum = 0; // 0 is even
        } else {
            while (num > 0) {
                int digit = (int)(num % 10);

                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }

                num /= 10;
            }
        }
        int difference = evenSum - oddSum;
        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits = " + oddSum);
        System.out.println("Difference (Even - Odd) = " + difference);
        sc.close();
    }
}
