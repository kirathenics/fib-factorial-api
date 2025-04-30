package com.example.fib_factorial_api.controller;

import com.example.fib_factorial_api.entity.FactorialRequestBody;
import com.example.fib_factorial_api.entity.FibonacciRequestBody;
import com.example.fib_factorial_api.generator.FactorialGenerator;
import com.example.fib_factorial_api.generator.FibonacciGenerator;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;


/**
 * REST controller providing endpoints for generating
 * Fibonacci numbers and factorial.
 */
@RestController
@RequestMapping("/api")
public class MainController {

    /**
     * GET endpoint that generates the first {@code n} Fibonacci numbers.
     * Accepts a validated request object with the parameter {@code n}
     * passed as query parameters.
     *
     * Example: /api/fibonacci?n=10
     *
     * @param requestBody validated request with integer {@code n}
     * @return list of {@code n} Fibonacci numbers
     */
    @GetMapping("/fibonacci")
    public List<Long> getFibonacci(@Validated FibonacciRequestBody requestBody) {
        return FibonacciGenerator.generate(requestBody.getN());
    }

    /**
     * GET endpoint that generates the first {@code n} factorial values.
     * Accepts a validated request object with the parameter {@code n}
     * passed as query parameters.
     *
     * Example: /api/factorial?n=5
     *
     * @param requestBody validated request with integer {@code n}
     * @return list of {@code n} factorial BigInteger
     */
    @GetMapping("/factorial")
    public List<BigInteger> getFactorial(@Validated FactorialRequestBody requestBody) {
        return FactorialGenerator.generate(requestBody.getN());
    }
}
