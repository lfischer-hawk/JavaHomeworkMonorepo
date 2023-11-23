## Module 3: Exercise 3.11
3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month.

# Purpose of Technical Implementation
Use an array, functions, and a switch statement to find the length of any given month of a year.
# Psuedocode
```month = input("Month")
year = input("Year")
 
Months = [jan, feb... dec]
 
days = switch month:
 11, 4, 6, 9 => 30
 2 if leapyear(2) => 29
 2 => 28
 default => 31
 
print("$Months[month] had $days")```
 
