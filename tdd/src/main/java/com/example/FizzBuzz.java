package com.example;

public class FizzBuzz {

    private int number;

    public FizzBuzz(int num) {
        this.number = num;

    }

    public int printNumber() {
        return this.number;
    }

    public String printFizz() {
        if (this.number % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(this.number);
        }
    }

    public String printBuzz() {
        if (this.number % 5 == 0) {
            return "Buzz";
        }else {
            return Integer.toString(this.number);
        }
    }

    public String printFizzBuzz() {
        if (this.number % 5 == 0 && this.number % 3 == 0) {
            return "FizzBuzz";
        } else {
            return Integer.toString(this.number);
        }
    }
}
