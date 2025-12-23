/*
Q3.Write a Java program to find the average of all elements in a matrix.
*/
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        double sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }
        double avg = sum/(row*col);
        System.out.println(avg);
        sc.close();
    }
}
