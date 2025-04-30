package com.example.fib_factorial_api.generator;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FactorialGenerator {
    public static List<BigInteger> generate(int n) {
        List<BigInteger> result = new ArrayList<>(n);
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result.add(fact);
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
