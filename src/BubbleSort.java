import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 10000;
        int[] a = new int[n];
        String[] input = reader.readLine().split(", ");
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(input[i]);
        }
        int i = 0;
        boolean t = true;
        long m = System.currentTimeMillis();
        while (t) {
            t = false;
            for (int j = 0; j <= n - i - 2; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    t = true;
                }
            }
            ++i;
        }
        System.out.println((System.currentTimeMillis() - m));
        for (int el : a) {
            System.out.print(el + " ");
        }
    }
}
