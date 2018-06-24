package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySixTest {

    private AdventOfCodeDaySix adventOfCodeDaySix;

    @Before
    public void setup() {
        adventOfCodeDaySix = new AdventOfCodeDaySix();
    }

    @Test
    public void turnOnAllLights() {
        String input = "turn on 0,0 through 999,999";
        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(1000000, result);
    }

    @Test
    public void toggleAllLightsOnFirstRow() {
        String input = "toggle 0,0 through 999,999";
        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(1000000, result);
    }

    @Test
    public void turnOffMiddleFourLights() {
        String input = "turn on 0,0 through 999,999\n" +
                       "turn off 499,499 through 500,500";
        int result = adventOfCodeDaySix.performAction(input);
        assertEquals(999996, result);
    }

    @Test
    public void turnOnBrightness() {
        String input = "turn on 0,0 through 0,0";
        int result = adventOfCodeDaySix.performActionPartTwo(input);
        assertEquals(1, result);
    }

    @Test
    public void toggleBrightness() {
        String input = "toggle 0,0 through 999,999";
        int result = adventOfCodeDaySix.performActionPartTwo(input);
        assertEquals(2000000, result);
    }
}