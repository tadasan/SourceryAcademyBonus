# Sourcery Academy Bonus Task

Write a program to check if a number is a magic or not.

A magic number is an integer in which permutations of the digits are successive multiples of the number (number of digits and order does not change, but can start from different position).

## Getting Started

To solve "magic number" problem, I tried to use the easiest solution. On wikipedia I have found formula of cyclic number: [Link here](https://wikimedia.org/api/rest_v1/media/math/render/svg/1d34c8fd8cb6da254d26e8066c4a43457908c53f)

So I just reversed problem and tested input number with the function "isMagic()", based by the given formula.

### Prerequisites

*Install JDK
*Any IDE supporting Java.

## Running the tests

You only need to change "NUMBER" variable, located on line 3 in magic.java file.

### Tests

Giving number 142857, gets you result of "Duotasis skaičius yra magiškas";

Giving any other number gets you result of "Duotasis skaičius nėra magiškas";

There is only one number which gives positive result. In fact there should be more accepted numbers, but they are out of long type variable length and as long as this program uses 8 bit integer system, we are not able to test these other numbers.

```
Give an example
```

## Authors

Tadas Andriuška - Kaunas University of Technology 4th year Student
