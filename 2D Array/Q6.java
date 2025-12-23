/*
Q6.Write a Java program to find the sum of both diagonals of a square matrix.
*/

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            sum += matrix[i][i];
            sum += matrix[i][row - 1 - i];
        }
        sc.close();
        System.out.println(sum);
    }
}
