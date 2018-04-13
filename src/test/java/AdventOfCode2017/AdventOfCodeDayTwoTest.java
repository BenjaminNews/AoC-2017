package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwoTest {

    @Test
    public void inputOneReturnsScoreOfEighteen() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "5 1 9 5\n" +
                       "7 5 3\n" +
                       "2 4 6 8";

        int result = adventOfCodeDayTwo.getResultPartOne(input);
        assertEquals(18, result);
    }

    @Test
    public void inputTwoReturnsScoreOfNine() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "5 9 2 8\n" +
                       "9 4 7 3\n" +
                       "3 8 6 5";

        int result = adventOfCodeDayTwo.getResultPartTwo(input);
        assertEquals(9, result);
    }
}
