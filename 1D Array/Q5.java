/*
Q5. Write a Java program to find the alternate sum of an array (arr[0] - arr[1] + arr[2] - arr[3] + …).
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sum += arr[i];
            }
            else{
                sum-= arr[i];
            }
        }
        System.out.print(sum + " ");
        sc.close();
    }
}
