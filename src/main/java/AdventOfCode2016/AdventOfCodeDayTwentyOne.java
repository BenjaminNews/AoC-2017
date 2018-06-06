package AdventOfCode2016;

import java.util.Arrays;

public class AdventOfCodeDayTwentyOne {

    private char[] startValues;
    private String[] instructions;

    public void setUp(String instructions, String startString) {
        this.startValues = startString.toCharArray();
        this.instructions = instructions.split("\n");
    }

    public String manipulateInput() {
        for(String s : instructions) {
            if(s.startsWith("swap position")) {
                int positionOne = Integer.parseInt(s.split(" ")[2]);
                int positionTwo = Integer.parseInt(s.split(" ")[5]);
                swapPositions(positionOne, positionTwo);
            }
            else if(s.startsWith("swap letter")) {
                String characterValueOne = s.split(" ")[2];
                String characterValueTwo = s.split(" ")[5];
                swapLetters(characterValueOne, characterValueTwo);
            }
            else if (s.startsWith("reverse positions")) {
                int positionOne = Integer.parseInt(s.split(" ")[2]);
                int positionTwo = Integer.parseInt(s.split(" ")[4]);
                reversePositions(positionOne, positionTwo);
            }
            else if(s.startsWith("rotate left")) {
                int amount = Integer.parseInt(s.split(" ")[2]);
                rotateLeft(amount);
            } else if(s.startsWith("move position")) {
                int positionOne = Integer.parseInt(s.split(" ")[2]);
                int positionTwo = Integer.parseInt(s.split(" ")[5]);
                movePosition(positionOne, positionTwo);
            } else if(s.startsWith("rotate based")) {
                String[] values = s.split(" ");
                rotateBasedOnPosition(values[values.length - 1]);
            }
        }
        System.out.println(arrayAsString(startValues));
        return arrayAsString(startValues);
    }

    private void rotateBasedOnPosition(String character) {
        int index = arrayAsString(startValues).indexOf(character);
        if(index >= 4) {
            index += 2;
        } else {
            index++;
        }
        for(int i = 0; i < index; i++) {
            char[] start = Arrays.copyOfRange(startValues, 0, startValues.length - 1);
            char[] endValue = new char[] {startValues[startValues.length - 1] };
            startValues = joinArray(endValue, start);
        }
    }

    private void movePosition(int positionOne, int positionTwo) {
        char[] insert = new char[] { startValues[positionOne] };
        if(positionOne < positionTwo) {
            char[] start = Arrays.copyOfRange(startValues, 0, positionOne);
            char[] middle = Arrays.copyOfRange(startValues, positionOne + 1, positionTwo + 1);
            char[] end = Arrays.copyOfRange(startValues, positionTwo + 1, startValues.length);
            startValues = joinArray(start, middle, insert, end);
        } else {
            char[] start = Arrays.copyOfRange(startValues, 0, positionTwo);
            char[] middle = Arrays.copyOfRange(startValues, positionTwo, positionOne);
            char[] end = Arrays.copyOfRange(startValues, positionOne + 1, startValues.length);
            startValues = joinArray(start, insert, middle, end);
        }
    }

    private void reversePositions(int positionOne, int positionTwo) {
        char[] start;
        if(positionOne == 0) {
            start = new char[]{};
        } else {
            start = Arrays.copyOfRange(startValues, 0, positionOne);
        }
        char[] end = Arrays.copyOfRange(startValues, positionTwo + 1, startValues.length);
        char[] middle = Arrays.copyOfRange(startValues, positionOne, positionTwo + 1);
        middle = new StringBuilder(new String(arrayAsString(middle))).reverse().toString().toCharArray();

        startValues = joinArray(end, middle, start);
    }

    private void rotateLeft(int amount) {
        for(int i = 0; i < amount; i++) {
            char[] start = Arrays.copyOfRange(startValues, 1, startValues.length);
            char[] endValue = new char[] {startValues[0] };
            startValues = joinArray(start, endValue);
        }
    }

    private void swapPositions(int positionOne, int positionTwo) {
        char one = startValues[positionOne];
        char two = startValues[positionTwo];
        startValues[positionOne] = two;
        startValues[positionTwo] = one;
    }

    private void swapLetters(String characterOne, String characterTwo) {
        String currentRepresentation = arrayAsString(startValues);
        int characterOneLocation = currentRepresentation.indexOf(String.valueOf(characterOne));
        int characterTwoLocation = currentRepresentation.indexOf(String.valueOf(characterTwo));
        startValues[characterOneLocation] = characterTwo.toCharArray()[0];
        startValues[characterTwoLocation] = characterOne.toCharArray()[0];
    }

