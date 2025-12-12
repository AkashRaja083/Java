/*
A shopkeeper sells an item at a profit. Given cost price and profit, calculate the selling price using: SP = CP + Profit.
Sample Input:
CP: 500Profit: 100
Sample Output:
Selling Price: 600
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp = sc.nextInt();
        int profit = sc.nextInt();
        int sp = cp + profit;
        System.out.println("Selling Price: " + sp);
        sc.close();
    }
}
