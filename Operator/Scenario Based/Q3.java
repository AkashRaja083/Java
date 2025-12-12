/*
Three friends eat at a restaurant and get a single bill. They want to split the total bill equally. The program calculates how much each friend must pay.
Sample input :
Total Bill: 1500
Sample Output :
Each Friend Pays: 500
*/

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = sc.nextDouble();
        double eachPays = totalBill / 3.0;
        System.out.println("Each Friend Pays: " + eachPays);
        sc.close();
    }
}
