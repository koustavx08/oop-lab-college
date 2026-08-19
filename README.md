# OOP Lab College

A collection of Java programs for the Object-Oriented Programming laboratory. This repository contains the practical assignments implemented as simple, beginner-friendly Java programs using classes, objects, methods, conditional statements, loops, and basic problem-solving techniques.

## Repository Overview

| No. | Program | File | Concept |
| --- | --- | --- | --- |
| 1 | Hello World | `day1/HelloWorld.java` | Basic Java program structure |
| 2 | Student Information | `day1/Student.java` | Class, object, instance data members and methods |
| 3 | Largest of Three Numbers | `day1/LargestThree.java` | Class, object, conditional statements and input |
| 4 | Factorial | `day1/Factorial.java` | Class, object, method and loop |
| 5 | Fibonacci Series | `day1/Fibonacci.java` | Class, object, method and loop |
| 6 | Prime Numbers from 1 to 100 | `day1/PrimeNumbers.java` | Class, object, method and loops |

## Assignment Details

### 1. Hello World

Prints the `Hello World` message using Java's `main()` method and `System.out.println()`.

**File:** `day1/HelloWorld.java`

**Output:**

```text
Hello World
```

### 2. Student Information

Creates a `Student` class with the following instance data members:

- `name`
- `roll_no`
- `phone_no`

A `display()` method is used to display the student's information. An object of the `Student` class is created in `main()`.

**File:** `day1/Student.java`

**Sample Output:**

```text
Student Name: Koustav
Roll Number: 8
Phone Number: 9876543210
```

### 3. Largest of Three Numbers

Accepts three numbers from the user and determines the largest using conditional statements inside a class method.

**File:** `day1/LargestThree.java`

**Sample Output:**

```text
Enter first number: 25
Enter second number: 78
Enter third number: 42
Largest number: 78
```

### 4. Factorial

Accepts a number from the user and calculates its factorial using a `for` loop and an instance method.

**File:** `day1/Factorial.java`

**Sample Output:**

```text
Enter a number: 5
Factorial of 5 = 120
```

### 5. Fibonacci Series

Accepts the number of terms and displays the Fibonacci series starting from `0` and `1`.

**File:** `day1/Fibonacci.java`

**Sample Output:**

```text
Enter number of terms: 10
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
```

### 6. Prime Numbers Between 1 and 100

Checks whether numbers are prime and displays all prime numbers between 1 and 100.

**File:** `day1/PrimeNumbers.java`

**Output:**

```text
Prime numbers between 1 and 100:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
```

## Technologies Used

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
- **JDK:** Java 8 or later
- **Input:** `java.util.Scanner` where required

## OOP Concepts Covered

The current practicals introduce the following concepts:

- Classes
- Objects
- Instance data members
- Instance methods
- Object creation using `new`
- Encapsulation basics
- Conditional statements
- `for` loops
- User input using `Scanner`
- Basic problem-solving with Java

## Project Structure

```text
oop-lab-college/
├── day1/
│   ├── Factorial.java
│   ├── Fibonacci.java
│   ├── HelloWorld.java
│   ├── LargestThree.java
│   ├── PrimeNumbers.java
│   └── Student.java
└── README.md
```

## How to Run

### Prerequisites

Make sure Java is installed and available in your terminal.

Check the installation with:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone https://github.com/koustavx08/oop-lab-college.git
cd oop-lab-college
```

### Compile and Run

From the repository root, compile any program using its file path.

For example:

```bash
javac day1/HelloWorld.java
```

Then run it with:

```bash
java -cp day1 HelloWorld
```

For a program that accepts input:

```bash
javac day1/Factorial.java
java -cp day1 Factorial
```

The same pattern can be used for the other programs:

```bash
javac day1/Student.java
java -cp day1 Student

javac day1/LargestThree.java
java -cp day1 LargestThree

javac day1/Fibonacci.java
java -cp day1 Fibonacci

javac day1/PrimeNumbers.java
java -cp day1 PrimeNumbers
```

## Learning Objectives

The practicals are designed to build a foundation in Java and OOP by helping students understand:

1. How a Java program is structured.
2. How classes and objects work.
3. How instance variables store object data.
4. How methods perform operations on object data.
5. How conditional statements solve decision-making problems.
6. How loops are used for repeated calculations.
7. How `Scanner` is used to accept input from the user.
8. How basic mathematical and logical problems can be implemented in Java.

## Academic Use

This repository is maintained as a college laboratory record and learning resource for Object-Oriented Programming practicals.

## Author

**Koustav Singh**

GitHub: [@koustavx08](https://github.com/koustavx08)

## License

This repository is intended primarily for educational and academic use.
