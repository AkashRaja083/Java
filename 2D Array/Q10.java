/*
Q10.Write a Java program to find the maximum element in each column of a matrix.
*/
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int j = 0; j < col; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < row; i++){
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
            System.out.println(j + "->" + max);
        }
        sc.close();
    }
}
