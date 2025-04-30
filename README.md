# Fibonacci & Factorial REST API

## Description

A Spring Boot REST service that provides two endpoints for generating:

- First `n` Fibonacci numbers (from 1 to 92 inclusive)
- First `n` factorial (from 1 to 128 inclusive)

# Example Requests

Get Fibonacci Numbers
```http
GET /api/fibonacci?n=10
```

Response:
```
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

Get Factorial
```http
GET /api/factorial?n=5
```

Response:
```
[1, 1, 2, 6, 24]
```
