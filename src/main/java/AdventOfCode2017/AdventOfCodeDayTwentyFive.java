package AdventOfCode2017;

public class AdventOfCodeDayTwentyFive {
    private String state = "A";

    private int[] slots = new int[10000001];

    private int currentPosition;

    private void step() {
        if(state.equals("A")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition++;
                state = "B";
            } else {
                slots[currentPosition] = 0;
                currentPosition--;
                state = "E";
            }
        } else if(state.equals("B")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "C";
            } else {
                slots[currentPosition] = 0;
                currentPosition++;
                state = "A";
            }
        } else if(state.equals("C")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "D";
            } else {
                slots[currentPosition] = 0;
                currentPosition++;
                state = "C";
            }
        } else if(state.equals("D")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "E";
            } else {
                slots[currentPosition] = 0;
                currentPosition--;
                state = "F";
            }
        } else if(state.equals("E")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "A";
            } else {
                currentPosition--;
                state = "C";
            }

        } else if(state.equals("F")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "E";
            } else {
                currentPosition++;
                state = "A";
            }
        }
    }

    public void setup() {
        currentPosition = Math.abs(slots.length / 2);
        for(int i = 0; i < slots.length - 1; i++) {
            slots[i] = 0;
        }
    }

    public void performSteps(int stepCount) {
        for(int i = 0; i < stepCount; i++) {
            System.out.println("current position: " + currentPosition + " step: " + i);
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
                slots[currentPosition] = 1;
                currentPosition++;
                state = "B";
            } else {
                slots[currentPosition] = 0;
                currentPosition--;
                state = "B";
            }
        } else if(state.equals("B")) {
            if(slots[currentPosition] == 0) {
                slots[currentPosition] = 1;
                currentPosition--;
                state = "A";
            } else {
                currentPosition++;
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
