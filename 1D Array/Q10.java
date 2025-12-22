/*
Q10. Write a Java program to replace all negative numbers in an array with zero.
*/

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        for(int x :arr)
            System.out.print(x + " ");
        sc.close();
    } 
}
