# Java Arrays - Level 2: Intermediate Array Logic

## 1. Check if Array is Sorted in Ascending Order

Take 5 integers and check whether the array is sorted in ascending order.

### Example 1

**Input:**

```text
10 30 50 15 60
```

**Output:**

```text
Not Sorted
```

### Example 2

**Input:**

```text
30 40 50 60 80
```

**Output:**

```text
Given Array is Sorted in Ascending order
```

---

## 2. Copy One Array into Another

Take 5 integers in one array and copy all elements into a second array.

### Example

**Input:**

```text
30 20 10 40 19
```

**Output:**

```text
1st Array:
30 20 10 40 19

2nd Array:
30 20 10 40 19
```

---

## 3. Count Duplicate Elements

Take 10 integers and find how many duplicate occurrences exist in the array.

A duplicate is counted when the same value appears again after its first occurrence.

### Example

**Input:**

```text
33 44 55 33 44 55 55 26 41 44
```

**Output:**

```text
Number of duplicates = 7
```

---

## 4. Count Elements Between Two Values

Take 10 integers and two numbers, `low` and `high`.

Count how many array elements are between `low` and `high`, **including both values**.

### Example

**Input:**

```text
5 67 44 33 21 56 89 77 54 23

Low = 44
High = 89
```

**Output:**

```text
Number of elements between them = 6
```

---

## 5. Count Elements Greater Than 50

Take 10 integers and count how many elements are greater than `50`.

### Example

**Input:**

```text
45 57 88 85 33 22 14 90 65 32
```

**Output:**

```text
Number of elements greater than 50 = 5
```

---

## 6. Count Positive and Negative Elements

Take 10 integers and count how many elements are positive and how many are negative.

Ignore `0`.

### Example

**Input:**

```text
33 -77 -77 -45 -44 -90 -77 33 545 55
```

**Output:**

```text
Positives:
33 33 545 55

Number of positives = 4

Negatives:
-77 -77 -45 -44 -90 -77

Number of negatives = 6
```

---

## 7. Find the Difference Between Largest and Smallest

Take 10 integers and find:

* The largest element
* The smallest element
* The difference between the largest and smallest

### Example

**Input:**

```text
30 50 10 20 80 100 866 2000 495 12
```

**Output:**

```text
Largest = 2000
Smallest = 10
Difference Between Largest & Smallest = 1990
```

---

## 8. Find Every Occurrence of an Element

Take 10 integers and another integer.

Print every index where the given number occurs.

### Example

**Input:**

```text
Array:
34 22 12 45 12 89 12 67 12 55

Number = 12
```

**Output:**

```text
2 4 6 8
```

---

## 9. Find the First Occurrence of an Element

Take 10 integers and another integer.

Find the **index of the first occurrence** of that number.

If the number does not exist, print an appropriate message.

### Example

**Input:**

```text
Array:
34 55 78 33 12 -66 -90 56 -12 33

Number = -66
```

**Output:**

```text
At Index = 5
```

---

## 10. Find the Second Largest Distinct Element

Take 10 integers and find the second largest **distinct** value.

If the largest value appears more than once, those duplicates should not be considered as the second largest value.

### Example

**Input:**

```text
45 66 77 89 23 89 66 12 78 78
```

**Output:**

```text
Largest = 89
2nd Largest = 78
```

---

## 11. Find the Second Smallest Distinct Element

Take 10 integers and find the second smallest **distinct** value.

If the smallest value appears more than once, those duplicates should not be considered as the second smallest value.

### Example

**Input:**

```text
45 67 89 32 12 44 79 12 44 78
```

**Output:**

```text
Smallest = 12
2nd Smallest = 32
```

---

## 12. Find the Frequency of Every Element

Take 10 integers and print how many times each different value occurs.

Do not print the same value's frequency more than once.

### Example

**Input:**

```text
44 56 44 44 78 78 56 32 11 32
```

**Output:**

```text
44 = 3
56 = 2
78 = 2
32 = 2
11 = 1
```

---

## 13. Find the Last Occurrence of an Element

Take 10 integers and another integer.

Find the **last index** where that number occurs.

### Example

**Input:**

```text
Array:
33 22 11 67 55 67 11 22 55 22

Number = 11
```

**Output:**

```text
Last Index = 6
```

---

## 14. Print Duplicate Elements

Take 10 integers and print every value that occurs more than once.

Each duplicate value should be printed **only once**.

### Example

**Input:**

```text
44 56 77 88 32 56 77 88 43 23
```

**Output:**

```text
56
77
88
```

---

## 15. Replace Negative Elements with 0

Take 10 integers and replace every negative element with `0`.

Positive numbers and zero should remain unchanged.

### Example

**Input:**

```text
45 90 -77 -77 -43 -56 -1 -2 -3 55
```

**Output:**

```text
45 90 0 0 0 0 0 0 0 55
```

---

## 16. Find the Second Largest Element

Take 10 integers and find the second largest element.

### Example

**Input:**

```text
45 34 12 33 99 77 54 67 43 58
```

**Output:**

```text
Largest = 99
2nd Largest = 77
```

---

## 17. Find the Second Smallest Element

Take 10 integers and find the second smallest element.

### Example

**Input:**

```text
44 56 33 22 67 85 35 123 56 46
```

**Output:**

```text
Smallest = 22
2nd Smallest = 33
```

---

## 18. Find the Difference Between Positive Sum and Negative Sum

Take 10 integers.

Calculate:

* The sum of all positive numbers
* The sum of all negative numbers
* `positiveSum - negativeSum`

### Example

**Input:**

```text
33 22 11 34 -77 -10 -23 -45 -25 67
```

**Output:**

```text
Sum of Positives = 167
Sum of Negatives = -180
Sumpositives - SumNegatives = 347
```

---

## 19. Count Elements That Occur Only Once

Take 10 integers and count how many elements occur exactly once in the array.

### Example

**Input:**

```text
45 67 89 33 22 45 67 89 22 10
```

Only `33` and `10` occur once.

**Output:**

```text
Number of Unique = 2
```
