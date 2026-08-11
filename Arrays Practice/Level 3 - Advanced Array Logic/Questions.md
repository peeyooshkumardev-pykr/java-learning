# Java Arrays - Level 3: Advanced Array Logic

## 1. Calculate the Average and Count Elements Greater Than Average

Take 10 integers, calculate their average, and count how many elements are greater than the average.

### Example

**Input:**

```text
66 77 88 54 33 21 32 12 34 76
```

**Output:**

```text
Average of Array = 49.3
Number of Elements Greater than Average = 5
```

---

## 2. Count Decreasing Adjacent Pairs

Take 10 integers and count how many times an element is smaller than the element immediately before it.

### Example

**Input:**

```text
34 56 54 32 31 56 87 76 90 65
```

**Output:**

```text
Count = 5
```

---

## 3. Print and Count Elements Greater Than the Average

Take 10 integers, calculate their average, then print all elements greater than the average and count them.

### Example

**Input:**

```text
10 20 30 40 50 60 70 80 90 100
```

**Output:**

```text
Average = 55.0
Elements greater than the average:
60 70 80 90 100

Number of elements greater than the average = 5
```

---

## 4. Count Increasing Adjacent Pairs

Take 10 integers and count how many times an element is greater than the element immediately before it.

### Example

**Input:**

```text
45 33 44 65 23 67 44 89 87 54
```

**Output:**

```text
Count = 4
```

---

## 5. Find the Element Closest to the Average

Take 10 integers, calculate their average, and find the element whose value is closest to the average.

### Example

**Input:**

```text
33 45 67 21 34 78 65 55 43 11
```

**Output:**

```text
Average = 45.2
Element closest to that average = 45
```

---

## 6. Find the First Local Peak

Take 10 integers and find the first element that is greater than both its previous and next elements.

The first and last elements cannot be considered because they do not have two neighbors.

### Example

**Input:**

```text
12 13 34 56 78 56 43 23 45 21
```

**Output:**

```text
First element that is greater than both its neighbors = 78
```

---

## 7. Find the Largest Difference Between Adjacent Elements

Take 10 integers and find the largest absolute difference between two neighboring elements.

### Example

**Input:**

```text
45 67 32 12 76 54 98 23 45 61
```

**Output:**

```text
Largest absolute difference = 75
```

---

## 8. Find the First Non-Repeated Element

Take 10 integers and find the first element from the left that occurs exactly once.

### Example

**Input:**

```text
45 66 34 45 66 54 34 12 34 67
```

**Output:**

```text
First Non-Repeated Element = 54
```

---

## 9. Find the First Repeated Element

Take 10 integers and find the first element from the left that appears more than once.

### Example

**Input:**

```text
34 44 22 12 67 22 45 67 12 45
```

**Output:**

```text
First Repeated Element = 22
```

---

## 10. Find Elements Greater Than Both Neighbors

Take 10 integers and print every element that is greater than both its previous and next elements.

Do not consider the first and last elements.

### Example

**Input:**

```text
23 33 12 23 17 78 89 43 22 44
```

**Output:**

```text
Elements greater than both neighbors:
33 23 89
```

---

## 11. Find Elements Greater Than Their Previous Element

Take 10 integers and print every element that is greater than the element immediately before it.

The first element is not considered because it has no previous element.

### Example

**Input:**

```text
34 22 55 66 75 33 24 67 89 54
```

**Output:**

```text
Elements greater than their previous element:
55 66 75 67 89
```

---

## 12. Find the Element with the Largest Frequency

Take 10 integers and find the element that occurs the maximum number of times.

Also print how many times it occurs.

### Example

**Input:**

```text
44 44 33 43 44 33 33 12 45 78
```

**Output:**

```text
Number of times appear = 3
The element that occurs the maximum number of times = 44
```

---

## 13. Find the Longest Consecutive Decreasing Sequence

Take 10 integers and find the length of the longest consecutive sequence where every next element is smaller than the previous element.

### Example

**Input:**

```text
33 22 11 23 11 23 45 32 43 21
```

The longest decreasing sequence is:

```text
33 22 11
```

**Output:**

```text
Longest sequence = 3
```

---

## 14. Find the Longest Consecutive Increasing Sequence

Take 10 integers and find the length of the longest consecutive sequence where every next element is greater than the previous element.

### Example

**Input:**

```text
33 45 67 43 23 45 89 90 87 89
```

The longest increasing sequence is:

```text
23 45 89 90
```

**Output:**

```text
Longest length = 4
```

---

## 15. Find the Longest Equal Consecutive Sequence

Take 10 integers and find the length of the longest consecutive sequence where all neighboring elements are equal.

### Example

**Input:**

```text
22 34 34 34 12 12 12 12 45 45
```

The longest equal sequence is:

```text
12 12 12 12
```

**Output:**

```text
Longest length = 4
```

---

## 16. Move All Negative Elements to the Beginning

Take 10 integers and rearrange the same array so that all negative numbers come before all non-negative numbers.

### Example

**Input:**

```text
45 66 77 -65 -12 -55 -90 44 21 34
```

**Output:**

```text
Required Array:
-65 -12 -55 -90 66 77 45 44 21 34
```

---

## 17. Move All Zeros to the End

Take 10 integers and move all zero elements to the end of the same array.

The relative order of the non-zero elements must remain unchanged.

### Example

**Input:**

```text
0 55 67 0 66 0 21 0 0 78
```

**Output:**

```text
Required Elements:
55 67 66 21 78 0 0 0 0 0
```

---

## 18. Remove Duplicate Elements

Take 10 integers and print the array after removing duplicate values.

Each distinct value should appear only once, while preserving the order of its first appearance.

### Example

**Input:**

```text
33 33 33 12 45 67 88 12 45 88
```

**Output:**

```text
Distinct Array Elements:
33 12 45 67 88
```

---

## 19. Separate Even and Odd Elements

Take 10 integers and rearrange the same array so that:

* All even numbers come first.
* All odd numbers come after them.

### Example

**Input:**

```text
45 66 89 54 22 34 75 89 97 54
```

**Output:**

```text
Required Array:
66 54 22 34 54 45 75 89 97 89
```

---

## 20. Find Elements Smaller Than Both Neighbors

Take 10 integers and print every element that is smaller than both its previous and next elements.

Do not consider the first and last elements.

### Example

**Input:**

```text
34 90 12 34 56 74 24 65 23 45
```

**Output:**

```text
Required Array Elements:
12 24 23
```

---

## 21. Find the Element with the Smallest Frequency

Take 10 integers and find the element that occurs the minimum number of times.

Also print how many times it occurs.

### Example

**Input:**

```text
66 89 66 98 89 23 34 34 89 11
```

The frequencies are:

```text
66 → 2
89 → 3
98 → 1
23 → 1
34 → 2
11 → 1
```

The first element with the minimum frequency is `98`.

**Output:**

```text
Number of times appear = 1
The element that occurs the minimum number of times = 98
```
