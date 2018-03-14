package com.benk.mockito;

public class Calculator {

    private final AdditionMachine additionMachine;

    public Calculator(AdditionMachine additionMachine) {
        this.additionMachine = additionMachine;
    }

    public int add(int a, int b) {
        return additionMachine.process(a, b);
    }

    public int minus(int a, int b) {
        return additionMachine.process(a, b);
    }

    public void speak() {
        System.out.println("my void method");
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }
}
