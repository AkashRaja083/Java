import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 100 && num <= 999 || num <= -100 && num >= -999) {
            System.out.println(num + " is a 3-digit number");
        } else {
            System.out.println(num + " is not a 3-digit number");
        }
        sc.close();
    }
}
