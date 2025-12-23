import java.util.*;

class Q39_MaxLenSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == target)
                maxLen = i + 1;
            if (!map.containsKey(sum))
                map.put(sum, i);
            if (map.containsKey(sum - target))
                maxLen = Math.max(maxLen, i - map.get(sum - target));
        }

        System.out.println(maxLen);
    }
}
