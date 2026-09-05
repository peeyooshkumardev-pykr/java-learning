# Array Manipulation — Questions

## Basic

### Q01 — Remove Duplicate Elements

Take an array and remove duplicate elements, keeping only the first occurrence.

**Example:**

```text
Input:
Array = 1 2 2 3 1 4 3

Output:
1 2 3 4
```

### Q02 — Move All Even Numbers to Beginning

Take an array and move all even numbers to the beginning and odd numbers to the end.

**Example:**

```text
Input:
Array = 1 4 3 2 6 5

Output:
4 2 6 1 3 5
```

### Q03 — Move All Odd Numbers to Beginning

Take an array and move all odd numbers to the beginning and even numbers to the end.

**Example:**

```text
Input:
Array = 2 5 4 7 8 3

Output:
5 7 3 2 4 8
```

### Q04 — Move All Zeros to Beginning

Take an array and move all zeros to the beginning.

**Example:**

```text
Input:
Array = 1 0 3 0 5 2

Output:
0 0 1 3 5 2
```

### Q05 — Remove All Zeros

Take an array and remove all zero elements.

**Example:**

```text
Input:
Array = 1 0 3 0 5 0 2

Output:
1 3 5 2
```

### Q06 — Find Common Elements of Two Arrays

Take two arrays and print the elements that are present in both arrays.

**Example:**

```text
Input:
Array 1 = 1 2 3 4 5
Array 2 = 3 4 5 6 7

Output:
3 4 5
```

### Q07 — Find Elements Only in First Array

Print the elements that are present in the first array but not in the second array.

**Example:**

```text
Input:
Array 1 = 1 2 3 4 5
Array 2 = 3 4 6 7

Output:
1 2 5
```

### Q08 — Find Elements Only in Second Array

Print the elements that are present in the second array but not in the first array.

**Example:**

```text
Input:
Array 1 = 1 2 3 4
Array 2 = 3 4 5 6

Output:
5 6
```

### Q09 — Find Union of Two Arrays

Take two arrays and create their union without duplicate elements.

**Example:**

```text
Input:
Array 1 = 1 2 3 4
Array 2 = 3 4 5 6

Output:
1 2 3 4 5 6
```

### Q10 — Find Intersection of Two Arrays

Take two arrays and print the elements that occur in both arrays.

**Example:**

```text
Input:
Array 1 = 1 2 3 4 5
Array 2 = 3 4 5 6 7

Output:
3 4 5
```

### Q11 — Check Two Arrays for Same Elements

Check whether two arrays contain the same elements regardless of their order.

**Example:**

```text
Input:
Array 1 = 1 2 3 4
Array 2 = 4 2 1 3

Output:
Both arrays contain the same elements.
```

### Q12 — Find Most Frequent Element

Find the element that occurs the maximum number of times.

**Example:**

```text
Input:
Array = 1 2 2 3 2 4 1

Output:
Most Frequent Element = 2
Frequency = 3
```

### Q13 — Find Least Frequent Element

Find the element that occurs the minimum number of times.

**Example:**

```text
Input:
Array = 1 2 2 3 3 3 4

Output:
Least Frequent Element = 1
Frequency = 1
```

### Q14 — Find All Duplicate Elements

Find and print all elements that occur more than once.

**Example:**

```text
Input:
Array = 1 2 3 2 4 1 5 3

Output:
1 2 3
```

### Q15 — Remove a Specific Element

Take an array and an element, then remove all occurrences of that element.

**Example:**

```text
Input:
Array = 1 2 3 2 4 2 5
Element = 2

Output:
1 3 4 5
```

---

# Intermediate

### Q16 — Find All Pairs With a Given Sum

Find all pairs of elements whose sum is equal to a given number.

**Example:**

```text
Input:
Array = 1 2 3 4 5 6
Target Sum = 7

Output:
1 6
2 5
3 4
```

### Q17 — Find All Pairs With a Given Difference

Find all pairs of elements whose difference is equal to a given number.

