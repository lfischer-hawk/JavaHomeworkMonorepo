## Module 9: Exercise 9.8
9.8 (The Fan class) Design a class named Fan to represent a fan. The class contains:

- [x] Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
- [x] A private int data field named speed that specifies the speed of the fan (the default is SLOW).
- [x] A private boolean data field named on that specifies whether the fan is on (the default is false).
- [x] A private double data field named radius that specifies the radius of the fan (the default is 5).
- [x] A string data field named color that specifies the color of the fan (the default is blue).
- [x] The accessor and mutator methods for all four data fields.
- [x] A no-arg constructor that creates a default fan.
- [x] A method named toString() that returns a string description for the fan.
- [x] If the fan is on, the method returns the fan speed, color, and radius in one combined string.
- [x] If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string
--------------------------------------------------------------------

- [x] Write a test program that creates two Fan objects.

- [x] Assign maximum speed, radius 10, color yellow, and turn it on to the first object.
- [x] Assign medium speed, radius 5, color blue, and turn it off to the second object.
- [x] Display the objects by invoking their toString method.

# Purpose of Technical Implementation
Demonstrate a separate class with data fields, accessors, mutators, default values, and a method.
# Psuedocode
```
class Fan {
    speed = SLOW
    on = false
    radius = 5.0
    color = "Blue"

    String toString() {
        if on {
            return "{speed}, {color}, {radius}"
        } else {
            return "Off. {Color}, {radius}"
        }
    }
}