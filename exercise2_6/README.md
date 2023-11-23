## Module 2: Exercise 2.6
*2.5 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.

# Purpose of Technical Implementation
Demonstrate the use of simple parsing of user input in the production of a tip calculator
# Psuedocode
```
string input = input("Enter the subtotal and gratuity rate")
list<string> inputlist = input.split(" ")
double subtotal = (double)inputlist[0]
double gratuity = (double)inputlist[1] / 100
print("The gratuity is {gratuity * subtotal} and the total is {subtotal + gratuity * subtotal}")
```