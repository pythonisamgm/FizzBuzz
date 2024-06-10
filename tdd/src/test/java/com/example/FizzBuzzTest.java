package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FizzBuzzTest {
    
    /*@Test
    void test_if_the_input_is_a_number_return_number() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(0);
    //act
        int metodoDeFizzBuzz = fizzBuzz.printNumber(2);
    //assert
        assertEquals(2, metodoDeFizzBuzz);}*/

    
    @Test
    void test_if_print_fizz_prints__fizz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(0);
    //act
        String printFizzMetodo = fizzBuzz.printFizz(20);
    //assert
        assertEquals("Fizz", printFizzMetodo);
        

    }
    @Test
    void test_if_print_buzz_prints__buzz() {
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(0);
    //act
        String printBuzzMethod = fizzBuzz.printBuzz(15);
    //assert
        assertEquals("Buzz", printBuzzMethod);
        

    }
    @Test
    void test_if_print_fizzbuzz_prints_fizzbuzz(){
    //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz(0);
    //act
        String printFizzBuzzMethod = fizzBuzz.printFizzBuzz(6);
    //assert
        assertEquals("FizzBuzz", printFizzBuzzMethod);
    }
}
