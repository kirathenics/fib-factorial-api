package com.example.fib_factorial_api.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Query parameter model for requesting Fibonacci sequence generation.
 */
@Data
public class FibonacciRequestBody {

    @Valid

    @NotNull(message = "n couldn't be null")
    @Min(value = 1, message = "Minimum value for n is 1")
    @Max(value = 92, message = "Maximum value for n is 92")
    private Integer n;
}
