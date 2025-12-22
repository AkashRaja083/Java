/*
Q9. Write a Java program to move all negative numbers to the beginning of the array in place.
*/
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        for(int x :arr)
            System.out.print(x + " ");
        sc.close();
    }
}
