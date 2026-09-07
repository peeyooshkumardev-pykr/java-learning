# Special Practice --- Mathematical, Formula-Based & Algorithmic Problem Solving

## 50 Questions --- Mathematics + Loops Only

### Practice Rules

-   Use only Java loops: `for`, `while`, or `do-while`.
-   Use mathematical calculations, formulas, and number-based logic.
-   No arrays.
-   No user-defined methods/functions.
-   No recursion.
-   No String-based logic.
-   No collections or data structures.
-   Each question is designed to be different from the others.
-   Use the normal `main()` method and basic variables/input only.
-   Solve the questions in order from Q01 to Q50.

------------------------------------------------------------------------

## Q01 --- Print an Arithmetic Sequence

Take the starting value, common difference, and number of terms. Print
the arithmetic sequence.

**Example:**

``` text
Enter Starting Value = 3
Enter Difference = 4
Enter N = 6

3 7 11 15 19 23
```

------------------------------------------------------------------------

## Q02 --- Print a Geometric Sequence

Take the starting value, common ratio, and number of terms. Print the
geometric sequence.

**Example:**

``` text
Enter Starting Value = 2
Enter Ratio = 3
Enter N = 5

2 6 18 54 162
```

------------------------------------------------------------------------

## Q03 --- Find the Sum of Squares

Take an integer `N` and calculate:

``` text
1² + 2² + 3² + ... + N²
```

**Example:**

``` text
Enter N = 5

Sum = 55
```

------------------------------------------------------------------------

## Q04 --- Find the Sum of Cubes

Take an integer `N` and calculate:

``` text
1³ + 2³ + 3³ + ... + N³
```

**Example:**

``` text
Enter N = 4

Sum = 100
```

------------------------------------------------------------------------

## Q05 --- Print the First N Triangular Numbers

Take an integer `N` and print the first `N` triangular numbers.

**Example:**

``` text
Enter N = 5

1 3 6 10 15
```

------------------------------------------------------------------------

## Q06 --- Find the Sum of an Arithmetic Series

Take the first term, common difference, and number of terms. Print the
series and find its sum using a loop.

**Example:**

``` text
Enter First Term = 3
Enter Difference = 2
Enter N = 5

Series: 3 5 7 9 11
Sum = 35
```

------------------------------------------------------------------------

## Q07 --- Find the Sum of a Geometric Series

Take the first term, common ratio, and number of terms. Print the series
and find its sum using a loop.

**Example:**

``` text
Enter First Term = 2
Enter Ratio = 3
Enter N = 5

Series: 2 6 18 54 162
Sum = 242
```

------------------------------------------------------------------------

## Q08 --- Find the Sum of an Alternating Series

Take an integer `N` and calculate:

``` text
1 - 2 + 3 - 4 + 5 - ... ± N
```

**Example:**

``` text
Enter N = 6

Sum = -3
```

------------------------------------------------------------------------

## Q09 --- Find the Sum of the Harmonic Series

Take an integer `N` and calculate:

``` text
1/1 + 1/2 + 1/3 + ... + 1/N
```

**Example:**

``` text
Enter N = 4

Sum = 2.0833
```

------------------------------------------------------------------------

## Q10 --- Generate the Fibonacci Sequence

Take an integer `N` and print the first `N` Fibonacci numbers.

**Example:**

``` text
Enter N = 8

0 1 1 2 3 5 8 13
```

------------------------------------------------------------------------

## Q11 --- Find the Sum of Fibonacci Numbers

Take an integer `N` and find the sum of the first `N` Fibonacci numbers.

**Example:**

``` text
Enter N = 7

Fibonacci: 0 1 1 2 3 5 8
Sum = 20
```

------------------------------------------------------------------------

## Q12 --- Calculate a Factorial Series

Take an integer `N` and calculate:

``` text
1! + 2! + 3! + ... + N!
```

**Example:**

``` text
Enter N = 5

Sum = 153
```

------------------------------------------------------------------------

## Q13 --- Approximate the Value of e

Take an integer `N` and calculate an approximation of `e` using:

``` text
e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
```

**Example:**

``` text
Enter N = 5

Approximate e = 2.7167
```

------------------------------------------------------------------------

## Q14 --- Find nCr Using Loops

Take `n` and `r` and calculate:

``` text
nCr = n! / (r! × (n-r)!)
```

**Example:**

``` text
Enter n = 5
Enter r = 2

nCr = 10
```

------------------------------------------------------------------------

## Q15 --- Print Pascal's Triangle

Take an integer `N` and print Pascal's Triangle.

**Example:**

``` text
Enter N = 5

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

------------------------------------------------------------------------

## Q16 --- Find the Sum of Proper Divisors

Take an integer `N` and find the sum of all positive divisors excluding
`N` itself.

**Example:**

``` text
Enter N = 12

Proper Divisor Sum = 16
```

------------------------------------------------------------------------

## Q17 --- Check Whether a Number is Abundant

A number is abundant when the sum of its proper divisors is greater than
the number itself.

**Example:**

``` text
Enter N = 12

