
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 60 && marks < 80) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 40 && marks < 60) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 0 && marks < 40) {
            System.out.println("Grade: Fail");
        } 
        else {
            System.out.println("Invalid marks! Enter between 0 and 100.");
        }
        sc.close();
    }
}
