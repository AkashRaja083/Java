/*
Q6. Write a java program to check whether the digits of a number are in descending order.
*/
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prev = -1;
        boolean isdescending = true;
        while(num>0){
            int last = num % 10;
            if(prev != -1 && last < prev){
                isdescending = false;
                break;
            }
            prev = last;
            num/=10;
        }
        System.out.println(isdescending ? "Descending" : "Not a Descending");
        sc.close();
    }
}
