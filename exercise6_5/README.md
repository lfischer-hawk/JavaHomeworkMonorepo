## Module 6: Exercise 6.5
6.5 (Sort three numbers) Write a method with the following header to display three numbers in increasing order:

public static void displaySortedNumbers(double num1, double num2, double num3)

# Purpose of Technical Implementation
Write a method to sort three numbers.

# Psuedocode
```fn DisplaySortedNumbers(a, b, c) {
    if a > b {
        swap(a, b)
    }
    if b > c {
        swap(b, c)
    }
    if a > b {
        swap(a, b)
    }
    print(a, b, c)
}
```