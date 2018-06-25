package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    private AdventOfCodeDayFifthteen adventOfCodeDayFifthteen;

    @Before
    public void setup() {
        adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
    }

    @Test
    public void partOneReturnsScoreOf62842880() {

        int result = adventOfCodeDayFifthteen.partOneTest();
        assertEquals(62842880, result);
    }

    @Test
    public void partTwoReturnsScoreOf57600000() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        int result = adventOfCodeDayFifthteen.partTwoTest();
        assertEquals(57600000, result);
    }
}