package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwoTest {

    @Test
    public void inputOneRequiresFiftyEightSquareFeetOfWrappingPaper() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "2x3x4";

        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);

        int result = adventOfCodeDayTwo.getWrappingPaperSize();
        assertEquals(58, result);
    }

    @Test
    public void inputTwoRequiresFourtyThreeSquareFeetOfWrappingPaper() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "1x1x10";

        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);

        int result = adventOfCodeDayTwo.getWrappingPaperSize();
        assertEquals(43, result);
    }

    @Test
    public void inputThreeRequiresThirtyFourFeetOfRibbon() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "2x3x4";

        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);

        int result = adventOfCodeDayTwo.getBowLenght();
        assertEquals(34, result);
    }

    @Test
    public void inputFourRequiresFourteenFeetOfRibbon() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "1x1x10";

        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);

        int result = adventOfCodeDayTwo.getBowLenght();
        assertEquals(14, result);
    }
}