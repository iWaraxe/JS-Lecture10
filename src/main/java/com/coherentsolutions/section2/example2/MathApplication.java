package com.coherentsolutions.section2.example2;

// MathApplication.java
public class MathApplication {
    private Calculator calc;

    public void setCalculator(Calculator calc) {
        this.calc = calc;
    }

    public double add(double input1, double input2) {
        //
        return calc.add(input1, input2);
    }
}
