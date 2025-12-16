/*
Q5. Write a java program to check whether the digits of a number are in ascending order.
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = 10;
        boolean isascending = true;
        while(num>0){
            int last = num % 10;
            if(last > prev){
                isascending = false;
                break;
            }
            prev = last;
            num/=10;
        }
        System.out.println(isascending ? "Ascending" : "Not a Ascending");
        sc.close();
    }
}
