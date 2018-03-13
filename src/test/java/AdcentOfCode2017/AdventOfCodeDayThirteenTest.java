package AdcentOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayThirteenTest {

    private final String input = "0: 3\n" +
            "1: 2\n" +
            "4: 4\n" +
            "6: 4";

    @Test
    public void testTripSeverityEqualsTwentyFour() {
        AdventOfCodeDayThirteen adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();

        adventOfCodeDayThirteen.setup(input);

        int result = adventOfCodeDayThirteen.move();

        assertEquals(24, result);
    }
}