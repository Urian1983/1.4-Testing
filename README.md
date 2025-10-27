# Java Testing Exercises

A comprehensive collection of exercises covering JUnit, AssertJ, and Test-Driven Development (TDD) practices in Java.

## Table of Contents

- [Level 1: JUnit Basics](#level-1-junit-basics)
- [Level 2: AssertJ](#level-2-assertj)
- [Level 3: TDD](#level-3-tdd)

## Level 1: JUnit Basics

### Exercise 1: Library Book Management

Create a Java class that manages a collection of books in a library with the following functionalities:

**Implementation Requirements:**
- Add books to the collection
- Retrieve the complete list of books
- Obtain a book title by its position
- Insert a book at a specific position
- Remove a book by title

**JUnit Tests:**
- ✓ Verify the list of books is not null after creating a new object
- ✓ Confirm the list has the expected size after inserting several books
- ✓ Ensure the list contains a specific book at its correct position
- ✓ Verify there are no duplicate book titles in the list
- ✓ Check that you can retrieve the title of a book given a specific position
- ✓ Ensure adding a book correctly modifies the list
- ✓ Confirm removing a book reduces the list's size
- ✓ Verify the list remains alphabetically ordered after adding or removing books

### Exercise 2: Spanish DNI Calculator

Create a class named `CalculoDni` that computes the letter of a Spanish DNI (National Identity Document) when given the number as a parameter.

**JUnit Tests:**
- Implement parameterized tests that validate the calculation for 10 predefined DNI numbers
- Verify correct letter assignment for each DNI number

### Exercise 3: Exception Handling

Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.

**JUnit Tests:**
- Verify the exception is thrown correctly

## Level 2: AssertJ

Practice AssertJ assertions through the following exercises:

### Exercise 1: Integer Equality
- Write an assertion demonstrating two integer objects are equal
- Write an assertion demonstrating two integer objects are not equal

### Exercise 2: Object Reference
- Write an assertion demonstrating one object reference is the same as another
- Write an assertion demonstrating one object reference is different from another

### Exercise 3: Array Comparison
- Write an assertion indicating two integer arrays are identical

### Exercise 4: ArrayList Verification
- Create an `ArrayList` containing several types of objects
- Verify the order of objects matches insertion order
- Verify the list contains the objects in any order
- Verify one element was added only once
- Verify an unadded element is not present in the list

### Exercise 5: Map Verification
- Create a map and verify it contains a specific key

### Exercise 6: Exception Assertion
- Trigger an `ArrayIndexOutOfBoundsException` in any class
- Create an assertion validating the exception is thrown appropriately

### Exercise 7: Optional Handling
- Create an empty `Optional` object
- Write an assertion to verify it is indeed empty

## Level 3: TDD

### Exercise 1: Calculator Class (Test-Driven Development)

Implement a calculator class following the TDD methodology:

**Step 1: Write Tests First**
- Create a test class named `CalculadoraTest`
- Write tests for `sum`, `subtract`, `divide`, and `multiply` methods
- Run tests (they should fail initially)

**Step 2: Implement**
- Create the `Calculadora` class with the required methods
- Run tests to verify implementation

**Step 3: Iterate**
- Continue the TDD cycle
- Rewrite tests as needed
- Refactor code
- Repeat to improve and expand functionality

## Technologies Used

- Java
- JUnit (Testing framework)
- AssertJ (Fluent assertions library)

## Getting Started

1. Clone this repository
2. Open the project in your preferred Java IDE
3. Ensure JUnit and AssertJ dependencies are properly configured
4. Run the tests using your IDE's test runner or Maven/Gradle

## Project Structure
```
src/
├── main/
│   └── java/
│       ├── library/          # Exercise 1.1
│       ├── dni/              # Exercise 1.2
│       ├── exceptions/       # Exercise 1.3
│       ├── assertj/          # Level 2 exercises
│       └── calculator/       # Level 3 TDD exercise
└── test/
    └── java/
        ├── library/
        ├── dni/
        ├── exceptions/
        ├── assertj/
        └── calculator/
```

## License

This project is created for educational purposes.
