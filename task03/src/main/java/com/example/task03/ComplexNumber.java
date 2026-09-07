package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber sum(ComplexNumber complexNumber) {
        double newReal = this.real + complexNumber.real;
        double newImaginary = this.real * complexNumber.imaginary + this.imaginary * complexNumber.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber complexNumber) {
        double newReal = this.real * complexNumber.real - this.imaginary * complexNumber.imaginary;
        double newImaginary = this.real * complexNumber.imaginary + this.imaginary * complexNumber.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
