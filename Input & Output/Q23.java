/*
Q23.Write a Java Program to print your blood group.
*/

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char bloodGroup = sc.next().charAt(0);
        char pn = sc.next().charAt(0);
        System.out.printf("Blood Group: %c %cve",bloodGroup,pn);
        sc.close();
    }
}
