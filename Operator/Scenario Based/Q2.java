/*
A student measures experiment time in minutes but needs the time in seconds. The program should convert minutes into seconds.
Sample Input :
Minutes: 5
Sample Output :
Seconds: 300
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int seconds = minutes * 60;
        System.out.println("Seconds: " + seconds);
        sc.close();
    }
}
