package com.example;

public class FizzBuzz {

    private int number;
    private String strNumber;
    private boolean contains3 ;
    private boolean contains5;

    public FizzBuzz(String input) {
        try {
            this.number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid number");
        }
    }
    public FizzBuzz (int num){
        this.number=num;
        this.strNumber = String.valueOf(number);
        this.contains3 = strNumber.contains("3");
        this.contains5  = strNumber.contains("5");

    }

    //change into a switch-case
    public String fizzBuzzKata() {
        if (this.number % 5 == 0 && this.number % 3 == 0) {
            return "FizzBuzz";
        }else if (this.number % 5 == 0 || this.contains5) {
            return "Buzz";
        }else if (this.number % 3 == 0 || this.contains3) {
            return "Fizz";
        }
        else {
            return Integer.toString(this.number);
        }
    }
}
