import java.util.*;

class Q31_RemoveDuplicatesNoSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int newSize = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found)
                arr[newSize++] = arr[i];
        }

        for (int i = 0; i < newSize; i++)
            System.out.print(arr[i] + " ");
    }
}
