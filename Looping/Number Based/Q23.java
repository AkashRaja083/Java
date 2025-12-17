import java.util.Scanner;

public class Q23
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= M; i++) {
            result = result * N;
        }

        System.out.println(result);
    }
    
}
