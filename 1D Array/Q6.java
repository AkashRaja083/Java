/*
Q6. Write a Java program to count the number of odd elements in an array.
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0)
                count++;
        }
        System.out.print(count);
        sc.close();
    }
}
