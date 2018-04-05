package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySixTest {

    @Test
    public void turnOnAllLights() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input = "turn on 0,0 through 999,999";

        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(1000000, result);
    }

    @Test
    public void toggleAllLightsOnFirstRow() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input = "toggle 0,0 through 999,999";

        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(1000000, result);
    }

    @Test
    public void turnOffMiddleFourLights() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input = "turn on 0,0 through 999,999\n" +
                       "turn off 499,499 through 500,500";

        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(999996, result);
    }

    @Test
    public void turnOnBrightness() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input = "turn on 0,0 through 0,0";

        int result = adventOfCodeDaySix.performActionPartTwo(input);
        assertEquals(1, result);
    }

    @Test
    public void toggleBrightness() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input = "toggle 0,0 through 999,999";

        int result = adventOfCodeDaySix.performActionPartTwo(input);
        assertEquals(2000000, result);
    }
}