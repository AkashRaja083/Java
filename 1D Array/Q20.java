/*
Q20. Write a Java program to find the second maximum element in an array.
*/
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0;i < n;i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MAX_VALUE )
            System.out.println("No SecondLargest");
        else
            System.out.println(secondLargest);
        sc.close();
    }
}

