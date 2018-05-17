package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyTest {
    @Test
    public void lowestIPofThreeIsAvailable() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        String input = "5-8\n" +
                       "0-2\n" +
                       "4-7\n";
        adventOfCodeDayTwenty.setup(input);
        double result = adventOfCodeDayTwenty.getLowestAvailableIpAddress();
        assertEquals(3.0, result, 0.001);
    }

}