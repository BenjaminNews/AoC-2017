package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFiveTest {

    @Test
    public void partOneTest() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String result =  adventOfCodeDayFive.partOne("abc");
        assertEquals("18f47a30", result);
    }

    @Test
    public void partTwoTest() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String result =  adventOfCodeDayFive.partTwo("abc");
        assertEquals("05ace8e3", result);
    }
}
