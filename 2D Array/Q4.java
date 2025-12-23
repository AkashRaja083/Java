/*
Q4.Write a Java program to find the sum of each row in a matrix.
*/
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        for(int i=0;i<row;i++){
            sum = 0;
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
            System.out.println(i+" -> "+sum);
        }
        sc.close();
    }
}
