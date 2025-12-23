import java.util.*;

class Q48_SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0 && x <= n)
                present[x] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(n + 1);
    }
}
