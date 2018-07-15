package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayFiveTest {

    @Test
    public void exitTwist() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";
        adventOfCodeDayFive.setup(input);
        int res = adventOfCodeDayFive.performMovePartOne();

        assertEquals(5, res);
    }

    @Test
    public void exitTwistWithBackStep() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";
        adventOfCodeDayFive.setup(input);
        int res = adventOfCodeDayFive.performMovePartTwo();
        assertEquals(10, res);
    }
}