12 is an Abundant Number
```

------------------------------------------------------------------------

## Q18 --- Check Whether a Number is Deficient

A number is deficient when the sum of its proper divisors is less than
the number itself.

**Example:**

``` text
Enter N = 10

10 is a Deficient Number
```

------------------------------------------------------------------------

## Q19 --- Find the Number of Perfect Squares in a Range

Take two integers and count how many perfect squares exist between them,
including both endpoints.

**Example:**

``` text
Enter Start = 1
Enter End = 50

Perfect Squares:
1 4 9 16 25 36 49

Count = 7
```

------------------------------------------------------------------------

## Q20 --- Print the First N Perfect Squares

Take an integer `N` and print the first `N` positive perfect squares.

**Example:**

``` text
Enter N = 6

1 4 9 16 25 36
```

------------------------------------------------------------------------

## Q21 --- Check Whether a Number is Automorphic

A number is automorphic if its square ends with the number itself.

**Example:**

``` text
Enter N = 25

25² = 625

25 is Automorphic
```

------------------------------------------------------------------------

## Q22 --- Check Whether a Number is a Harshad Number

A number is a Harshad number if it is divisible by the sum of its
digits.

**Example:**

``` text
Enter N = 18

Digit Sum = 9

18 is a Harshad Number
```

------------------------------------------------------------------------

## Q23 --- Check Whether a Number is Happy

Repeatedly replace a number with the sum of the squares of its digits.
Determine whether it eventually reaches `1`.

**Example:**

``` text
Enter N = 19

19 → 82 → 68 → 100 → 1

19 is a Happy Number
```

------------------------------------------------------------------------

## Q24 --- Generate the Collatz Sequence

Take an integer `N`.

-   If `N` is even, divide it by `2`.
-   If `N` is odd, multiply it by `3` and add `1`.
-   Continue until the number becomes `1`.

**Example:**

``` text
Enter N = 6

6 3 10 5 16 8 4 2 1
```

------------------------------------------------------------------------

## Q25 --- Find the Digital Root

Take an integer and repeatedly add its digits until only one digit
remains.

**Example:**

``` text
Enter N = 9875

9 + 8 + 7 + 5 = 29
2 + 9 = 11
1 + 1 = 2

Digital Root = 2
```

------------------------------------------------------------------------

## Q26 --- Find the Sum of a Factorial Series with Alternating Signs

Take an integer `N` and calculate:

``` text
1! - 2! + 3! - 4! + ... ± N!
```

**Example:**

``` text
Enter N = 5

1! - 2! + 3! - 4! + 5!

Result = 101
```

------------------------------------------------------------------------

## Q27 --- Find the Number of Ways to Climb N Steps

You can climb either `1` step or `2` steps at a time. Find the number of
different ways to reach the `N`th step.

**Example:**

``` text
Enter N = 5

Number of Ways = 8
```

------------------------------------------------------------------------

## Q28 --- Generate the Catalan Numbers

Take an integer `N` and print the first `N` Catalan numbers.

**Example:**

``` text
Enter N = 6

1 1 2 5 14 42
```

------------------------------------------------------------------------

## Q29 --- Find the Sum of a Polynomial Series

Take `N` and `x` and calculate:

``` text
1 + 2x + 3x² + 4x³ + ... + Nxⁿ⁻¹
```

**Example:**

``` text
Enter N = 4
Enter x = 2

1 + 4 + 12 + 32

Sum = 49
```

------------------------------------------------------------------------

## Q30 --- Approximate the Value of sin(x)

Take `x` and `N` and approximate `sin(x)` using the first `N` terms of
the Taylor series.

Use:

``` text
sin(x) = x - x³/3! + x⁵/5! - x⁷/7! + ...
```

**Example:**

``` text
Enter x = 1
Enter N = 5

Approximate sin(1) = 0.84147
```

------------------------------------------------------------------------

# Advanced Mathematical Loop Problems

## Q31 --- Check Whether a Number is Prime

Take an integer `N` and determine whether it is prime using a loop.

**Example:**

``` text
Enter N = 29

29 is a Prime Number
```

------------------------------------------------------------------------

## Q32 --- Print All Prime Numbers in a Range

Take `Start` and `End` and print every prime number in that range.

**Example:**

``` text
Enter Start = 10
Enter End = 30

Primes:
11 13 17 19 23 29
```

------------------------------------------------------------------------

## Q33 --- Find the GCD of Two Numbers

Take two positive integers and find their greatest common divisor using
repeated division/remainder logic.

**Example:**

``` text
Enter A = 48
Enter B = 18

GCD = 6
```

------------------------------------------------------------------------

## Q34 --- Find the LCM of Two Numbers

Take two positive integers and find their least common multiple using
loops.

**Example:**

``` text
Enter A = 12
Enter B = 18

LCM = 36
```

------------------------------------------------------------------------

## Q35 --- Check Whether Two Numbers are Co-Prime

Take two positive integers and determine whether their GCD is `1`.

**Example:**

``` text
Enter A = 14
Enter B = 25

