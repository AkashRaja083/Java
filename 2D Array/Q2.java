/*
Q2.Write a Java program to find the sum of all elements in a matrix.
*/
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
