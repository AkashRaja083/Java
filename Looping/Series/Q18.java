/*
Q18. Write a java program to print all Strong numbers between 1 to N.
*/
import java.util.*;
public class Q18 {
    static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++)
            fact = fact * i;
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int sum = 0;
            int temp = i;   
            while(temp > 0){
                int digit = temp % 10;
                sum += fact(digit);
                temp/=10;
            }
            if(sum == i)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
