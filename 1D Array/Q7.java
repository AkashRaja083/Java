/*
Q7. Write a Java program to count the number of zeroes in an array.
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                count++;
        }
        if (count == 0)
            System.out.println("No ZERO");
        else
            System.out.print(count);    
        sc.close();
    }
}
