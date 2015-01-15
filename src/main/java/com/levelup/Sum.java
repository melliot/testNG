package com.levelup;

public class Sum {

    public int sumer(int number1, int number2){
        return number1 + number2;
    }

    public int multiplication(int number, int sum1, int sum2){
        return number * sumer(sum1, sum2);
    }
}
