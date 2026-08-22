# Java Methods — Level 5: Advanced Methods & Problem Solving

### Q01 — Method Calling Multiple Methods

Create a program that accepts two integers and uses separate methods to:

* Find their sum
* Find their difference
* Find their product
* Find their quotient
* Find the remainder

Use another method named `displayResults()` to display all results.

Example:

```text
Enter first number = 20
Enter second number = 6

Sum = 26
Difference = 14
Product = 120
Quotient = 3
Remainder = 2
```

---

### Q02 — Method Calling Another Method

Create methods named:

* `isEven()`
* `isPositive()`
* `analyzeNumber()`

The `analyzeNumber()` method should call the other methods and display the results.

Example:

```text
Enter number = 24

Positive = true
Even = true
```

---

### Q03 — Create a Number Utility Program

Create separate methods to:

* Count digits
* Sum digits
* Reverse the number
* Find the largest digit
* Find the smallest digit

Call all methods from `main()`.

Example:

```text
Enter number = 58329

Digits = 5
Sum = 27
Reverse = 92385
Largest digit = 9
Smallest digit = 2
```

---

### Q04 — Prime Number Utility

Create separate methods to:

* Check whether a number is prime
* Print all prime numbers in a range
* Count prime numbers in a range
* Find the first prime number in a range

Example:

```text
Enter start = 10
Enter end = 30

Prime numbers:
11 13 17 19 23 29

Prime count = 6
First prime = 11
```

---

### Q05 — Number Classification Using Methods

Create methods to check whether a number is:

* Even or odd
* Positive or negative
* Prime or not
* Palindrome or not

Create one `analyzeNumber()` method that calls all these methods.

Example:

```text
Enter number = 121

Even = false
Positive = true
Prime = false
Palindrome = true
```

---

### Q06 — Factorial and Combination Calculator

Create methods to calculate:

* Factorial
* Permutation
* Combination

Use the factorial method inside the permutation and combination methods.

Example:

```text
Enter n = 5
Enter r = 2

Factorial of n = 120
Permutation = 20
Combination = 10
```

---

### Q07 — Mathematical Utility Methods

Create separate methods to calculate:

* Power
* Square
* Cube
* Absolute value
* Maximum
* Minimum

Use appropriate parameters and return values.

Example:

```text
Enter number = -5

Square = 25
Cube = -125
Absolute = 5
```

---

### Q08 — Array Statistics Using Methods

Create separate methods to find:

* Sum
* Average
* Largest
* Smallest
* Range (`largest - smallest`)

for an integer array.

Example:

```text
Array:
10 25 7 40 18

Sum = 100
Average = 20.0
Largest = 40
Smallest = 7
Range = 33
```

---

### Q09 — Array Searching Utility

Create methods to:

* Search an element
* Find its first index
* Find its last index
* Count its occurrences

Example:

```text
Array:
10 20 30 20 40 20 50

Enter target = 20

Found = true
First index = 1
Last index = 5
Occurrences = 3
```

---

### Q10 — Array Transformation Using Methods

Create separate methods to:

* Print the original array
* Print the reversed array
* Print only even elements
* Print only odd elements
* Print positive elements

Example:

```text
Array:
10 -5 20 13 -8 30

Reversed:
30 -8 13 20 -5 10

Even:
10 20 -8 30

Odd:
-5 13

Positive:
10 20 13 30
```

---

### Q11 — Find Duplicate Elements Using Methods

Create a method named `printDuplicates()` that accepts an integer array and prints all elements that occur more than once.

Example:

```text
Array:
10 20 10 30 20 40 10

Duplicate elements:
10 20
```

---

### Q12 — Find Frequency Using Methods

Create a method named `printFrequency()` that accepts an integer array and prints the frequency of every distinct element.

Example:

```text
Array:
10 20 10 30 20 10

Frequency:
10 = 3
20 = 2
30 = 1
```

---

### Q13 — Compare Two Arrays Using Methods

Create separate methods to determine:

* Whether two arrays are equal
* Which array has the larger sum
* Which array has more elements

Example:

```text
First array:
10 20 30

Second array:
10 20 40

Equal = false
Array with larger sum = Second array
Array with more elements = Same
```

---

### Q14 — Array Sorting Using Methods

Create a method named `sortArray()` that sorts an integer array in ascending order.

Create another method named `printArray()` to display the result.

Example:

```text
Original:
40 10 30 20 50

Sorted:
10 20 30 40 50
```

---

### Q15 — Array Search and Sorting Program

Create separate methods to:

* Sort the array
* Search an element
* Find its index
* Find the largest element
* Find the second-largest element

Example:

```text
Array:
40 10 30 20 50

Sorted:
10 20 30 40 50

Largest = 50
Second largest = 40

Enter target = 30
Found = true
Index = 2
```

---

### Q16 — String Utility Using Methods

Create separate methods to:

* Count characters
* Count vowels
* Count consonants
* Count digits
* Count spaces

Example:

```text
Enter string = Java 123

Characters = 8
Vowels = 2
Consonants = 2
Digits = 3
Spaces = 1
```

---

### Q17 — String Analysis Using Methods

Create methods to check whether a String is:

* Empty
* Numeric
* Palindrome
* All uppercase
* All lowercase

Example:

```text
Enter string = MADAM

Empty = false
Numeric = false
Palindrome = true
Uppercase = true
Lowercase = false
```

---

### Q18 — Character Frequency Using Methods

Create a method that accepts a String and prints the frequency of every character.

Example:

```text
Enter string = programming

Frequency:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1
```

---

### Q19 — String Searching Utility

Create separate methods to:

