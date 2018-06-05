package AdventOfCode2016;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayNineTest {

    @Test
    public void inputOneHasADecompressedLengthOfSix() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "ADVENT";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(6, result);
    }

    @Test
    public void inputTwoHasADecompressedLengthOfSeven() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "A(1x5)BC";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(7, result);
    }

    @Test
    public void inputThreeHasADecompressedLengthOfNine() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "(3x3)XYZ";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(9, result);
    }

    @Test
    public void inputFourHasADecompressedLengthOfEleven() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "A(2x2)BCD(2x2)EFG";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(11, result);
    }

    @Test
    public void inputFiveHasADecompressedLengthOfSix() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "(6x1)(1x3)A";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(6, result);
    }

    @Test
    public void inputSixHasADecompressedLengthOfEighteen() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "X(8x2)(3x3)ABCY";
        int result = adventOfCodeDayNine.getDecompressedLength(input);
        assertEquals(18, result);
    }

    @Test
    public void inputOneHasDecompressedLengthOfNinePartTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "(3x3)XYZ";
        int result = adventOfCodeDayNine.getDecompressedLengthPartTwo(input);
        assertEquals(9, result);
    }

    @Test
    public void inputTwoHasDecompressedLengthOfTwentyPartTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "X(8x2)(3x3)ABCY";
        int result = adventOfCodeDayNine.getDecompressedLengthPartTwo(input);
        assertEquals(20, result);
    }

    @Test
    public void inputThreeHasDecompressedLengthOf241920PartTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "(27x12)(20x12)(13x14)(7x10)(1x12)A";
        int result = adventOfCodeDayNine.getDecompressedLengthPartTwo(input);
        assertEquals(241920, result);
    }

    @Test
    public void inputFourHasDecompressedLengthOf445PartTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "(25x3)(3x3)ABC(2x3)XY(5x2)PQRSTX(18x9)(3x2)TWO(5x7)SEVEN";
        int result = adventOfCodeDayNine.getDecompressedLengthPartTwo(input);
        assertEquals(445, result);
    }
}