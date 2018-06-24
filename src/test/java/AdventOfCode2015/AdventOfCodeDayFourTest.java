package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFourTest {

    private AdventOfCodeDayFour adventOfCodeDayFour;

    @Before
    public void setup() {
        adventOfCodeDayFour = new AdventOfCodeDayFour();
    }

    @Test
    public void inputReturnsHashOf609043() {
        String input ="abcdef";
        int result = adventOfCodeDayFour.getHashPartOne(input);
        assertEquals(609043, result);
    }

    @Test
    public void inputReturnsHashOf1048970() {
        String input ="pqrstuv";
        int result = adventOfCodeDayFour.getHashPartTwo(input);
        assertEquals(1048970, result);
    }
}