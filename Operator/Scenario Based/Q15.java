/*
An ATM dispenses money in ₹2000, ₹500, and ₹100 notes. For a given amount, calculate the number of each note required (highest denomination first).
Sample Input:
Amount: 3700
Sample Output:
2000 Notes: 1500 Notes: 3100 Notes: 2
*/

import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int n2000 = amount / 2000;
        amount %= 2000;
        int n500 = amount / 500;
        amount %= 500;
        int n100 = amount / 100;
        amount %= 100;
        System.out.println("2000 Notes: " + n2000);
        System.out.println("500 Notes: " + n500);
        System.out.println("100 Notes: " + n100);
        sc.close();
    }
}