14 and 25 are Co-Prime
```

------------------------------------------------------------------------

## Q36 --- Find All Factors of a Number

Take an integer `N` and print all positive factors of `N`.

**Example:**

``` text
Enter N = 24

Factors:
1 2 3 4 6 8 12 24
```

------------------------------------------------------------------------

## Q37 --- Count the Number of Factors

Take an integer `N` and count how many positive factors it has.

**Example:**

``` text
Enter N = 24

Number of Factors = 8
```

------------------------------------------------------------------------

## Q38 --- Check Whether a Number is Perfect

A number is perfect when the sum of its proper divisors is exactly equal
to the number.

**Example:**

``` text
Enter N = 28

28 is a Perfect Number
```

------------------------------------------------------------------------

## Q39 --- Print All Perfect Numbers in a Range

Take `Start` and `End` and print all perfect numbers within the range.

**Example:**

``` text
Enter Start = 1
Enter End = 1000

Perfect Numbers:
6 28 496
```

------------------------------------------------------------------------

## Q40 --- Find the Sum of Prime Numbers in a Range

Take `Start` and `End` and calculate the sum of all prime numbers in
that range.

**Example:**

``` text
Enter Start = 1
Enter End = 20

Prime Sum = 77
```

------------------------------------------------------------------------

# Challenging Mathematical Loop Problems

## Q41 --- Check Whether a Number is an Armstrong Number

Take an integer `N`. Find the number of digits, raise each digit to that
number of digits, add the results, and determine whether the sum equals
the original number.

**Example:**

``` text
Enter N = 153

1³ + 5³ + 3³ = 153

153 is an Armstrong Number
```

------------------------------------------------------------------------

## Q42 --- Print All Armstrong Numbers in a Range

Take `Start` and `End` and print every Armstrong number in that range.

**Example:**

``` text
Enter Start = 1
Enter End = 500

Armstrong Numbers:
1 2 3 4 5 6 7 8 9 153 370 371 407
```

------------------------------------------------------------------------

## Q43 --- Check Whether a Number is a Strong Number

A number is strong if the sum of the factorials of its digits equals the
original number.

**Example:**

``` text
Enter N = 145

1! + 4! + 5! = 145

145 is a Strong Number
```

------------------------------------------------------------------------

## Q44 --- Print All Strong Numbers in a Range

Take `Start` and `End` and print all Strong numbers in that range.

**Example:**

``` text
Enter Start = 1
Enter End = 500

Strong Numbers:
1 2 145
```

------------------------------------------------------------------------

## Q45 --- Check Whether a Number is a Palindromic Number

Take an integer and reverse its digits using a loop. Determine whether
the reversed number is equal to the original number.

**Example:**

``` text
Enter N = 1221

Reverse = 1221

1221 is a Palindromic Number
```

------------------------------------------------------------------------

## Q46 --- Find the Multiplicative Persistence

Take a positive integer. Repeatedly multiply its digits until a single
digit remains. Count how many multiplication steps are required.

**Example:**

``` text
Enter N = 39

3 × 9 = 27
2 × 7 = 14
1 × 4 = 4

Multiplicative Persistence = 3
```

------------------------------------------------------------------------

## Q47 --- Find the Additive Persistence

Take a positive integer. Repeatedly add its digits until a single digit
remains. Count how many addition steps are required.

**Example:**

``` text
Enter N = 9875

9 + 8 + 7 + 5 = 29
2 + 9 = 11
1 + 1 = 2

Additive Persistence = 3
```

------------------------------------------------------------------------

## Q48 --- Find the Nth Term of a Recurrence Sequence

Take `N` and generate the sequence defined by:

``` text
T₁ = 2
T₂ = 3
Tₙ = Tₙ₋₁ + 2Tₙ₋₂
```

Print the first `N` terms.

**Example:**

``` text
Enter N = 7

2 3 7 13 27 53 107
```

------------------------------------------------------------------------

## Q49 --- Find the Sum of a Reciprocal Power Series

Take `N` and calculate:

``` text
1/1² + 1/2² + 1/3² + ... + 1/N²
```

Print the result with suitable decimal precision.

**Example:**

``` text
Enter N = 4

Sum = 1.4236
```

------------------------------------------------------------------------

## Q50 --- Approximate the Square Root Using Newton's Method

Take a positive number `A` and a number of iterations `N`. Approximate
`√A` using:

``` text
x(next) = (x + A/x) / 2
```

Start with an initial estimate and repeat the formula `N` times.

**Example:**

``` text
Enter A = 25
Enter Iterations = 5

Approximate Square Root = 5.0
```

------------------------------------------------------------------------

# Progress

  Section                          Questions
  ------------------------------ -----------
  Sequences & Series                Q01--Q15
  Divisors & Number Properties      Q16--Q30
  Number Theory                     Q31--Q40
  Advanced Number Mathematics       Q41--Q50
  **Total**                           **50**