**Example:**

```text
Input:
Array = 1 3 5 7 9
Difference = 4

Output:
1 5
3 7
5 9
```

### Q18 — Find Pair With Minimum Difference

Find the pair of elements having the smallest difference.

**Example:**

```text
Input:
Array = 10 3 20 15 7

Output:
10 7
Minimum Difference = 3
```

### Q19 — Find Pair With Maximum Difference

Find the pair of elements having the largest difference.

**Example:**

```text
Input:
Array = 4 1 9 6 2

Output:
1 9
Maximum Difference = 8
```

### Q20 — Find Three Elements With a Given Sum

Find three elements whose sum is equal to a given target.

**Example:**

```text
Input:
Array = 1 4 6 8 10
Target Sum = 15

Output:
1 4 10
1 6 8
```

### Q21 — Find Majority Element

Find the element that appears more than `N/2` times in an array.

**Example:**

```text
Input:
Array = 2 2 1 2 3 2 2

Output:
Majority Element = 2
```

### Q22 — Find Element Occurring Odd Number of Times

Find the element that occurs an odd number of times.

**Example:**

```text
Input:
Array = 1 2 3 2 3 1 3

Output:
Element = 3
```

### Q23 — Find Missing Number From 1 to N

An array contains numbers from `1` to `N` with one number missing. Find the missing number.

**Example:**

```text
Input:
Array = 1 2 3 5 6
N = 6

Output:
Missing Number = 4
```

### Q24 — Find Two Missing Numbers

An array contains numbers from `1` to `N` with two numbers missing. Find both missing numbers.

**Example:**

```text
Input:
Array = 1 2 4 6
N = 6

Output:
Missing Numbers = 3 5
```

### Q25 — Find Repeating Number

Find the number that appears more than once in an array.

**Example:**

```text
Input:
Array = 1 3 4 2 2

Output:
Repeating Number = 2
```

### Q26 — Find All Missing Numbers

Given an array containing numbers from `1` to `N`, find all numbers that are missing.

**Example:**

```text
Input:
Array = 1 3 5 6
N = 6

Output:
Missing Numbers = 2 4
```

### Q27 — Replace Each Element With Its Rank

Replace every element with its rank after sorting the array.

**Example:**

```text
Input:
Array = 40 10 30 20

Output:
3 1 2 4
```

### Q28 — Sort an Array of 0s, 1s and 2s

Sort an array containing only `0`, `1`, and `2` without using a sorting method.

**Example:**

```text
Input:
Array = 2 0 2 1 1 0

Output:
0 0 1 1 2 2
```

### Q29 — Rearrange Elements by Sign Alternately

Rearrange positive and negative elements alternately while maintaining their relative order as much as possible.

**Example:**

```text
Input:
Array = 1 2 -3 -4 5 -6

Output:
1 -3 2 -4 5 -6
```

### Q30 — Rearrange Elements by Frequency

Rearrange the array so that elements with higher frequency appear first.

**Example:**

```text
Input:
Array = 2 3 2 4 3 2 5

Output:
2 2 2 3 3 4 5
```

---

# Advanced

### Q31 — Longest Consecutive Sequence

Find the length of the longest sequence of consecutive numbers.

**Example:**

```text
Input:
Array = 100 4 200 1 3 2

Output:
Longest Consecutive Length = 4
```

### Q32 — Longest Increasing Continuous Subarray

Find the longest continuous part of the array where every next element is greater than the previous one.

**Example:**

```text
Input:
Array = 1 2 3 2 4 5 6 1

Output:
Longest Subarray = 2 4 5 6
Length = 4
```

### Q33 — Find Equilibrium Index

Find an index where the sum of elements on the left equals the sum of elements on the right.

**Example:**

```text
Input:
Array = 1 3 5 2 2

Output:
Equilibrium Index = 2
```

### Q34 — Maximum Subarray Sum

Find the contiguous subarray having the maximum sum.

**Example:**

