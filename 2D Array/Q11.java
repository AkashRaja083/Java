/*
Q11.Write a Java program to find the minimum element in each row of a matrix.
*/

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            min = Integer.MAX_VALUE;   
            for(int j=0;j<col;j++){   
                if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
            System.out.println(i+"->"+min);
        }
        sc.close();
    }
}
