## Module 7: Exercise 7.8
7.8 (Average an array) Write two overloaded methods that return the average of an array with the following headers:

public static int average(int[] array)

public static double average(double[] array)

Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.

# Purpose of Technical Implementation
Write two overloaded methods to handle different types of data.

# Psuedocode
```input = input("10 doubles")
print(average(input))

fn average(int[] array) -> int {
    return sum(array) / len(array)
}

fn average(double[] array) -> double {
    return sum(array) / len(array)
}
```