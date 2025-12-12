/*
A product is sold at a loss. Given selling price and loss amount, the program calculates the cost price using: CP = SP + Loss.
Sample Input:
SP: 400Loss: 50
Sample Output:
Cost Price: 450
*/

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp = sc.nextInt();
        int loss = sc.nextInt();
        int cp = sp + loss;
        System.out.println("Selling Price: " + cp);
        sc.close();
    }
}
