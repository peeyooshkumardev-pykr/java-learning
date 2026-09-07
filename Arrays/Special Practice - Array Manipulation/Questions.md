Absolutely — **50 questions at once**, and I’ll make them **different from the questions already in your `Arrays.zip`**. I’m also avoiding simple rewordings of your existing Level 4 manipulation problems.

# 🔥 ARRAY MANIPULATION — 50 NEW PRACTICE QUESTIONS

> **Goal:** Strengthen array manipulation logic.
>
> **Important:** These questions are designed to avoid the existing questions in your `Arrays.zip`, especially the existing Array Manipulation Level.

---

## 🟢 LEVEL 1 — BASIC MANIPULATION

# Array Special Practice — Problem Solving

### Q01 — Find the Equilibrium Index

Given an array, find an index where the sum of all elements to its left is equal to the sum of all elements to its right.

**Example:**

```text
Input:
-7 1 5 2 -4 3 0

Output:
3
```

---

### Q02 — Shift Elements Left by K Positions

Shift all elements `K` positions to the left.

Fill the empty positions at the end with `0`.

**Example:**

```text
Input:  10 20 30 40 50
K = 2

Output: 30 40 50 0 0
```

---

### Q03 — Swap Minimum and Maximum Elements

Find the minimum and maximum elements and swap their positions.

**Example:**

```text
Input:  8 3 10 5 2 7

Output: 8 3 2 5 10 7
```

---

### Q04 — Swap First Half and Second Half

Swap the first half of an array with the second half.

**Example:**

```text
Input:  1 2 3 4 5 6

Output: 4 5 6 1 2 3
```

Assume the array contains an even number of elements.

---

### Q05 — Swap Adjacent Elements

Swap every pair of adjacent elements.

**Example:**

```text
Input:
1 2 3 4 5 6

Output:
2 1 4 3 6 5
```

---

### Q06 — Move the First Element to the Correct Position

Given an array, move the **first element** to its correct position in the array assuming the remaining elements are already sorted in ascending order.

Shift elements as necessary.

**Example:**

```text
Input:
7 2 4 6 8 10

Output:
2 4 6 7 8 10
```

---

### Q07 — Reverse Only the First Half

Reverse only the first half of the array.

**Example:**

```text
Input:
1 2 3 4 5 6

Output:
3 2 1 4 5 6
```

---

### Q08 — Reverse Only the Second Half

Reverse only the second half.

**Example:**

```text
Input:
1 2 3 4 5 6

Output:
1 2 3 6 5 4
```

---

### Q09 — Reverse a Given Range

Given `L` and `R`, reverse only the elements between those indices.

**Example:**

```text
Input:
10 20 30 40 50 60

L = 1
R = 4

Output:
10 50 40 30 20 60
```

---

### Q10 — Reverse Every Alternate Block

Given block size `K`, reverse block 1, leave block 2 unchanged, reverse block 3, and so on.

**Example:**

```text
Input:
1 2 3 4 5 6 7 8

K = 2

Output:
2 1 3 4 6 5 7 8
```

---

# 🟡 LEVEL 2 — PARTITIONING & REARRANGEMENT

### Q11 — Move All Even Numbers Before Odd Numbers

Rearrange the array so that all even numbers appear before all odd numbers.

The relative order does not need to be preserved.

**Example:**

```text
Input:
5 2 8 7 3 4 6

Output:
6 2 8 4 3 7 5
```

---

### Q12 — Move All Odd Numbers Before Even Numbers

Rearrange the array so that all odd numbers appear before all even numbers.

Do this in-place.

---

### Q13 — Stable Even-Odd Partition

Place all even numbers before all odd numbers **while preserving their original relative order**.

**Example:**

```text
Input:
5 2 7 4 9 6

Output:
2 4 6 5 7 9
```

---

### Q14 — Stable Positive-Negative Partition

Place all positive numbers before all negative numbers while preserving their relative order.

Keep zeros at the end.

**Example:**

```text
Input:
-2 5 -7 8 0 3 -1

Output:
5 8 3 -2 -7 -1 0
```

---

### Q15 — Partition Around a Pivot

Given a pivot value `P`, rearrange the array so that:

```text
elements < P
elements == P
elements > P
```

appear in three groups.

---

### Q16 — Three-Way Partition by Range

Given `L` and `R`, rearrange the array into:

```text
elements < L
elements between L and R
elements > R
```

---

### Q17 — Group 0s, 1s and 2s

An array contains only `0`, `1`, and `2`.

Rearrange it in ascending order **without using a sorting method**.

**Example:**

