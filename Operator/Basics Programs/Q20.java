/*
Q20.Write a Java Program to print pass/fail result based on marks.
*/
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark >= 35){
            System.out.print("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
