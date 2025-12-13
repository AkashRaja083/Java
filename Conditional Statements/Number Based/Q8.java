/*
Q8.Java Program to find whether the last digit of given number is divisible by 3
*/

import java.util.Scanner;   
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = num % 10;
        if(last % 3 == 0)
            System.out.println("Lastdigit is divisible by 3");
        else
            System.out.println("Lastdigit is not divisible by 3");
        sc.close();
    }
}
