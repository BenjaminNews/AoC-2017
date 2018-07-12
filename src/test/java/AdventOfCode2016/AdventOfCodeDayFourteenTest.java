package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFourteenTest {

    @Test
    public void inputReturnsFirstKeyAtIndex39() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        int result = adventOfCodeDayFourteen.getIndex("abc", 1);
        assertEquals(39, result);
    }

    @Test
    public void inputReturnsSecondKeyAtIndex92() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        int result = adventOfCodeDayFourteen.getIndex("abc", 2);
        assertEquals(92, result);
    }

    @Test
    public void inputReturnsSixtyFourthKeyAtIndex22728() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        int result = adventOfCodeDayFourteen.getIndex("abc", 64);
        assertEquals(22728, result);
    }
}