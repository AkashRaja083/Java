/*
Q15. Write a Java program to check if an array is sorted in ascending order
*/

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if(sorted)
            System.out.println("Array is sorted Ascending order");
        else
            System.out.println("Array is not sorted in ascending");
        sc.close();
    }
}
