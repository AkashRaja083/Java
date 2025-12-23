/*
Q5.Write a Java program to find the sum of each column in a matrix.
*/
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        for(int j=0;j<col;j++){
            sum = 0;
            for(int i=0;i<row;i++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
            System.out.println(j+" -> "+sum);
        }
        sc.close();
    }
}
