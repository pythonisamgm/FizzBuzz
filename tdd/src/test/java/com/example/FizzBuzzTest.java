package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    @Test
    void test_if_string_constructor_catches_exceptions(){
        String invalidInput = "casa";
        //act
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new FizzBuzz(invalidInput);
        });
        //assert
        assertEquals("Input is not a valid number", exception.getMessage());
    }

    @Test
    void test_if_the_input_is_a_number_return_number() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(2);
    //act
        String fizzBuzzMethod = fizzBuzz.fizzBuzzKata();
    //assert
        assertEquals("2", fizzBuzzMethod);}
//test if input is not a number return "that is not a number"

    @Test
    void test_if_number_is_a_multiply_of_3_return_fizz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(21);
    //act
        String fizzBuzzMethod = fizzBuzz.fizzBuzzKata();
    //assert
        assertEquals("Fizz", fizzBuzzMethod);
    }


    @Test
    void test_if_number_is_a_multiply_of_5_return_buzz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(5);
    //act
        String printBuzzMethod = fizzBuzz.fizzBuzzKata();
    //assert
        assertEquals("Buzz", printBuzzMethod);


    }

    @Test
    void test_if_number_is_a_multiply_of_3_and_5_return_fizzbuzz(){
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(15);
    //act
        String printFizzBuzzMethod = fizzBuzz.fizzBuzzKata();
    //assert
        assertEquals("FizzBuzz", printFizzBuzzMethod);
    }


    @Test
    void test_if_number_contains_3_and_return_fizz(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(23);
        //act
        String printFizzBuzzMethod = fizzBuzz.fizzBuzzKata();
        //assert
        assertEquals("Fizz", printFizzBuzzMethod);
    }
    @Test
    void test_if_number_contains_5_and_return_buzz(){
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(51);
        //act
        String printFizzBuzzMethod = fizzBuzz.fizzBuzzKata();
        //assert
        assertEquals("Buzz", printFizzBuzzMethod);
    }
}
