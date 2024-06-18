package com.example;

public class FizzBuzz {

    private int number;

    public FizzBuzz(String input) {
        try {
            this.number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid number");
        }
    }
    public FizzBuzz (int num){
        this.number=num;
    }

    public int printNumber() {

        return this.number;
    }

    public String fizzBuzzKata() {
        if (this.number % 5 == 0 && this.number % 3 == 0) {
            return "FizzBuzz";
        }else if (this.number % 3 == 0) {
            return "Fizz";
        }else if (this.number % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(this.number);
        }
    }
}
