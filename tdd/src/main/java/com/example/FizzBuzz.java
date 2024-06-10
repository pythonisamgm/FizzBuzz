package com.example;

public class FizzBuzz {

    int number;

    public FizzBuzz(int number) {
        this.number = number;

    }

    public int printNumber(int number) {
        return number;
    }

    public String printFizz(int number) {
        if (this.number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(this.number);
        }
    }

    public String printBuzz(int number) {
        if (this.number % 5 == 0) {
            return "Buzz";
        }else {
            return Integer.toString(this.number);
        }
    }

    public String printFizzBuzz(int number) {
        if (this.number % 5 == 0 && this.number % 3 == 0) {
            return "FizzBuzz";
        } else {
            return Integer.toString(this.number);
        }
    }
}
