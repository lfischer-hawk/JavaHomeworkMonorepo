## Module 6: Exercise 6.2
6.2 (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:

public static int sumDigits(long n)

# Purpose of Technical Implementation
Write a method and loops to repeat a computation.

# Psuedocode
```fn SumDigits(int n) -> n {
    int sum = 0
    while n > 0 {
        sum += n % 10
        n /= 10
    }
    return sum
}
```