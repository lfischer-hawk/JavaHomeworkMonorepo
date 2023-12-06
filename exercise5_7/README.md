## Module 5: Exercise 5.7
5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year.

In one year, the tuition will be $10,500.

Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.

# Purpose of Technical Implementation
Use iteration to calculate tuition over a number of years.

# Psuedocode
```printf("Interest is {apply_interest(10)}")
totalcost = range(11, 14).map(apply_interest).sum()
printf("Total cost is {totalcost}")
```