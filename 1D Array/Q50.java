import java.util.*;

class Q50_MedianTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        int[] c = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2)
            c[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];

        while (i < n1) c[k++] = a[i++];
        while (j < n2) c[k++] = b[j++];

        int n = c.length;
        if (n % 2 == 0)
            System.out.println((c[n/2 - 1] + c[n/2]) / 2.0);
        else
            System.out.println(c[n/2]);
    }
}
