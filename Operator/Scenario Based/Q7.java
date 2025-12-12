/*
A teacher distributes candies equally among students. The program finds how many candies each student gets and how many remain undistributed.
Sample INput :
Candies: 50 Students: 6
Sample Output:
Each Gets: 8 Remaining: 2
*/

import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int students = sc.nextInt();
        int eachGets = candies / students; 
        int remaining = candies % students;
        System.out.println("Each Gets: " + eachGets);
        System.out.println("Remaining: " + remaining);
        sc.close();
}
}