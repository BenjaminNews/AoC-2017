package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    @Test
    public void test() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        int result = adventOfCodeDayFifthteen.forTest();
        assertEquals(62842880, result);
    }

    @Test
    public void testPartTwo() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        int result = adventOfCodeDayFifthteen.forTestPartTwo();
        assertEquals(57600000, result);
    }
}