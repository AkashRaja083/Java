/*
A fruit shop has an offer: Buy 3 mangoes and get 1 free. Based on the mango price and total mangoes purchased, compute total mangoes received and amount to pay.
Sample Input:
Mango Price: 20Buy: 10
Sample Output:
Total Mangoes: 13Amount: 200
*/

import java.util.Scanner;

public class Q13 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int buy = sc.nextInt();
        int free = buy / 3;
        int totalMangoes = buy + free;
        int amount = buy * price;
        System.out.println("Total Mangoes: " + totalMangoes);
        System.out.println("Amount: " + amount);
        sc.close();
    }
}