```text
Input:
2 0 1 2 1 0 2

Output:
0 0 1 1 2 2 2
```

---

### Q18 — Sort a Binary Array In-Place

An array contains only `0` and `1`.

Rearrange it so all `0`s come before all `1`s.

Do not use a sorting method.

---

### Q19 — Partition Multiples and Non-Multiples

Given `K`, place all numbers divisible by `K` before numbers that are not divisible by `K`.

---

### Q20 — Partition Values Below a Limit

Given `X`, rearrange the array so that:

```text
values < X
```

come before:

```text
values >= X
```

Do not sort the array.

---

# 🟠 LEVEL 3 — INSERTION, DELETION & COMPACTION

### Q21 — Insert Before Every Occurrence

Given an element `X` and another value `Y`, insert `Y` immediately before every occurrence of `X`.

**Example:**

```text
Input:
2 5 2 7 2

X = 2
Y = 9

Output:
9 2 5 9 2 7 9 2
```

Assume sufficient array capacity.

---

### Q22 — Insert After Every Occurrence

Given `X` and `Y`, insert `Y` immediately after every occurrence of `X`.

---

### Q23 — Remove All Elements Less Than X

Remove every element smaller than `X` and shift the remaining elements toward the beginning.

Return the new logical size of the array.

**Example:**

```text
Input:
3 8 2 10 5 1

X = 5

Result:
8 10 5

Size = 3
```

---

### Q24 — Remove All Elements Greater Than X

Remove every element greater than `X` and compact the remaining elements.

---

### Q25 — Remove Elements Within a Range

Given `L` and `R`, remove every element satisfying:

```text
L <= element <= R
```

Compact the remaining elements.

---

### Q26 — Delete Elements at Odd Indices

Remove all elements whose original indices are odd.

**Example:**

```text
Input:
10 20 30 40 50 60

Output:
10 30 50
```

---

### Q27 — Delete Every K-th Element

Remove every `K`-th element from the array.

**Example:**

```text
Input:
1 2 3 4 5 6 7 8

K = 3

Output:
1 2 4 5 7 8
```

---

### Q28 — Remove Elements Having a Specific Digit

Given a digit `D`, remove every array element whose decimal representation contains digit `D`.

**Example:**

```text
Input:
12 45 67 52 89

D = 2

Output:
45 67 89
```

---

### Q29 — Duplicate Every Element

Given enough extra capacity, duplicate every element.

**Example:**

```text
Input:
1 2 3 4

Output:
1 1 2 2 3 3 4 4
```

---

### Q30 — Replace Every Element With Its Absolute Value

Convert every negative number into its positive equivalent.

**Example:**

```text
Input:
-5 3 -8 -2 7

Output:
5 3 8 2 7
```

---

# 🔴 LEVEL 4 — ADVANCED IN-PLACE MANIPULATION

### Q31 — Rotate Only a Subarray

Given `L`, `R`, and `K`, rotate only the portion:

```text
arr[L ... R]
```

Leave the rest of the array unchanged.

**Example:**

```text
Input:
1 2 3 4 5 6 7

L = 2
R = 5
K = 2

Output:
1 2 6 7 3 4 5
```

---

### Q32 — Reverse Every K-th Block

Divide the array into blocks of size `K`.

Reverse blocks at positions:

```text
1, 3, 5, ...
```

Leave the others unchanged.

---

### Q33 — Swap Two Subarrays

Given:

```text
start1
start2
length
```

swap two non-overlapping subarrays of equal length.

**Example:**

```text
Input:
1 2 3 4 5 6 7 8

start1 = 1
start2 = 5
length = 2

Output:
1 6 7 4 5 2 3 8
```

---

### Q34 — Interleave Two Halves

Given an even-sized array:

```text
A A A A B B B B
```

rearrange it as:

```text
A B A B A B A B
```

Do not create another array.

---

### Q35 — De-Interleave an Array

Given:

```text
A B A B A B
```

rearrange it into:

```text
A A A B B B
```

Do this in-place.

---

### Q36 — Move a Selected Element to the Beginning

Given an element `X`, move its **first occurrence** to index `0`.

Shift all affected elements instead of swapping them.

**Example:**

```text
Input:
10 20 30 40 50

X = 40

Output:
40 10 20 30 50
```

---

### Q37 — Move a Selected Element to the End

Given `X`, move its first occurrence to the last position while preserving the order of the other elements.

---

### Q38 — Move All Occurrences of X Together

Rearrange the array so that all occurrences of `X` become one continuous group.

**Example:**

```text
Input:
2 5 2 7 8 2 4

X = 2

Possible output:
5 7 8 4 2 2 2
```

