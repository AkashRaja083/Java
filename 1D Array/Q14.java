/*
Q14. Write a Java program to rearrange an array so that even numbers appear before odd numbers (in place)
*/

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        for(int x : arr)
            System.out.print(x+" ");
        sc.close();
    }
}
