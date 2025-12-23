import java.util.*;

class Q43_MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0, candidate = 0;

        for (int x : arr) {
            if (count == 0)
                candidate = x;
            count += (x == candidate) ? 1 : -1;
        }

        count = 0;
        for (int x : arr)
            if (x == candidate)
                count++;

        System.out.println(count > n / 2 ? candidate : "No Majority");
    }
}
