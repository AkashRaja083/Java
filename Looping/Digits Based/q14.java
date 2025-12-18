import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sumSquares = 0;
        int sumCubes = 0;
        int digit;
        while (num != 0) {
            digit = num % 10;
            sumSquares += digit * digit;
            sumCubes += digit * digit * digit;
            num = num / 10;
        }
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Sum of cubes of digits: " + sumCubes);
    }
}
