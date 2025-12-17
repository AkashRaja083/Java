/*
Q10. Write a java program to calculate sum of N given numbers.
*/
import java.util.*;

public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            int num = sc.nextInt();
            sum+=num;
        }
        System.out.println("Sum of N given numbers is "+sum);
        sc.close();;
    }
}
