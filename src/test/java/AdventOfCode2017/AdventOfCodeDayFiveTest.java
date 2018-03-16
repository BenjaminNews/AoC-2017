package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayFive;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayFiveTest {

    @Test
    public void reverseListFirstStep() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";

        int res = adventOfCodeDayFive.performMovePartOne();

        assertEquals(5, res);
    }

}