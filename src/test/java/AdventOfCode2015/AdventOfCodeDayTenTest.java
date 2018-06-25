package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTenTest {

    private AdventOfCodeDayTen adventOfCodeDayTen;

    @Before
    public void setup() {
        adventOfCodeDayTen = new AdventOfCodeDayTen();
    }

    @Test
    public void oneRoundWithStartingInputOfOne() {
        String result = adventOfCodeDayTen.getStepResult("1");
        assertEquals("11", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneOne() {
        String result = adventOfCodeDayTen.getStepResult("11");
        assertEquals("21", result);
    }

    @Test
    public void oneRoundWithStartingInputOfTwoOne() {
        String result = adventOfCodeDayTen.getStepResult("21");
        assertEquals("1211", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneTwoOneOne() {
        String result = adventOfCodeDayTen.getStepResult("1211");
        assertEquals("111221", result);
    }

    @Test
    public void oneRoundWithStartingInputOfOneOneOneTwoTwoOne() {
        String result = adventOfCodeDayTen.getStepResult("111221");
        assertEquals("312211", result);
    }

    @Test
    public void fiveRoundsReturnThreeOneTwoTwoOneOne() {
        String result = adventOfCodeDayTen.performRounds("1", 5);
        assertEquals("312211", result);
    }
}