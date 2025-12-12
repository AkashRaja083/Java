/*
A stationery shop offers: Buy 5 pens, pay only for 3. Given price per pen and pens bought, the program calculates how many pens need to be paid for and total cost.
Sample INput:
Pen Price: 10Buy: 12
Sample Output:
Pay For: 8 Total Amount: 80
*/

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int buy = sc.nextInt();
        int groups = buy / 5;
        int remainder = buy % 5;
        int payFor = groups * 3 + remainder;
        int amount = payFor * price;
        System.out.println("Pay For: " + payFor);
        System.out.println("Total Amount: " + amount);
        sc.close();
    }
}
