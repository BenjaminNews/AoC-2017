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
        int result = adventOfCodeDayTwelve.getScore("[1,2,3]");
        assertEquals(6, result);
    }

    @Test
    public void inputTwoReturnsSix() {
        int result = adventOfCodeDayTwelve.getScore("{\"a\":2,\"b\":4}");
        assertEquals(6, result);
    }

    @Test
    public void inputThreeReturnsThree() {
        int result = adventOfCodeDayTwelve.getScore("[[[3]]]");
        assertEquals(3, result);
    }

    @Test
    public void inputFourReturnsThree() {
        int result = adventOfCodeDayTwelve.getScore("{\"a\":{\"b\":4},\"c\":-1}");
        assertEquals(3, result);
    }

    @Test
    public void inputFiveReturnScoreOfZero() {
        int result = adventOfCodeDayTwelve.getScore("{\"a\":[-1,1]}");
        assertEquals(0, result);
    }

    @Test
    public void inputSixReturnScoreOfZero() {
        int result = adventOfCodeDayTwelve.getScore("[-1,{\"a\":1}]");
        assertEquals(0, result);
    }

    @Test
    public void inputsReturnScoreOFZero() {
        int result = adventOfCodeDayTwelve.getScore("[]{}");
        assertEquals(0, result);
    }

    @Test
    public void inputReturnsAScoreOSix() {
        int result = adventOfCodeDayTwelve.getScorePartTwo("[1,2,3]");
        assertEquals(6, result);
    }

    @Test
    public void inputReturnsAScoreOfZero() {
        int result = adventOfCodeDayTwelve.getScorePartTwo("[1,{\"c\":\"red\",\"b\":2},3]");
        assertEquals(4, result);
    }

    @Test
    public void inputReturnsAScoreOfZeroSecondTime() {
        int result = adventOfCodeDayTwelve.getScorePartTwo("{\"d\":\"red\",\"e\":[1,2,3,4],\"f\":5}");
        assertEquals(0, result);
    }

    @Test
    public void inputReturnsAScoreOfSix() {
        int result = adventOfCodeDayTwelve.getScorePartTwo("[1,\"red\",5]");
        assertEquals(6, result);
    }
}