---

### Q39 — Arrange Array in Wave Form

Rearrange the array so that:

```text
arr[0] <= arr[1] >= arr[2] <= arr[3] >= ...
```

Use adjacent swaps where necessary.

**Example:**

```text
Input:
10 5 6 3 2 20 100 80

Output:
5 10 3 6 2 100 20 80
```

Multiple valid outputs are possible.

---

### Q40 — Rearrange Into Zig-Zag Form

Rearrange the array so that:

```text
arr[0] < arr[1] > arr[2] < arr[3] > ...
```

Use only in-place manipulation.

---

# 🟣 LEVEL 5 — CHALLENGE MANIPULATION

### Q41 — Reverse Only Elements at Even Indices

Reverse the values located at:

```text
0, 2, 4, 6, ...
```

Keep the odd-indexed elements in their original positions.

**Example:**

```text
Input:
1 2 3 4 5 6 7

Output:
7 2 5 4 3 6 1
```

---

### Q42 — Reverse Only Elements at Odd Indices

Reverse values at:

```text
1, 3, 5, ...
```

without changing values at even indices.

---

### Q43 — Rotate Only Even-Indexed Elements

Rotate the elements stored at even indices by `K` positions.

Odd-indexed elements must remain untouched.

---

### Q44 — Rotate Only Odd-Indexed Elements

Rotate the elements stored at odd indices by `K` positions.

Even-indexed elements must remain untouched.

---

### Q45 — Reverse Elements Matching a Condition

Given `X`, reverse only the elements greater than `X`.

All other elements must stay in their original positions.

**Example:**

```text
Input:
2 9 4 8 3 7

X = 5

Output:
2 7 4 8 3 9
```

---

### Q46 — Rearrange Based on Distance From Zero

Rearrange the array so elements appear in increasing order of:

```text
|arr[i]|
```

Do not use another array.

**Example:**

```text
Input:
-10 3 -2 7 1

Output:
1 -2 3 7 -10
```

---

### Q47 — Rearrange Based on Number of Digits

Rearrange the array according to the number of digits in each element.

Elements with fewer digits should come first.

**Example:**

```text
Input:
100 5 23 7 1000 42

Output:
5 7 23 42 100 1000
```

---

### Q48 — Move Elements According to a Boolean Condition

For every element, determine whether it satisfies:

```text
element % 3 == 0
```

Rearrange the array so that all satisfying elements appear first and the remaining elements appear afterward.

Try to preserve relative order.

---

### Q49 — Apply Multiple Segment Reversals

Given an array and `Q` pairs of indices:

```text
L1 R1
L2 R2
L3 R3
...
```

reverse each specified segment one after another.

**Example:**

```text
Array:
1 2 3 4 5 6

Operations:
1 4
0 2

After operation 1:
1 5 4 3 2 6

After operation 2:
4 5 1 3 2 6
```

---

### Q50 — In-Place Perfect Shuffle

Given an array:

```text
A1 A2 A3 ... An B1 B2 B3 ... Bn
```

rearrange it into:

```text
A1 B1 A2 B2 A3 B3 ... An Bn
```

Do **not** create another array.

### Example

```text
Input:
1 2 3 4 5 6 7 8

Output:
1 5 2 6 3 7 4 8
```

### Challenge

Solve it without using:

```java
Arrays.copyOf()
System.arraycopy()
```

or any second array.

---

# 🏆 EXTRA RULES FOR THIS SPECIAL SET

For maximum practice, try solving these without relying on:

* `Arrays.sort()`
* `Arrays.copyOf()`
* `System.arraycopy()`
* Creating another array
* `ArrayList`
* `Collections`
* Built-in rotation/reversal utilities

Focus on mastering:

1. `for` loops
2. `while` loops
3. Swapping
4. Shifting
5. Index manipulation
6. Temporary variables
7. Two-pointer technique
8. Partitioning
9. In-place modification
10. Segment manipulation

# 🎯 RECOMMENDED ORDER

Start with:

**Q01 → Q02 → Q03 → Q05 → Q07 → Q09 → Q11 → Q13 → Q17 → Q18**

Then move to:

**Q21 → Q23 → Q25 → Q27 → Q29**

Then:

**Q31 → Q33 → Q34 → Q35 → Q39 → Q40**

Finally attempt:

**Q41 → Q43 → Q45 → Q46 → Q49 → Q50**

```

These are the **50-question set**, not just Q01. I’ve also kept the focus on **actual manipulation skills** rather than simply repeating search/frequency/subarray problems from your existing collection.
```
