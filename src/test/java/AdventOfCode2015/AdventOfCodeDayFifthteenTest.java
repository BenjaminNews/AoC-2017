package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    @Test
    public void test() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        double result = adventOfCodeDayFifthteen.getCombinationsForTest();
        assertEquals(62842880, result);
    }

}