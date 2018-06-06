package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyOneTest {

    @Test
    public void swapPosition0With4RetunsEBCDA() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("ebcda", result);
    }

    @Test
    public void swapLetterDWithLetterBRetunsEDCBA() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                              "swap letter d with letter b";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("edcba", result);
    }

    @Test
    public void reversePositions0ThroughFourReturnsABCDE() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                              "swap letter d with letter b\n" +
                              "reverse positions 0 through 4";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("abcde", result);
    }

    @Test
    public void rotateLeftOneReturnsBCDEA() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                              "swap letter d with letter b\n" +
                              "reverse positions 0 through 4\n" +
                              "rotate left 1 step";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("bcdea", result);
    }

    @Test
    public void movePositionOneToFourReturnsBCDEA() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                              "swap letter d with letter b\n" +
                              "reverse positions 0 through 4\n" +
                              "rotate left 1 step\n" +
                              "move position 1 to position 4";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("bdeac", result);
    }

    @Test
    public void movePositionThreeToZeroReturnsABDEC() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                "swap letter d with letter b\n" +
                "reverse positions 0 through 4\n" +
                "rotate left 1 step\n" +
                "move position 1 to position 4\n" +
                "move position 3 to position 0";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("abdec", result);
    }

    @Test
    public void rotateBasedOnPositionB() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                "swap letter d with letter b\n" +
                "reverse positions 0 through 4\n" +
                "rotate left 1 step\n" +
                "move position 1 to position 4\n" +
                "move position 3 to position 0\n" +
                "rotate based on position of letter b";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("ecabd", result);
    }

    @Test
    public void rotateBasedOnPositionD() {
        AdventOfCodeDayTwentyOne adventOfCodeDayTwentyOne = new AdventOfCodeDayTwentyOne();
        String instructuons = "swap position 4 with position 0\n" +
                "swap letter d with letter b\n" +
                "reverse positions 0 through 4\n" +
                "rotate left 1 step\n" +
                "move position 1 to position 4\n" +
                "move position 3 to position 0\n" +
                "rotate based on position of letter b\n" +
                "rotate based on position of letter d";
        String startString = "abcde";
        adventOfCodeDayTwentyOne.setUp(instructuons, startString);
        String result = adventOfCodeDayTwentyOne.manipulateInput();
        assertEquals("decab", result);
    }
    //move position 1 to position 4
}