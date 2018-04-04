package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayOneTest {

    @Test
    public void inputOneResultsInFloorZero() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "(())";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(0, resut);
    }

    @Test
    public void inputTwoResultsInFloorZero() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "()()";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(0, resut);
    }

    @Test
    public void inputThreeResultsInFloorThree() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "(((";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, resut);
    }

    @Test
    public void inputFourResultsInFloorThree() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "(()(()(";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, resut);
    }

    @Test
    public void inputFiveResultsInFloorThree() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "))(((((";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, resut);
    }

    @Test
    public void inputSixResultsInFloorMinusOne() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "())";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-1, resut);
    }

    @Test
    public void inputSevenResultsInFloorMinusOne() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "))(";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-1, resut);
    }

    @Test
    public void inputEightResultsInFloorMinusOne() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = ")))";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-3, resut);
    }

    @Test
    public void inputNineResultsInFloorMinusOne() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = ")())())";

        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-3, resut);
    }

    @Test
    public void inputTenResultsInOneMoveUntilBasementIsEntered() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = ")";

        int resut =  adventOfCodeDayOne.getMoveCountUntilBasementIsEntered(input);
        assertEquals(1, resut);
    }

    @Test
    public void inputElevenResultsInFiveMovesUntilBasementIsEntered() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "()())";

        int resut =  adventOfCodeDayOne.getMoveCountUntilBasementIsEntered(input);
        assertEquals(5, resut);
    }
}