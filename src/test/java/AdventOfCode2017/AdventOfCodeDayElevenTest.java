package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayElevenTest {

    @Test
    public void inputOneisThreeStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,ne";

        adventOfCodeDayEleven.performSteps(input);
        int result = adventOfCodeDayEleven.getDistance();
        assertEquals(3, result);
    }

    @Test
    public void inputTwoReturnsToStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,sw,sw";

        adventOfCodeDayEleven.performSteps(input);
        int result = adventOfCodeDayEleven.getDistance();
        assertEquals(0, result);
    }

    @Test
    public void inputThreeIsTwoStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,s,s";

        adventOfCodeDayEleven.performSteps(input);
        int result = adventOfCodeDayEleven.getDistance();
        assertEquals(2, result);
    }

    @Test
    public void inputFourIsThreeStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,sw,se,sw,sw";

        adventOfCodeDayEleven.performSteps(input);
        int result = adventOfCodeDayEleven.getDistance();
        assertEquals(3, result);
    }
}