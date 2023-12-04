## Module 3: Exercise 3.6 
*3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.

# Purpose of Technical Implementation
Utilize user input and if/else structure to demonstrate a BMI calculator.
# Psuedocode
```weight = input("Weight")
feet = input("Feet")
inches = input("Inches")
 
height = feet * 12 + inches
bmi = weight / (height^2 * 703)
 
if bmi < 18.5
    print("Underweight")
else if bmi < 24.9
    print("Healthy Weight")
else if bmi < 29.9
    print("Overweight")
else
    print("Obese")```