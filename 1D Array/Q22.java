/*
Q22. Write a Java program to find the kth maximum element in an array of distinct elements.
*/
import java.util.*;
public class Q22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        sc.close();
    }
}
