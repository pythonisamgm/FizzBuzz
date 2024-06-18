package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    
    @Test
    void test_if_the_input_is_a_number_return_number() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(2);
    //act
        int metodoDeFizzBuzz = fizzBuzz.printNumber();
    //assert
        assertEquals(2, metodoDeFizzBuzz);}
//test if input is not a number return "that is not a number"
    
    @Test
    void test_if_number_is_a_multiply_of_3_return_fizz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(21);
    //act
        String printFizzMetodo = fizzBuzz.printFizz();
    //assert
        assertEquals("Fizz", printFizzMetodo);
        

    }

    //test if number is not a multiply of 3 return number
    @Test
    void test_if_number_is_a_multiply_of_5_return_buzz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(150);
    //act
        String printBuzzMethod = fizzBuzz.printBuzz();
    //assert
        assertEquals("Buzz", printBuzzMethod);
        

    }
    //test if number is not a multiply of 5 return number
    @Test
    void test_if_number_is_a_multiply_of_3_and_5_return_fizzbuzz(){
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(23);
    //act
        String printFizzBuzzMethod = fizzBuzz.printFizzBuzz();
    //assert
        assertEquals("FizzBuzz", printFizzBuzzMethod);
    }
    //test if number is not a multiply of 3 or 5 return number
}
