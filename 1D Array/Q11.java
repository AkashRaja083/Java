/*
Q11. Write a Java program to reverse an array.
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        /*
        int[] rev = new int[n];
        for(int i=0;i<n;i++){
            rev[i] = arr[n-i-1];
        }
        */
        int start = 0;
        int end = (arr.length)-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int x : arr)
            System.out.print(x+" ");
        sc.close();
    }
}