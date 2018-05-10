package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyFiveTest {

    @Test
    public void afterSixStepsAChecksumOfThreeIsCalculated() {
        AdventOfCodeDayTwentyFive adventOfCodeDayTwentyFive = new AdventOfCodeDayTwentyFive();
        adventOfCodeDayTwentyFive.setup();
        adventOfCodeDayTwentyFive.performStepsTest(6);
        int result = adventOfCodeDayTwentyFive.getChecksum();
        assertEquals(3, result);
    }
}