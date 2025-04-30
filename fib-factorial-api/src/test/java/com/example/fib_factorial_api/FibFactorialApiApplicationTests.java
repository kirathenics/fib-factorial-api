package com.example.fib_factorial_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FibFactorialApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testFibonacciValid() throws Exception {
		mockMvc.perform(get("/api/fibonacci?n=5"))
				.andExpect(status().isOk())
				.andExpect(content().json("[0,1,1,2,3]"));
	}

	@Test
	void testFibonacciTooLarge() throws Exception {
		mockMvc.perform(get("/api/fibonacci?n=100"))
				.andExpect(status().isBadRequest());
	}

	@Test
	void testFibonacciTooSmall() throws Exception {
		mockMvc.perform(get("/api/fibonacci?n=-10"))
				.andExpect(status().isBadRequest());
	}

	@Test
	void testFibonacciInvalid() throws Exception {
		mockMvc.perform(get("/api/fibonacci?n=test"))
				.andExpect(status().isBadRequest());
	}

	@Test
	void testFactorialValid() throws Exception {
		mockMvc.perform(get("/api/factorial?n=4"))
				.andExpect(status().isOk())
				.andExpect(content().json("[1,1,2,6]"));
	}

	@Test
	void testFactorialInvalid() throws Exception {
		mockMvc.perform(get("/api/factorial?n=test"))
				.andExpect(status().isBadRequest());
	}

	@Test
	void testFactorialTooLarge() throws Exception {
		mockMvc.perform(get("/api/factorial?n=150"))
				.andExpect(status().isBadRequest());
	}

	@Test
	void testFactorialTooSmall() throws Exception {
		mockMvc.perform(get("/api/factorial?n=-9"))
				.andExpect(status().isBadRequest());
	}
}
