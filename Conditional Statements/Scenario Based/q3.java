import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 60) {
            System.out.println("You are eligible for senior citizen benefits.");
        } else {
            System.out.println("You are NOT eligible for senior citizen benefits.");
        }
        sc.close();
    }
}
