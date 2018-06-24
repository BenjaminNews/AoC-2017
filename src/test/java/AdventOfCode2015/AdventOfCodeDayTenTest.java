package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTenTest {

    @Test
    public void oneRoundWithStartingInputOfOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "1";

        String result = adventOfCodeDayTen.getStepResult(input);

        assertEquals("11", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "11";

        String result = adventOfCodeDayTen.getStepResult(input);

        assertEquals("21", result);
    }

    @Test
    public void oneRoundWithStartingInputOfTwoOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "21";

        String result = adventOfCodeDayTen.getStepResult(input);

        assertEquals("1211", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneTwoOneOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "1211";

        String result = adventOfCodeDayTen.getStepResult(input);

        assertEquals("111221", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneOneOneTwoTwoOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "111221";

        String result = adventOfCodeDayTen.getStepResult(input);

        assertEquals("312211", result);
    }

    @Test
    public void fiveRoundsReturnThreeOneTwoTwoOneOne() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "1";

        String result = adventOfCodeDayTen.performRounds(input, 5);

        assertEquals("312211", result);
    }
}