package com.example.fib_factorial_api.generator;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {
    public static List<Long> generate(int n) {
        List<Long> result = new ArrayList<>(n);

        long current = 0, next = 1;

        for (int i = 1; i <= n; i++) {
            result.add(current);
            long sum = current + next;
            current = next;
            next = sum;
        }

        return result;
    }
}
