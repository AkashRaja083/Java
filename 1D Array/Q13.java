/*
Q13. Write a Java program to check if an array contains duplicate elements.
*/
import java.util.Scanner;

public class Q13 {
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
                if(arr[i] == arr[j])
                    iscontain = true;
            }
        }
        if(iscontain)
            System.out.println("Array contain duplicates");
        else
            System.out.println("Array doesnt contain duplicates");
        sc.close();
    }
}
