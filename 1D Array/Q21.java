/*
Q21. Write a Java program to find the second minimum element in an array.
*/
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int Smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0;i < n;i++){
            if (arr[i] < Smallest){
                secondSmallest = Smallest;
                Smallest = arr[i];
            } 
            else if (arr[i] < secondSmallest && arr[i] != Smallest){
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE )
            System.out.println("No SecondSmallest");
        else
            System.out.println(secondSmallest);
        sc.close();
    }
}

