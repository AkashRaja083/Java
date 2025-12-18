import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch + 32);
            System.out.println("Lowercase character: " + lower);
        } else {
            System.out.println("Please enter a valid uppercase character.");
        }
        sc.close();
    }
}
