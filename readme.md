# FizzBuzz Program

This Java program demonstrates the classic FizzBuzz problem, which prints numbers from 1 to a specified number, applying specific rules for certain conditions. You can check the refactorization and number of iterations in the commits history. 

## FizzBuzz Class

The `FizzBuzz` class provides functionality to determine the output for a given number based on the following rules:

1. Return "Fizz" if the number is divisible by 3 or contains the digit '3'.
2. Return "Buzz" if the number is divisible by 5 or contains the digit '5'.
3. Return "FizzBuzz" if the number is divisible by both 3 and 5.
4. Otherwise, return the number itself as a string.

### Constructors

- `public FizzBuzz(String input)`: Initializes the `number` field by parsing the input string to an integer. Throws an `IllegalArgumentException` if the input is not a valid number.
  
- `public FizzBuzz(int num)`: Initializes the `number` field with the provided integer value. Determines if the number contains the digits '3' or '5' and sets corresponding flags (`contains3`, `contains5`).

### Methods

- `public String fizzBuzzKata()`: Evaluates the current `number` according to the FizzBuzz rules and returns the appropriate result as a string.

## Unit Tests

The `FizzBuzzTest` class contains JUnit tests to validate the behavior of the `FizzBuzz` class for different inputs:

### Test Cases

1. **Exception Handling**
   - `test_if_string_constructor_catches_exceptions()`: Ensures that the string constructor correctly catches and throws an exception when the input is not a valid number.

2. **Basic Functionality**
   - `test_if_the_input_is_a_number_return_number()`: Verifies that the `FizzBuzz` class returns the number itself as a string when it's not divisible by 3 or 5.
   
3. **Divisibility Rules**
   - `test_if_number_is_a_multiply_of_3_return_fizz()`: Checks if the class correctly identifies numbers divisible by 3 and returns "Fizz".
   - `test_if_number_is_a_multiply_of_5_return_buzz()`: Tests if numbers divisible by 5 return "Buzz".
   - `test_if_number_is_a_multiply_of_3_and_5_return_fizzbuzz()`: Validates that numbers divisible by both 3 and 5 return "FizzBuzz".

4. **Contains Digit Checks**
   - `test_if_number_contains_3_and_return_fizz()`: Verifies that numbers containing the digit '3' return "Fizz".
   - `test_if_number_contains_5_and_return_buzz()`: Checks if numbers containing the digit '5' return "Buzz".

### Running the Tests

To run the tests, ensure you have JUnit set up in your development environment. You can execute the tests directly using your IDE or through a build tool like Maven or Gradle.

### Usage

To use the `FizzBuzz` class, instantiate it with a number (either as an integer or a string representation) and call the `fizzBuzzKata()` method to get the desired FizzBuzz result.

```java
// Example usage
FizzBuzz fizzBuzz = new FizzBuzz(15);
String result = fizzBuzz.fizzBuzzKata();  // Returns "FizzBuzz"
