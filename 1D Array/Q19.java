/*
Q19. Write a Java program to find the minimum element in an array.
*/

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                if(arr[i] < min){
                    min = arr[i];
                }
        }
        System.out.println("Min : "+min);
        sc.close();
    }
}
