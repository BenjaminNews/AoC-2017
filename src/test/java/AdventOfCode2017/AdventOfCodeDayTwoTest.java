package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayTwo;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayTwoTest {

    //part one tests
    @Test
    public void rowReturnsValueOfEightPartOne() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "5 1 9 5";

        int result = adventOfCodeDayTwo.getResultPartOne(input);

        assertEquals(8, result);
    }

    @Test
    public void rowReturnsValueOfFourPartOne() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "7 5 3";

        int result = adventOfCodeDayTwo.getResultPartOne(input);

        assertEquals(4, result);
    }

    @Test
    public void rowReturnsValueOfSixPartOne() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "2 4 6 8";

        int result = adventOfCodeDayTwo.getResultPartOne(input);

        assertEquals(6, result);
    }

    //part two tests
    @Test
    public void rowReturnsValueOfFourPartTwo() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "5 9 2 8";

        int result = adventOfCodeDayTwo.getResultPartTwo(input);

        assertEquals(4, result);
    }

    @Test
    public void rowReturnsValueOfThreePartTwo() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "9 4 7 3";

        int result = adventOfCodeDayTwo.getResultPartTwo(input);

        assertEquals(3, result);
    }

    @Test
    public void rowReturnsValueOfTwoPartTwo() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "3 8 6 5";

        int result = adventOfCodeDayTwo.getResultPartTwo(input);

        assertEquals(2, result);
    }

    @Test
    public void allRowsReturnScoreOfNinePartTwo() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input =  "5 9 2 8\n" +
                        "9 4 7 3\n" +
                        "3 8 6 5";

        int result = adventOfCodeDayTwo.getResultPartTwo(input);

        assertEquals(9, result);
    }
}