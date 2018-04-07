package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwelveTest {

    @Test
    public void inputOneReturnsSix() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "[1,2,3]";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(6, result);
    }

    @Test
    public void inputTwoReturnsSix() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "{\"a\":2,\"b\":4}";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(6, result);
    }

    @Test
    public void inputThreeReturnsThree() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "[[[3]]]";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFourReturnsThree() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "{\"a\":{\"b\":4},\"c\":-1}";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(3, result);
    }

    @Test
    public void inputFiveReturnScoreOfZero() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "{\"a\":[-1,1]}";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(0, result);
    }

    @Test
    public void inputSixReturnScoreOfZero() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "[-1,{\"a\":1}]";

        int result = adventOfCodeDayTwelve.getScore(input);
        assertEquals(0, result);
    }

    @Test
    public void inputsReturnScoreOFZero() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "[]\n" +
                       "{}";

        int result = 0;

        for(String s : input.split("\n")) {
            result += adventOfCodeDayTwelve.getScore(input);

        }
        assertEquals(0, result);
    }
}