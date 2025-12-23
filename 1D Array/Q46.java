import java.util.*;

class Q46_LongestEqual01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) arr[i] = -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0)
                maxLen = i + 1;
            if (!map.containsKey(sum))
                map.put(sum, i);
            else
                maxLen = Math.max(maxLen, i - map.get(sum));
        }

        System.out.println(maxLen);
    }
}
