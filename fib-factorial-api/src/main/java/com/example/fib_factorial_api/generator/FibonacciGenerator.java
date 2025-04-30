package com.example.fib_factorial_api.generator;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    public static List<Long> generate(int n) {
        List<Long> result = new ArrayList<>(n);

        long a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            result.add(a);
            long temp = a + b;
            a = b;
            b = temp;
        }

        return result;
    }
}
