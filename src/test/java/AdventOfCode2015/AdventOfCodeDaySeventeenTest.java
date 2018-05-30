package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySeventeenTest {

    @Test
    public void inputReturnsTotalOfFourDifferentArrangements() {
        AdventOfCodeDaySeventeen adventOfCodeDaySeventeen = new AdventOfCodeDaySeventeen();
        String input = "20, 15, 10, 5, 5";
        adventOfCodeDaySeventeen.setUp(input, 25);
        int result = adventOfCodeDaySeventeen.populateSubset(0);
        assertEquals(4, result);
    }

    @Test
    public void inputReturnStackMinimumSizeOfThree() {
        AdventOfCodeDaySeventeen adventOfCodeDaySeventeen = new AdventOfCodeDaySeventeen();
        String input = "20, 15, 10, 5, 5";
        adventOfCodeDaySeventeen.setUp(input, 25);
        adventOfCodeDaySeventeen.populateSubset(0);
        int result = adventOfCodeDaySeventeen.getSmallestSet();
        assertEquals(2, result);
    }
}