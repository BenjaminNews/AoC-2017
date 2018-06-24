package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwelveTest {

    private AdventOfCodeDayTwelve adventOfCodeDayTwelve;

    @Before
    public void setUp() {
        adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();
    }

    @Test
    public void inputOneReturnsSix() {
        String input = "[1,2,3]";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(6, result);
    }

    @Test
    public void inputTwoReturnsSix() {
        String input = "{\"a\":2,\"b\":4}";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(6, result);
    }

    @Test
    public void inputThreeReturnsThree() {
        String input = "[[[3]]]";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFourReturnsThree() {
        String input = "{\"a\":{\"b\":4},\"c\":-1}";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFiveReturnScoreOfZero() {
        String input = "{\"a\":[-1,1]}";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(0, result);
    }

    @Test
    public void inputSixReturnScoreOfZero() {
        String input = "[-1,{\"a\":1}]";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(0, result);
    }

    @Test
    public void inputsReturnScoreOFZero() {
        String input = "[]{}";
        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(0, result);
    }

    @Test
    public void inputReturnsAScoreOSix() {
        String input = "[1,2,3]";
        int result = adventOfCodeDayTwelve.getScorePartTwo(input);
        assertEquals(6, result);
    }

    @Test
    public void inputReturnsAScoreOfZero() {
        String input = "[1,{\"c\":\"red\",\"b\":2},3]";
        int result = adventOfCodeDayTwelve.getScorePartTwo(input);
        assertEquals(4, result);
    }

    @Test
    public void inputReturnsAScoreOfZeroSecondTime() {
        String input = "{\"d\":\"red\",\"e\":[1,2,3,4],\"f\":5}";
        int result = adventOfCodeDayTwelve.getScorePartTwo(input);
        assertEquals(0, result);
    }

    @Test
    public void inputReturnsAScoreOfSix() {
        String input = "[1,\"red\",5]";
        int result = adventOfCodeDayTwelve.getScorePartTwo(input);
        assertEquals(6, result);
    }
}