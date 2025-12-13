import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;  // Get ASCII value
        System.out.println("ASCII value of '" + ch + "' is: " + ascii);
        if (ascii % 2 == 0) {
            System.out.println("The ASCII value is EVEN.");
        } else {
            System.out.println("The ASCII value is ODD.");
        }
    }
}
