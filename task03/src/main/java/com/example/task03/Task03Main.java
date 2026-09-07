package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1.0, 2.0);
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);

        ComplexNumber sum = num1.sum(num2);
        ComplexNumber multiply = num1.multiply(num2);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
