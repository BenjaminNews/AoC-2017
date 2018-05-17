package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEighteenTest {

    @Test
    public void inputReturnsSixSafeTiles() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        assertEquals(6, adventOfCodeDayEighteen.calculateSafeTile("..^^.", 3));
    }
    @Test
    public void inputReturnsThirtyEightSafeTiles() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        assertEquals(38, adventOfCodeDayEighteen.calculateSafeTile(".^^.^.^^^^", 10));
    }
}