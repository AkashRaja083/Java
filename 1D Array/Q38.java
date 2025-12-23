import java.util.*;

class Q38_SubarrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        int sum = 0, start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];
            while (sum > target)
                sum -= arr[start++];

            if (sum == target) {
                System.out.println(start + " " + end);
                return;
            }
        }
        System.out.println("No subarray");
    }
}
