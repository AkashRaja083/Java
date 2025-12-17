/*
Q13. Write a java program to calculate sum of multiple positive numbers (Stop if user enters negative number).
*/

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = sc.nextInt();
            if(num < 0)
                break;
            sum += num;
        }
        System.out.println("Sum of multiple positive numbers : "+sum);
        sc.close();
    }
}
