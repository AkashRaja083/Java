/*
Q7.Write a Java program to find the maximum element in a matrix.
*/

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
