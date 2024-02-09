import java.util.Arrays;
import java.util.Scanner;

public class Array115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[i] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            int max = a[i];
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (max > a[j]) {
                    max = a[j];
                    index = j;
                }
            }
            int c = a[i];
            a[i] = a[index];
            a[index] = c;
            int l = b[i];
            b[i] = b[index];
            b[index] = l;
        }
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
