import java.util.Scanner;

public class Q18
{
   public static void main(String[] args)
   {
   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int lastDigit = 0;

        // Loop to find last digit
        while (temp > 0) {
            lastDigit = temp % 10;
            break;
        }

        if (lastDigit == 7 || n % 7 == 0) {
            System.out.println("Buzz Number");
        } else {
            System.out.println("Not a Buzz Number");
        }
   }
}