* Search for a character
* Count a character
* Find the first occurrence
* Find the last occurrence

Example:

```text
Enter string = programming
Enter character = g

Found = true
Count = 2
First occurrence = 3
Last occurrence = 10
```

---

### Q20 — String Transformation Using Methods

Create separate methods to:

* Reverse a String
* Convert it to uppercase
* Convert it to lowercase
* Remove spaces

Example:

```text
Enter string = Java Programming

Reverse = gnimmargorP avaJ
Uppercase = JAVA PROGRAMMING
Lowercase = java programming
Without spaces = JavaProgramming
```

---

### Q21 — Method Returning an Array

Create a method named `getEvenNumbers()` that accepts an integer array and returns an array containing only its even elements.

Example:

```text
Original array:
10 15 22 31 40 51

Even elements:
10 22 40
```

---

### Q22 — Method Returning a Reversed Array

Create a method named `reverseArray()` that accepts an integer array and returns a new reversed array.

Example:

```text
Original:
10 20 30 40 50

Returned reversed array:
50 40 30 20 10
```

---

### Q23 — Method Returning Unique Elements

Create a method named `getUniqueElements()` that accepts an integer array and returns an array containing only distinct elements.

Example:

```text
Original:
10 20 10 30 20 40

Unique:
10 20 30 40
```

---

### Q24 — Multiple Methods Working With One Result

Create a program where:

* One method calculates the sum of an array.
* Another method calculates the average using the sum method.
* Another method determines whether the average is greater than 50.

Example:

```text
Array:
40 60 80 20

Sum = 200
Average = 50.0
Average greater than 50 = false
```

---

### Q25 — Student Result Calculator

Create separate methods to:

* Calculate total marks
* Calculate percentage
* Determine grade
* Determine pass/fail

The grade method should use the percentage returned by the percentage method.

Example:

```text
Enter marks of 5 subjects:
80 75 90 65 85

Total = 395
Percentage = 79.0
Grade = B
Result = Pass
```

---

### Q26 — Simple Calculator Using Methods

Create a calculator program using separate methods for:

* Addition
* Subtraction
* Multiplication
* Division
* Modulus

Use a menu to allow the user to select an operation.

Example:

```text
Enter first number = 20
Enter second number = 5

1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus

Enter choice = 3

Result = 100
```

---

### Q27 — Number Menu Program Using Methods

Create a menu-driven program with methods for:

1. Check prime
2. Check palindrome
3. Check Armstrong
4. Check perfect number
5. Reverse number
6. Sum of digits
7. Exit

Example:

```text
Enter number = 153

1. Prime
2. Palindrome
3. Armstrong
4. Perfect
5. Reverse
6. Sum of digits
7. Exit

Enter choice = 3

Armstrong = true
```

---

### Q28 — Array Menu Program Using Methods

Create a menu-driven array program with methods for:

1. Print array
2. Find sum
3. Find average
4. Find largest
5. Find smallest
6. Search element
7. Reverse array
8. Sort array
9. Exit

Example:

```text
Array:
40 10 30 20 50

1. Print Array
2. Sum
3. Average
4. Largest
5. Smallest
6. Search
7. Reverse
8. Sort
9. Exit

Enter choice = 8

Sorted:
10 20 30 40 50
```

---

### Q29 — Build a Student Management Program Using Methods

Create a program that stores student information and uses separate methods to:

* Enter student details
* Display student details
* Calculate total marks
* Calculate percentage
* Determine grade
* Determine pass/fail

Use methods so that `main()` mainly controls the program flow.

Example:

```text
Enter student name = Peeyoosh
Enter marks:
85 78 92 74 88

Name = Peeyoosh
Total = 417
Percentage = 83.4
Grade = A
Result = Pass
```

---

### Q30 — Final Methods Mastery Project

Create a complete **Java Utility Program** using methods.

The program should contain a menu with multiple categories:

```text
========== JAVA UTILITY PROGRAM ==========

1. Number Utilities
2. Array Utilities
3. String Utilities
4. Calculator
5. Exit
```

### Number Utilities

Include methods for:

* Prime check
* Palindrome check
* Armstrong check
* Perfect number check
* Factorial
* Reverse
* Sum of digits
* GCD
* LCM

### Array Utilities

Include methods for:

* Print array
* Sum
* Average
* Largest
* Smallest
* Search
* Frequency
* Remove duplicates
* Reverse
* Sort

### String Utilities

Include methods for:

* Character count
* Vowel count
* Consonant count
* Digit count
* Reverse
* Palindrome check
* Character frequency
* Uppercase conversion
* Lowercase conversion

### Calculator

Include methods for:

* Addition
* Subtraction
* Multiplication
* Division
* Modulus
* Power

Example:

```text
========== JAVA UTILITY PROGRAM ==========

1. Number Utilities
2. Array Utilities
3. String Utilities
4. Calculator
5. Exit

Enter choice = 1

========== NUMBER UTILITIES ==========

1. Prime
2. Palindrome
3. Armstrong
4. Perfect Number
5. Factorial
6. Reverse
7. Sum of Digits
8. GCD
9. LCM
10. Back

Enter choice = 3

Enter number = 153

Armstrong = true
```

---

# 🎯 Level 5 Complete — 30 Questions

By completing all 30, you will have practiced:

```text
Methods
   ↓
Parameters
   ↓
Return values
   ↓
void methods
   ↓
if-else
   ↓
Loops
   ↓
Numbers
   ↓
Arrays
   ↓
Strings
   ↓
Methods calling methods
   ↓
Methods returning arrays
   ↓
Method composition
   ↓
Menu-driven programs
   ↓
Multiple methods working together
   ↓
Program design
```