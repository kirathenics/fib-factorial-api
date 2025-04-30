package com.example.fib_factorial_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Fibonacci and Factorial API application.
 * <p>
 * This Spring Boot application provides REST endpoints for generating
 * Fibonacci sequences and factorial values.
 *
 * <p>Endpoints:</p>
 * <ul>
 *     <li><code>GET /api/fibonacci?n=10</code> - Get first n Fibonacci numbers</li>
 *     <li><code>GET /api/factorial?n=5</code> - Get first n factorials</li>
 * </ul>
 *
 * <p>Validation is applied to the request parameters to ensure n is within
 * accepted limits (e.g., 1–92 for Fibonacci, 1–128 for factorials).</p>
 */
@SpringBootApplication
public class FibFactorialApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibFactorialApiApplication.class, args);
	}

}
