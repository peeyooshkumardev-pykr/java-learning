# Java Arrays — Level 4: Advanced Array Problem Solving

## 1. Find the Missing Number

You are given an array containing numbers from `1` to `n`, but exactly one number is missing. Find the missing number.

### Example

**Input:**

```text
n = 10
1 3 4 5 6 7 8 9 10
```

**Output:**

```text
Missing Number = 2
```

---

## 2. Find Two Missing Numbers

You are given an array containing numbers from `1` to `n`, but exactly two numbers are missing. Find both missing numbers.

### Example

**Input:**

```text
n = 10
1 2 3 4 6 7 9 10
```

**Output:**

```text
Missing Numbers:
5
8
```

---

## 3. Find the Difference Between Largest and Smallest

Given an array of integers, find the largest element, the smallest element, and the difference between them.

### Example

**Input:**

```text
12 14 17 20 31
```

**Output:**

```text
Largest Element = 31
Smallest Element = 12
Difference = 19
```

---

## 4. Find the Element That Appears Once

You are given an array where every element appears exactly twice except one element, which appears only once. Find that element.

If the input does not follow this rule, report it as invalid.

### Example

**Input:**

```text
1 1 2 3 3 4 4
```

**Output:**

```text
Element that appears once = 2
```

### Invalid Example

**Input:**

```text
1 2 2 2 3 3 4
```

**Output:**

```text
Invalid Input
```

---

## 5. Find the First Repeating Element

Given an array, find the first element from the left that appears more than once.

### Example

**Input:**

```text
12 13 14 15 14 15
```

**Output:**

```text
First Repeating Element = 14
```

---

## 6. Find the First Non-Repeating Element

Given an array, find the first element from the left that appears exactly once.

### Example

**Input:**

```text
12 12 13 13 15 16 17 21
```

**Output:**

```text
First Non-Repeating Element = 15
```

---

## 7. Find the Majority Element

Given an array of `n` integers, find the element that appears **more than n/2 times**.

If no element appears more than `n/2` times, no majority element exists.

### Example

**Input:**

```text
12 10 12 12 12 45 67 12
```

Here, `n = 8`, so `n/2 = 4`.

`12` appears 5 times.

**Output:**

```text
Majority Element = 12
```

---

## 8. Move All Zeros to the End

Given an array, move all zero elements to the end while keeping the relative order of all non-zero elements unchanged.

### Example

**Input:**

```text
12 0 0 12 14 15 0 0
```

**Output:**

```text
12 12 14 15 0 0 0 0
```

---

## 9. Remove Duplicate Elements

Given an array, print each distinct element only once while preserving the order of its first appearance.

### Example

**Input:**

```text
32 32 11 12 12
```

**Output:**

```text
32 11 12
```

---

## 10. Find the Second Largest Distinct Element

Given an array of integers, find the second largest **distinct** element.

Duplicate values of the largest element should not be considered as the second largest.

### Example

**Input:**

```text
10 25 7 40 25 30
```

**Output:**

```text
Second Largest Distinct Element = 30
```

### Another Example

**Input:**

```text
5 9 9 3 7
```

**Output:**

```text
Second Largest Distinct Element = 7
```

---

## 11. Find the Second Smallest Distinct Element

Given an array of integers, find the second smallest **distinct** element.

Duplicate values should be ignored.

### Example

**Input:**

```text
8 3 5 3 1 8
```

The distinct values are:

```text
1 3 5 8
```

**Output:**

```text
Second Smallest Distinct Element = 3
```

---

## 12. Find the Element with the Maximum Difference from Its Neighbors

For every element that has both a left and a right neighbor, compare it with those two neighboring elements.

Find the element whose total difference from its two neighbors is the greatest.

The first and last elements should not be considered because they have only one neighbor.

### Example

**Input:**

```text
12 14 34 54 76 45
```

The element `76` has:

```text
Left neighbor = 54
Right neighbor = 45
```

Its total difference is the greatest among the middle elements.

**Output:**

```text
Element = 76
Maximum Difference = 53
```

---

## 13. Find All Elements Greater Than Every Element Before Them

Given an array, find all elements that are greater than **every element appearing before them**.

The first element automatically qualifies because there are no elements before it.

### Example

**Input:**

```text
2 5 3 7 6 9
```

The qualifying elements are:

```text
2 5 7 9
```

**Output:**

```text
Elements Greater Than All Previous Elements:
2 5 7 9
```

---

## 14. Find the Longest Strictly Increasing Subarray

Given an array, find the **longest consecutive subarray where every element is greater than the element immediately before it**.

Here, **longest means the subarray containing the maximum number of consecutive elements**, not the maximum sum.

If multiple increasing subarrays have the same length, print the **first one**.

### Example

**Input:**

```text
1 2 5 3 4 6 2 8
```

The increasing subarrays are:

```text
1 2 5
3 4 6
2 8
```

Their lengths are:

```text
1 2 5       → Length = 3
3 4 6       → Length = 3
2 8         → Length = 2
```

Since the first two have the same longest length, choose the **first one**.

### Output

```text
Longest Increasing Subarray:
1 2 5

Length = 3
```

