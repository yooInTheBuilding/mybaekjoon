package practice_alone;

import java.util.Scanner;

public class fibonacci {
    static long[] fib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        fib = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            fib[i] = -1;
        }

        fib[0] = 0;
        fib[1] = 1;

        System.out.println(fibonacci(n));
    }

    static long fibonacci(int n) {
        if (fib[n] != -1) {
            return fib[n];
        }

        fib[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return fib[n];
    }
}