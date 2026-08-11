# Java Arrays - Level 1: Array Basics

## 1. Array Introduction

Create an integer array with the values `10, 20, 30, 40, 50`.

Print:

* The length of the array
* The element at index `4`
* All elements from first to last
* All elements from last to first

### Example

**Array:**

```text
10 20 30 40 50
```

**Output:**

```text
Length = 5
Element at index 4 = 50

Forward:
10 20 30 40 50

Backward:
50 40 30 20 10
```

---

## 2. Take Input and Print the Array

Create an integer array of size `5`. Take 5 integers from the user and print all the elements.

### Example

**Input:**

```text
10 20 30 40 50
```

**Output:**

```text
Array:
10 20 30 40 50
```

---

## 3. Find the Sum of Array Elements

Take 5 integers as input and calculate the sum of all elements in the array.

### Example

**Input:**

```text
10 20 30 40 50
```

**Output:**

```text
Sum of Array Elements = 150
```

---

## 4. Find the Average of Array Elements

Take 5 integers as input and calculate the sum and average of the array elements.

### Example

**Input:**

```text
10 20 30 40 50
```

**Output:**

```text
Sum of Array Elements = 150
Average of Array Elements = 30.0
```

---

## 5. Find the Largest Element

Take 5 integers as input and find the largest element in the array.

### Example

**Input:**

```text
12 45 23 67 34
```

**Output:**

```text
Largest = 67
```

---

## 6. Find the Smallest Element

Take 5 integers as input and find the smallest element in the array.

### Example

**Input:**

```text
12 45 23 67 8
```

**Output:**

```text
Smallest = 8
```

---

## 7. Search for an Element

Take 5 integers as input. Then take another integer from the user and search for it in the array.

Print `Found` if the element exists; otherwise print `Not Found`.

### Example

**Input:**

```text
55 43 66 78 43
78
```

**Output:**

```text
Found 78
```

### Another Example

**Input:**

```text
55 43 66 78 43
90
```

**Output:**

```text
Not Found
```

---

## 8. Count the Occurrence of an Element

Take 8 integers as input. Then take another integer and count how many times that integer appears in the array.

### Example

**Input:**

```text
45 77 89 32 32 45 77 89
77
```

**Output:**

```text
Number of 77 is 2
```

---

## 9. Separate Even and Odd Elements

Take 5 integers and print all even elements and all odd elements separately.

Also print the number of even and odd elements.

### Example

**Input:**

```text
44 67 21 33 67
```

**Output:**

```text
Even = 44
No. of Evens = 1

Odd = 67 21 33 67
No. of Odds = 4
```

---

## 10. Reverse an Array

Take 5 integers and print the elements in reverse order.

Do not create another array.

### Example

**Input:**

```text
34 55 67 88 99
```

**Output:**

```text
Reverse:
99 88 67 55 34
```

---

## 11. Find the Largest Element and Its Index

Take 10 integers and find:

* The largest element
* The first index where that largest element occurs

### Example

**Input:**

```text
45 32 12 14 17 48 55 90 78 65
```

**Output:**

```text
Largest = 90
Index = 7
```

---

## 12. Find the Smallest Element and Its Index

Take 10 integers and find:

* The smallest element
* The first index where that smallest element occurs

### Example

**Input:**

```text
33 55 67 88 90 77 64 75 47 10
```

**Output:**

```text
Smallest = 10
Index = 9
```

---

## 13. Print Elements at Even Index Positions

Take 10 integers and print only the elements whose index is even.

Remember: array indexing starts from `0`.

### Example

**Input:**

```text
45 89 70 56 23 14 53 12 10 87
```

Indexes:

```text
0  1  2  3  4  5  6  7  8  9
```

**Output:**

```text
Elements at even index:
45 70 23 53 10
```

---

## 14. Reverse an Array in the Same Array

Take 5 integers and reverse the array **inside the same array**.

Do not create a second array.

### Example

**Input:**

```text
34 55 67 88 99
```

**Output:**

```text
Original Array:
34 55 67 88 99

Reverse Array:
99 88 67 55 34
```

---

## 15. Swap Only the First and Last Elements

Take 10 integers and swap only the first and last elements.

All other elements must remain in their original positions.

Do the operation in the same array.

### Example

**Input:**

```text
6 7 8 9 0 1 2 3 4 5
```

**Output:**

```text
Swapped Array:
5 7 8 9 0 1 2 3 4 6
```