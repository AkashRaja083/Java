import java.util.*;

class Q49_LargestMissingPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) {
                set.add(x);
                max = Math.max(max, x);
            }
        }

        for (int i = max; i >= 1; i--) {
            if (!set.contains(i)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("None");
    }
}
