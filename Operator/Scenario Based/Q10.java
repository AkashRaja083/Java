/*
A company calculates employee salary using: Basic + HRA + Allowance. The program must compute the total salary.
Sample Input:
Basic: 20000 HRA: 5000 Allowance: 3000
Sample Output;
Total Salary: 28000
*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        int hra = sc.nextInt();
        int allowance = sc.nextInt();
        int totalSalary = basic + hra + allowance;
        System.out.println("Total Salary: " + totalSalary);
        sc.close();
    }
}