    private static char[] joinArray(char[]... arrays) {
        int length = 0;
        for (char[] array : arrays) {
            length += array.length;
        }
        char[] result = new char[length];
        int offset = 0;
        for (char[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }

    private String arrayAsString(char[] arr) {
        String s = "";
        for(char c: arr) {
            s += String.valueOf(c);
        }
        return s;
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        adventOfCodeDayTwentyOne.setUp(input,"abcdefgh");
        System.out.println(adventOfCodeDayTwentyOne.manipulateInput());
    }

    private static final String input = "rotate based on position of letter a\n" +
                                        "swap letter g with letter d\n" +
                                        "move position 1 to position 5\n" +
                                        "reverse positions 6 through 7\n" +
                                        "move position 5 to position 4\n" +
                                        "rotate based on position of letter b\n" +
                                        "reverse positions 6 through 7\n" +
                                        "swap letter h with letter f\n" +
                                        "swap letter e with letter c\n" +
                                        "reverse positions 0 through 7\n" +
                                        "swap position 6 with position 4\n" +
                                        "rotate based on position of letter e\n" +
                                        "move position 2 to position 7\n" +
                                        "swap position 6 with position 4\n" +
                                        "rotate based on position of letter e\n" +
                                        "reverse positions 2 through 3\n" +
                                        "rotate right 2 steps\n" +
                                        "swap position 7 with position 1\n" +
                                        "move position 1 to position 2\n" +
                                        "move position 4 to position 7\n" +
                                        "move position 5 to position 0\n" +
                                        "swap letter e with letter f\n" +
                                        "move position 4 to position 7\n" +
                                        "reverse positions 1 through 7\n" +
                                        "rotate based on position of letter g\n" +
                                        "move position 7 to position 4\n" +
                                        "rotate right 6 steps\n" +
                                        "rotate based on position of letter g\n" +
                                        "reverse positions 0 through 5\n" +
                                        "reverse positions 0 through 7\n" +
                                        "swap letter c with letter f\n" +
                                        "swap letter h with letter f\n" +
                                        "rotate right 7 steps\n" +
                                        "rotate based on position of letter g\n" +
                                        "rotate based on position of letter c\n" +
                                        "swap position 1 with position 4\n" +
                                        "move position 7 to position 3\n" +
                                        "reverse positions 2 through 6\n" +
                                        "move position 7 to position 0\n" +
                                        "move position 7 to position 1\n" +
                                        "move position 6 to position 7\n" +
                                        "rotate right 5 steps\n" +
                                        "reverse positions 0 through 6\n" +
                                        "move position 1 to position 4\n" +
                                        "rotate left 3 steps\n" +
                                        "swap letter d with letter c\n" +
                                        "move position 4 to position 5\n" +
                                        "rotate based on position of letter f\n" +
                                        "rotate right 1 step\n" +
                                        "move position 7 to position 6\n" +
                                        "swap position 6 with position 0\n" +
                                        "move position 6 to position 2\n" +
                                        "rotate right 1 step\n" +
                                        "swap position 1 with position 6\n" +
                                        "move position 2 to position 6\n" +
                                        "swap position 2 with position 1\n" +
                                        "reverse positions 1 through 7\n" +
                                        "move position 4 to position 1\n" +
                                        "move position 7 to position 0\n" +
                                        "swap position 6 with position 7\n" +
                                        "rotate left 1 step\n" +
                                        "reverse positions 0 through 4\n" +
                                        "rotate based on position of letter c\n" +
                                        "rotate based on position of letter b\n" +
                                        "move position 2 to position 1\n" +
                                        "rotate right 0 steps\n" +
                                        "swap letter b with letter d\n" +
                                        "swap letter f with letter c\n" +
                                        "swap letter d with letter a\n" +
                                        "swap position 7 with position 6\n" +
                                        "rotate right 0 steps\n" +
                                        "swap position 0 with position 3\n" +
                                        "swap position 2 with position 5\n" +
                                        "swap letter h with letter f\n" +
                                        "reverse positions 2 through 3\n" +
                                        "rotate based on position of letter c\n" +
                                        "rotate left 2 steps\n" +
                                        "move position 0 to position 5\n" +
                                        "swap position 2 with position 3\n" +
                                        "rotate right 1 step\n" +
                                        "rotate left 2 steps\n" +
                                        "move position 0 to position 4\n" +
                                        "rotate based on position of letter c\n" +
                                        "rotate based on position of letter g\n" +
                                        "swap position 3 with position 0\n" +
                                        "rotate right 3 steps\n" +
                                        "reverse positions 0 through 2\n" +
                                        "move position 1 to position 2\n" +
                                        "swap letter e with letter c\n" +
                                        "rotate right 7 steps\n" +
                                        "move position 0 to position 7\n" +
                                        "rotate left 2 steps\n" +
                                        "reverse positions 0 through 4\n" +
                                        "swap letter e with letter b\n" +
                                        "reverse positions 2 through 7\n" +
                                        "rotate right 5 steps\n" +
                                        "swap position 2 with position 4\n" +
                                        "swap letter d with letter g\n" +
                                        "reverse positions 3 through 4\n" +
                                        "reverse positions 4 through 5";
}
