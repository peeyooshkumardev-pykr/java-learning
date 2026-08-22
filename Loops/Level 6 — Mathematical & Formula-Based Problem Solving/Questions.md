# Loop Level 6 — Mathematical, Formula-Based & Algorithmic Problem Solving

### Q01 — Print an Arithmetic Sequence

Take the starting value, common difference, and number of terms. Print the arithmetic sequence.

Example:

```text
Enter Starting Value = 3
Enter Difference = 4
Enter N = 6

3 7 11 15 19 23
```

### Q02 — Print a Geometric Sequence

Take the starting value, common ratio, and number of terms. Print the geometric sequence.

Example:

```text
Enter Starting Value = 2
Enter Ratio = 3
Enter N = 5

2 6 18 54 162
```

### Q03 — Find the Sum of Squares

Take an integer `N` and calculate:

```text
1² + 2² + 3² + ... + N²
```

Example:

```text
Enter N = 5

Sum = 55
```

### Q04 — Find the Sum of Cubes

Take an integer `N` and calculate:

```text
1³ + 2³ + 3³ + ... + N³
```

Example:

```text
Enter N = 4

Sum = 100
```

### Q05 — Print the First N Triangular Numbers

Take an integer `N` and print the first `N` triangular numbers.

Example:

```text
Enter N = 5

1 3 6 10 15
```

### Q06 — Find the Sum of an Arithmetic Series

Take the first term, common difference, and number of terms. Find the sum using a loop.

Example:

```text
Enter First Term = 3
Enter Difference = 2
Enter N = 5

Series: 3 5 7 9 11
Sum = 35
```

### Q07 — Find the Sum of a Geometric Series

Take the first term, common ratio, and number of terms. Find the sum using a loop.

Example:

```text
Enter First Term = 2
Enter Ratio = 3
Enter N = 5

Series: 2 6 18 54 162
Sum = 242
```

### Q08 — Find the Sum of an Alternating Series

Take an integer `N` and calculate:

```text
1 - 2 + 3 - 4 + 5 - ... ± N
```

Example:

```text
Enter N = 6

Sum = -3
```

### Q09 — Find the Sum of the Harmonic Series

Take an integer `N` and calculate:

```text
1/1 + 1/2 + 1/3 + ... + 1/N
```

Example:

```text
Enter N = 4

Sum = 2.0833
```

### Q10 — Generate the Fibonacci Sequence

Take an integer `N` and print the first `N` Fibonacci numbers.

Example:

```text
Enter N = 8

0 1 1 2 3 5 8 13
```

### Q11 — Find the Sum of Fibonacci Numbers

Take an integer `N` and find the sum of the first `N` Fibonacci numbers.

Example:

```text
Enter N = 7

Fibonacci: 0 1 1 2 3 5 8
Sum = 20
```

### Q12 — Calculate a Factorial Series

Take an integer `N` and calculate:

```text
1! + 2! + 3! + ... + N!
```

Example:

```text
Enter N = 5

Sum = 153
```

### Q13 — Approximate the Value of e

Take an integer `N` and calculate an approximation of `e` using:

```text
e = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
```

Example:

```text
Enter N = 5

Approximate e = 2.7167
```

### Q14 — Find nCr Using Loops

Take `n` and `r` and calculate the binomial coefficient:

```text
nCr = n! / (r! × (n-r)!)
```

Example:

```text
Enter n = 5
Enter r = 2

nCr = 10
```

### Q15 — Print Pascal's Triangle

Take an integer `N` and print Pascal's Triangle.

Example:

```text
Enter N = 5

    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

### Q16 — Find the Sum of Proper Divisors

Take an integer `N` and find the sum of all positive divisors excluding the number itself.

Example:

```text
Enter N = 12

Proper Divisor Sum = 16
```

### Q17 — Check Whether a Number is Abundant

A number is abundant when the sum of its proper divisors is greater than the number itself.

Example:

```text
Enter N = 12

12 is an Abundant Number
```

### Q18 — Check Whether a Number is Deficient

A number is deficient when the sum of its proper divisors is less than the number itself.

Example:

```text
Enter N = 10

10 is a Deficient Number
```

### Q19 — Find the Number of Perfect Squares in a Range

Take two integers and count how many perfect squares exist between them.

Example:

```text
Enter Start = 1
Enter End = 50

Perfect Squares:
1 4 9 16 25 36 49

Count = 7
```

### Q20 — Print the First N Perfect Squares

Take an integer `N` and print the first `N` perfect squares.

Example:

```text
Enter N = 6

1 4 9 16 25 36
```

### Q21 — Check Whether a Number is Automorphic

A number is automorphic if its square ends with the number itself.

Example:

```text
Enter N = 25

25² = 625

25 is Automorphic
```

### Q22 — Check Whether a Number is a Harshad Number

A number is a Harshad number if it is divisible by the sum of its digits.

Example:

```text
Enter N = 18

Digit Sum = 9

18 is a Harshad Number
```

### Q23 — Check Whether a Number is Happy

Repeatedly replace a number with the sum of the squares of its digits. Determine whether it eventually reaches `1`.

Example:

```text
Enter N = 19

19 → 82 → 68 → 100 → 1

19 is a Happy Number
```

### Q24 — Generate the Collatz Sequence

Take an integer `N`.

If `N` is even, divide it by `2`.

If `N` is odd, multiply it by `3` and add `1`.

Continue until the number becomes `1`.

Example:

```text
Enter N = 6

6 3 10 5 16 8 4 2 1
```

### Q25 — Find the Digital Root

Take an integer and repeatedly add its digits until only one digit remains.

Example:

```text
Enter N = 9875

9 + 8 + 7 + 5 = 29
2 + 9 = 11
1 + 1 = 2

Digital Root = 2
```

### Q26 — Find the Sum of a Factorial Series with Alternating Signs

Take an integer `N` and calculate:

```text
1! - 2! + 3! - 4! + ... ± N!
```

Example:

```text
Enter N = 5

1! - 2! + 3! - 4! + 5!

Result = 101
```

### Q27 — Find the Number of Ways to Climb N Steps

You can climb either `1` step or `2` steps at a time. Find the number of different ways to reach the `N`th step.

Example:

```text
Enter N = 5

Number of Ways = 8
```

### Q28 — Generate the Catalan Numbers

Take an integer `N` and print the first `N` Catalan numbers.

Example:

```text
Enter N = 6

1 1 2 5 14 42
```

### Q29 — Find the Sum of a Polynomial Series

Take an integer `N` and calculate:

```text
1 + 2x + 3x² + 4x³ + ... + Nxⁿ⁻¹
```

Example:

```text
Enter N = 4
Enter x = 2

1 + 4 + 12 + 32

Sum = 49
```

### Q30 — Approximate the Value of sin(x)

Take `x` and `N` and approximate `sin(x)` using the first `N` terms of the Taylor series.

Use:

```text
sin(x) = x - x³/3! + x⁵/5! - x⁷/7! + ...
```

Example:

```text
Enter x = 1
Enter N = 5

Approximate sin(1) = 0.84147
```