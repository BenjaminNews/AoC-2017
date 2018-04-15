package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTenTest {

    @Test
    public void inputOneReturnsScoreOfTwo() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input = "3";

        adventOfCodeDayTen.setUp(5, input);
        int result = adventOfCodeDayTen.twist();
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    public void inputTwoReturnsScoreOfTwelve() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input = "3,4";

        adventOfCodeDayTen.setUp(5, input);
        int result = adventOfCodeDayTen.twist();
        assertEquals(12, result);
    }

    @Test
    public void inputThreeReturnsScoreOfTelve() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input = "3,4,1";

        adventOfCodeDayTen.setUp(5, input);
        int result = adventOfCodeDayTen.twist();
        assertEquals(12, result);
    }

    @Test
    public void inputFourReturnsScoreOfTwoAfterTwistOfTwelve() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input = "3,4,1,5";

        adventOfCodeDayTen.setUp(5, input);
        int result = adventOfCodeDayTen.twist();
        assertEquals(12, result);
    }
}