```text
Input:
Array = -2 1 -3 4 -1 2 1 -5 4

Output:
Maximum Sum = 6
Subarray = 4 -1 2 1
```

### Q35 — Minimum Subarray Sum

Find the contiguous subarray having the minimum sum.

**Example:**

```text
Input:
Array = 3 -4 2 -3 -1 7 -5

Output:
Minimum Sum = -6
Subarray = -4 2 -3 -1
```

### Q36 — Maximum Product Subarray

Find the contiguous subarray having the maximum product.

**Example:**

```text
Input:
Array = 2 3 -2 4

Output:
Maximum Product = 6
Subarray = 2 3
```

### Q37 — All Subarrays With Given Sum

Find all contiguous subarrays whose sum is equal to a given target.

**Example:**

```text
Input:
Array = 1 2 3 2 5
Target Sum = 5

Output:
1 2 2
2 3
5
```

### Q38 — Longest Subarray With Given Sum

Find the longest contiguous subarray whose sum equals a given target.

**Example:**

```text
Input:
Array = 1 2 1 1 1 3
Target Sum = 5

Output:
Longest Subarray = 2 1 1 1
Length = 4
```

### Q39 — Product of Array Except Self

Create a new array where each position contains the product of all elements except the element at that position.

**Example:**

```text
Input:
Array = 1 2 3 4

Output:
24 12 8 6
```

### Q40 — Maximum Difference Between Two Elements

Find the maximum difference `arr[j] - arr[i]` where `j > i`.

**Example:**

```text
Input:
Array = 7 1 5 3 6 4

Output:
Maximum Difference = 5
```

---

# Challenging

### Q41 — Trapping Rain Water

Given an array representing heights of bars, find how much rainwater can be trapped between the bars.

**Example:**

```text
Input:
Array = 0 1 0 2 1 0 1 3 2 1 2 1

Output:
Trapped Water = 6
```

### Q42 — Container With Most Water

Find two bars that can contain the maximum amount of water.

**Example:**

```text
Input:
Array = 1 8 6 2 5 4 8 3 7

Output:
Maximum Water = 49
```

### Q43 — Minimum Number of Jumps

Each array element represents the maximum number of positions you can jump forward. Find the minimum jumps needed to reach the last index.

**Example:**

```text
Input:
Array = 2 3 1 1 4

Output:
Minimum Jumps = 2
```

### Q44 — Maximum Circular Subarray Sum

Find the maximum possible sum of a subarray when the array is considered circular.

**Example:**

```text
Input:
Array = 5 -3 5

Output:
Maximum Circular Sum = 10
```

### Q45 — Minimum Circular Subarray Sum

Find the minimum possible sum of a subarray when the array is considered circular.

**Example:**

```text
Input:
Array = 5 -3 5 -2

Output:
Minimum Circular Sum = -5
```

### Q46 — Merge Overlapping Intervals

Given intervals, merge all intervals that overlap.

**Example:**

```text
Input:
Intervals = [1,3] [2,6] [8,10] [9,12]

Output:
[1,6] [8,12]
```

### Q47 — Next Greater Element in Circular Array

For every element, find the first greater element to its right. After reaching the end, continue from the beginning.

**Example:**

```text
Input:
Array = 1 2 1

Output:
2 -1 2
```

### Q48 — Maximum of Every Sliding Window

Find the maximum element in every window of size `K`.

**Example:**

```text
Input:
Array = 1 3 -1 -3 5 3 6 7
K = 3

Output:
3 3 5 5 6 7
```

### Q49 — Minimum Swaps to Group All Elements Less Than K

Find the minimum number of swaps required to group all elements smaller than `K` together.

**Example:**

```text
Input:
Array = 2 1 5 6 3
K = 3

Output:
Minimum Swaps = 1
```

### Q50 — Minimum Swaps to Sort an Array

Find the minimum number of swaps required to sort an array in ascending order.

**Example:**

```text
Input:
Array = 4 3 1 2

Output:
Minimum Swaps = 2
Sorted Array = 1 2 3 4
```