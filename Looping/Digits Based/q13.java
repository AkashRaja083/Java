import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();
        String result = number.replace("0", "");
        System.out.println("Number after removing zeroes: " + result);
    }
}
