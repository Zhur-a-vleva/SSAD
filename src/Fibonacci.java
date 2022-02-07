import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f = 0;
        int s = 1;
        long m = System.currentTimeMillis();
        if (n == 1) {
            System.out.println(s);
        }
        else {
            for (int i = 0; i < n - 1; ++i) {
                int sum = f + s;
                f = s;
                s = sum;
            }
            System.out.println(s);
        }
        System.out.println((System.currentTimeMillis() - m));
    }
}