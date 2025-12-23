import java.util.*;

class Q30_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        for (int x : set)
            System.out.print(x + " ");
    }
}
