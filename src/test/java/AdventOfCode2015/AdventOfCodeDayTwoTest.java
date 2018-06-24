package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwoTest {

    private AdventOfCodeDayTwo adventOfCodeDayTwo;

    @Before
    public void setup() {
        adventOfCodeDayTwo = new AdventOfCodeDayTwo();
    }

    @Test
    public void inputOneRequiresFiftyEightSquareFeetOfWrappingPaper() {
        String input = "2x3x4";
        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);
        int result = adventOfCodeDayTwo.getWrappingPaperSize();
        assertEquals(58, result);
    }

    @Test
    public void inputTwoRequiresFourtyThreeSquareFeetOfWrappingPaper() {
        String input = "1x1x10";
        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);
        int result = adventOfCodeDayTwo.getWrappingPaperSize();
        assertEquals(43, result);
    }

    @Test
    public void inputThreeRequiresThirtyFourFeetOfRibbon() {
        String input = "2x3x4";
        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);
        int result = adventOfCodeDayTwo.getBowLenght();
        assertEquals(34, result);
    }

    @Test
    public void inputFourRequiresFourteenFeetOfRibbon() {
        String input = "1x1x10";
        adventOfCodeDayTwo.calculateRequiredWrappingPaper(input);
        int result = adventOfCodeDayTwo.getBowLenght();
        assertEquals(14, result);
    }
}