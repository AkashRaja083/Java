/*
Q21.Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John
*/

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int RollNo = sc.nextInt();
        String name = sc.nextLine();
        System.out.println("RollNo : "+RollNo+"\n"+"Name : "+name);
        sc.close();
    }
}
