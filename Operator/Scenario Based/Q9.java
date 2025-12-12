/*
A person deposits money in the bank. Using the formula SI = (P × R × T) / 100, the program computes simple interest.
Sample Input:
P: 5000R: 5T: 2
Sample Output:
Simple Interest: 500.0
*/

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();
        double SI = (P * R * T) / 100.0;
        System.out.println("Simple Interest: " + SI);
        sc.close();
    }
}
