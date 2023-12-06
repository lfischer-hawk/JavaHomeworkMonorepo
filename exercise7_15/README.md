## Module 7: Exercise 7.15
7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the result.

# Purpose of Technical Implementation
Write an algorithm to remove duplicates from an array.

# Psuedocode
```input = input("10 ints")
print(eliminateDuplicates(input))

fn eliminate Duplicates(int[] array) -> int[] {
    bool[] duplicate_mask = bool[array.length]
    for i in 0 -> array.length-1 {
        for j in i + 1 -> array.length {
            if array[i] == array [j] {
                duplicate_mask[i] = true
            }
        }
    }

    unique_number_count = 0
    for b in duplicate_mask {
        if b == false { unique_number_count++ }
    }

    int[] output = int[unique_number_count]
    int output_cursor = 0

    for i in 0 -> dupemask.length {
        if dupemask[i] == false {
            output[output_cursor++] = array[i]
        }
    }

    return output
}
```