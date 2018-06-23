package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTenTest {
    @Test
    public void chipFiveToOutputBinZeroChipTwoToOutputBinOneChipThreeToOutputBinTwo() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input =  "value 5 goes to bot 2\n" +
                        "bot 2 gives low to bot 1 and high to bot 0\n" +
                        "value 3 goes to bot 1\n" +
                        "bot 1 gives low to output 1 and high to bot 0\n" +
                        "bot 0 gives low to output 2 and high to output 0\n" +
                        "value 2 goes to bot 2";
        adventOfCodeDayTen.setup(input);
        adventOfCodeDayTen.run();
        int binZero = adventOfCodeDayTen.getBinValue(0);
        int binOne = adventOfCodeDayTen.getBinValue(1);
        int binTwo = adventOfCodeDayTen.getBinValue(2);
        assertEquals(binZero, 5);
        assertEquals(binOne, 2);
        assertEquals(binTwo, 3);
    }

}