/*
Q17. Write a Java program to check if all elements in an array are distinct.
*/

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean iscontain = false;;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    iscontain = true;
                    break;
                }
            }
        }
        if(iscontain)
            System.out.println("Not a Distinct");
        else
            System.out.println("Distinct");
        sc.close();
    }
}
