package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayThirteenTest {


    @Test
    public void testTripSeverityEqualsTwentyFour() {
        AdventOfCodeDayThirteen adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();

        String input = "0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4";

        adventOfCodeDayThirteen.setUp(input);

        int result = adventOfCodeDayThirteen.moveProgram();

        assertEquals(24, result);
    }

    @Test
    public void testTripTakesTenPicoSecondsToPassWithoutBeingCaught() {
        AdventOfCodeDayThirteen adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();

        String input = "0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4";

        adventOfCodeDayThirteen.setUp(input);

        int result = adventOfCodeDayThirteen.moveProgramPartTwo();

        assertEquals(10, result);
    }
}