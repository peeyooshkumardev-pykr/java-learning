# Java Methods — Level 4: Method Overloading

### Q01 — Basic Method Overloading

Create two methods named `display()`:

* One method accepts an `int`.
* One method accepts a `String`.

Call both methods from `main()`.

Example:

```text
Enter number = 25
Enter name = Peeyoosh

Number = 25
Name = Peeyoosh
```

---

### Q02 — Overloading With Different Number of Parameters

Create overloaded methods named `add()`:

* One accepts two integers.
* One accepts three integers.

Example:

```text
Sum of 2 numbers = 30
Sum of 3 numbers = 60
```

---

### Q03 — Overloading With Different Data Types

Create overloaded methods named `multiply()`:

* One accepts two `int` values.
* One accepts two `double` values.

Example:

```text
Integer multiplication = 50
Double multiplication = 37.5
```

---

### Q04 — Overloading With `int` and `double`

Create overloaded methods named `square()`:

* One accepts an `int`.
* One accepts a `double`.

Example:

```text
Integer square = 25
Double square = 12.25
```

---

### Q05 — Overloading With Different Parameter Counts

Create overloaded methods named `printNumbers()`:

* One accepts one integer and prints numbers from `1` to that number.
* One accepts two integers and prints numbers from the first number to the second number.

Example:

```text
First call:
1 2 3 4 5

Second call:
5 6 7 8 9 10
```

---

### Q06 — Overload `calculateArea()`

Create overloaded methods named `calculateArea()`:

* One accepts the side of a square.
* One accepts the length and width of a rectangle.
* One accepts the radius of a circle.

Example:

```text
Square area = 25
Rectangle area = 50
Circle area = 78.5
```

---

### Q07 — Overload `findLargest()`

Create overloaded methods named `findLargest()`:

* One accepts two integers.
* One accepts three integers.
* One accepts an integer array.

Example:

```text
Largest of 2 numbers = 50
Largest of 3 numbers = 80
Largest in array = 95
```

---

### Q08 — Overload `calculateSum()`

Create overloaded methods named `calculateSum()`:

* One accepts two integers.
* One accepts three integers.
* One accepts an integer array.

Example:

```text
Sum of 2 numbers = 30
Sum of 3 numbers = 60
Sum of array = 150
```

---

### Q09 — Overload `display()`

Create overloaded methods named `display()`:

* One accepts an `int`.
* One accepts a `double`.
* One accepts a `char`.
* One accepts a `String`.

Call all four methods.

Example:

```text
Integer = 25
Double = 15.5
Character = A
String = Java
```

---

### Q10 — Overload `isGreater()`

Create overloaded methods named `isGreater()`:

* One compares two integers.
* One compares two doubles.
* One compares three integers and returns whether the first number is greater than both other numbers.

Example:

```text
Greater = true
Greater = false
First number greater than both = true
```

---

### Q11 — Overload `calculateAverage()`

Create overloaded methods named `calculateAverage()`:

* One accepts two integers.
* One accepts three integers.
* One accepts an integer array.

Example:

```text
Average of 2 numbers = 15.0
Average of 3 numbers = 20.0
Average of array = 25.0
```

---

### Q12 — Overload `search()`

Create overloaded methods named `search()`:

* One searches for an integer inside an integer array.
* One searches for a character inside a String.
* One searches for a String inside an array of Strings.

Return `true` if the target is found.

Example:

```text
Number found = true
Character found = true
String found = false
```

---

### Q13 — Understand Which Overloaded Method Is Called

Create several overloaded methods named `test()` with different parameter types:

* `int`
* `double`
* `String`
* `char`

Call the method with different arguments and observe which version Java executes.

Example:

```text
test(10)
test(10.5)
test("Java")
test('A')
```

Output:

```text
int method called
double method called
String method called
char method called
```

---

### Q14 — Create an Overloaded Calculator

Create overloaded methods named `calculate()` that perform different calculations based on their parameters.

Use at least three overloaded versions.

Example:

```text
calculate(10, 20)
calculate(10, 20, 30)
calculate(10.5, 5.5)

Output:
Result 1 = 30
Result 2 = 60
Result 3 = 16.0
```

---

### Q15 — Final Method Overloading Program

Create a program demonstrating method overloading using multiple overloaded methods.

Your program should contain overloaded methods for:

* Addition
* Finding the largest value
* Calculating average
* Searching
* Calculating area

Use different parameter counts and/or parameter types for each overloaded method.

Example:

```text
Addition using 2 integers = 30
Addition using 3 integers = 60

Largest of 2 numbers = 50
Largest of 3 numbers = 80

Average of 2 numbers = 15.0
Average of array = 25.0

Element found = true

Square area = 25
Rectangle area = 50
Circle area = 78.5
```

---

# Level 4 Complete — 15 Questions

After Level 4, you should understand:

```text
Method Overloading
       ↓
Same method name
       ↓
Different parameter list
       ↓
Different number of parameters
       ↓
Different parameter types
       ↓
int / double / char / String
       ↓
Arrays as parameters
       ↓
How Java selects an overloaded method
```
