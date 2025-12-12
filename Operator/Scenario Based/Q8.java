/*
A bakery produces a fixed number of cakes every hour. Given cakes per hour and total hours, the program calculates total cakes made.
Sample Input:
Cakes/Hour: 10Hours: 5
Sample Output:
Total Cakes: 50
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakesPerHour = sc.nextInt();
        int hours = sc.nextInt();
        int totalCakes = cakesPerHour * hours;
        System.out.println("Total Cakes: " + totalCakes);
        sc.close();
    }
}
