package com.example.fib_factorial_api.entity;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Query parameter model for requesting Factorial sequence generation.
 */
@Data
public class FactorialRequestBody {

    @Valid

    @NotNull(message = "n couldn't be null")
    @Min(value = 1, message = "Minimum value for n is 1")
    @Max(value = 128, message = "Maximum value for n is 128")
    private Integer n;
}
