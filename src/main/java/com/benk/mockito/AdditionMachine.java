package com.benk.mockito;

public class AdditionMachine {
    public int process(int a, int b) {
        return (int) Math.round(Math.random());
    }

    public float processDivision(int a, int b) {
        return (float) Math.round(Math.random());
    }
}
