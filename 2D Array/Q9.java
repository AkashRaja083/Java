/*
Q9.Write a Java program to find the maximum element in each row of a matrix.
*/
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            max = Integer.MIN_VALUE;   
            for(int j=0;j<col;j++){   
                if(matrix[i][j] > max)
                    max = matrix[i][j];
            }
            System.out.println(i+"->"+max);
        }
        sc.close();
    }
}
