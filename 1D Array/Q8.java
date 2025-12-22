/*
Q8. Write a Java program to move all zeroes to the end of the array in place.
*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        // System.out.println(index);
        while(index<arr.length){
            arr[index++] = 0;
        }
        for(int x : arr)
            System.out.print(x + " ");
        sc.close();
    }
}
