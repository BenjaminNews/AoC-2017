package AdventOfCode2017;

public class AdventOfCodeDayTwentyFive {
    private String state = "A";

    private int[] slots = new int[10000001];

    private int currentPosition;

    private void step() {
        if(state.equals("A")) {
            stateA("E");
        } else if(state.equals("B")) {
            stateB();
        } else if(state.equals("C")) {
            stateC();
        } else if(state.equals("D")) {
            stateD();
        } else if(state.equals("E")) {
            stateE();
        } else if(state.equals("F")) {
            stateF();
        }
    }

    private void stateF() {
        if(slots[currentPosition] == 0) {
            turnOnMoveLeft();
            state = "E";
        } else {
            turnOnMoveRight();
            state = "A";
        }
    }

    private void stateE() {
        if(slots[currentPosition] == 0) {
            turnOnMoveLeft();
            state = "A";
        } else {
            turnOnMoveLeft();
            state = "C";
        }
    }

    private void stateD() {
        if(slots[currentPosition] == 0) {
            turnOnMoveLeft();
            state = "E";
        } else {
            turnOffMoveLeft();
            state = "F";
        }
    }

    private void stateC() {
        if(slots[currentPosition] == 0) {
            turnOnMoveLeft();
            state = "D";
        } else {
            turnOffMoveRight();
            state = "C";
        }
    }

    private void stateB() {
        if(slots[currentPosition] == 0) {
            turnOnMoveLeft();
            state = "C";
        } else {
            turnOffMoveRight();
            state = "A";
        }
    }

    private void stateA(String e) {
        if (slots[currentPosition] == 0) {
            turnOnMoveRight();
            state = "B";
        } else {
            turnOffMoveLeft();
            state = e;
        }
    }

    private void turnOffMoveRight() {
        slots[currentPosition] = 0;
        currentPosition++;
    }

    private void turnOffMoveLeft() {
        slots[currentPosition] = 0;
        currentPosition--;
    }

    private void turnOnMoveRight() {
        slots[currentPosition] = 1;
        currentPosition++;
    }

    private void turnOnMoveLeft() {
        slots[currentPosition] = 1;
        currentPosition--;
    }

    public void setup() {
        currentPosition = Math.abs(slots.length / 2);
        for(int i = 0; i < slots.length - 1; i++) {
            slots[i] = 0;
        }
    }

    public void performSteps(int stepCount) {
        for(int i = 0; i < stepCount; i++) {
            step();
        }
    }

    public void performStepsTest(int stepCount) {
        for(int i = 0; i < stepCount; i++) {
            stepTests();
        }
    }

    private void stepTests() {
        if(state.equals("A")) {
            if(slots[currentPosition] == 0) {
                turnOnMoveRight();
                state = "B";
            } else {
                turnOffMoveLeft();
                state = "B";
            }
        } else if(state.equals("B")) {
            if(slots[currentPosition] == 0) {
                turnOnMoveLeft();
                state = "A";
            } else {
                turnOnMoveRight();
                state = "A";
            }
        }
    }

    public int getChecksum() {
        int total = 0;
        for(int i : slots)
            total+= i;
        return total;
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwentyFive adventOfCodeDayTwentyFive = new AdventOfCodeDayTwentyFive();
        adventOfCodeDayTwentyFive.setup();
        adventOfCodeDayTwentyFive.performSteps(12208951);
        int result = adventOfCodeDayTwentyFive.getChecksum();
        System.out.println(result);
    }
}
