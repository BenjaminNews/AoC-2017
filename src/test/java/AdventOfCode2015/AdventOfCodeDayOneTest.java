package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayOneTest {

    private AdventOfCodeDayOne adventOfCodeDayOne;

    @Before
    public void setup() {
        adventOfCodeDayOne = new AdventOfCodeDayOne();
    }

    @Test
    public void inputOneResultsInFloorZero() {
        String input = "(())";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(0, result);
    }

    @Test
    public void inputTwoResultsInFloorZero() {
        String input = "()()";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(0, result);
    }

    @Test
    public void inputThreeResultsInFloorThree() {
        String input = "(((";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFourResultsInFloorThree() {
        String input = "(()(()(";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFiveResultsInFloorThree() {
        String input = "))(((((";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(3, result);
    }

    @Test
    public void inputSixResultsInFloorMinusOne() {
        String input = "())";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-1, result);
    }

    @Test
    public void inputSevenResultsInFloorMinusOne() {
        String input = "))(";
        int resut =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-1, resut);
    }

    @Test
    public void inputEightResultsInFloorMinusOne() {
        String input = ")))";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-3, result);
    }

    @Test
    public void inputNineResultsInFloorMinusOne() {
        String input = ")())())";
        int result =  adventOfCodeDayOne.getFloor(input);
        assertEquals(-3, result);
    }

    @Test
    public void inputTenResultsInOneMoveUntilBasementIsEntered() {
        String input = ")";
        int result =  adventOfCodeDayOne.getMoveCountUntilBasementIsEntered(input);
        assertEquals(1, result);
    }

    @Test
    public void inputElevenResultsInFiveMovesUntilBasementIsEntered() {
        String input = "()())";
        int result =  adventOfCodeDayOne.getMoveCountUntilBasementIsEntered(input);
        assertEquals(5, result);
    }
}