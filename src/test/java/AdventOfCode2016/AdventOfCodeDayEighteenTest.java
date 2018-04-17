package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEighteenTest {

    @Test
    public void firstRowHasTotalOfFourSafeSpaces() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input = "..^^.";
        adventOfCodeDayEighteen.setUp(input, 100);
        int result = adventOfCodeDayEighteen.getSafeTileCount(input);

        assertEquals(4, result);
    }

}