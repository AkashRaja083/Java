/*
Q17. Write a java program to print all Armstrong numbers between 1 to N.
*/
import java.util.*;;
public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            int temp = num;
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
