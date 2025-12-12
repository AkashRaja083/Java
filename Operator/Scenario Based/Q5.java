/*
A fitness trainer tracks running distances in meters. Athletes give distance in kilometers, so the program converts km → meters.
Sample Input :
KM: 3
Sample Output:
Meters: 3000
*/

import java.util.Scanner;
public class Q5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double meters = km * 1000;
        System.out.println("Meters: " + meters);
        sc.close();
    }
}
