/*
Q7. Write a java program to swap the first and last digit of a given number.
*/

import java.util.Scanner;

public class Q7 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int last = num % 10;
        int pow = 1;
        while(temp>= 10){
            temp /= 10;
            pow *= 10;
        }
        int first = temp;
        int middle = (num%pow)/10;
        int result = last * pow + middle * 10 + first;
        System.out.println(result);
        sc.close();
    }
}
