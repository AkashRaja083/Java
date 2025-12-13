import java.util.Scanner;
public class q15
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 3 and 7");
        } else {
            System.out.println(num + " is not divisible by both 3 and 7");
        }
    }
}
