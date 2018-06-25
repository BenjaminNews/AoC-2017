package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySeventeenTest {

    private AdventOfCodeDaySeventeen adventOfCodeDaySeventeen;

    @Before
    public void setup() {
        adventOfCodeDaySeventeen = new AdventOfCodeDaySeventeen();
        adventOfCodeDaySeventeen.setUp("20, 15, 10, 5, 5", 25);
    }

    @Test
    public void inputReturnsTotalOfFourDifferentArrangements() {
        int result = adventOfCodeDaySeventeen.populateSubset(0);
        assertEquals(4, result);
    }

    @Test
    public void inputReturnStackMinimumSizeOfThree() {
        adventOfCodeDaySeventeen.populateSubset(0);
        int result = adventOfCodeDaySeventeen.getSmallestSet();
        assertEquals(2, result);
    }
}