
import java.util.Scanner;
public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter body temperature: ");
        double temp = sc.nextDouble();
        if (temp > 100) {
            System.out.println("Fever: YES");
        } else {
            System.out.println("Fever: NO");
        }
        sc.close();
    }
}
