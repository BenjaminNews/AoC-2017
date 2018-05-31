package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    @Test
    public void discEscapesAfterFiveSecondWait() {
        String input =  "Disc #1 has 5 positions; at time=0, it is at position 4.\n" +
                        "Disc #2 has 2 positions; at time=0, it is at position 1.";
        AdventOfCodeDayFifteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifteen();
        adventOfCodeDayFifthteen.setup(input);
        int result = adventOfCodeDayFifthteen.getBounceEscapeCount();
        assertEquals(5, result);
    }
}