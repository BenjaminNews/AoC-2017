package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayTwoTest {

    @Test
    public void ULLRRDDDLURDLUUUUDreturnsOneNineEightFive() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "ULL\n" +
                       "RRDDD\n" +
                       "LURDL\n" +
                       "UUUUD";

        adventOfCodeDayTwo.setup(input);

        String result = adventOfCodeDayTwo.getPasscode();
        assertEquals("1985", result);
    }

    @Test
    public void ULLRRDDDLURDLUUUUDreturnsFiveDBThree() {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();

        String input = "ULL\n" +
                "RRDDD\n" +
                "LURDL\n" +
                "UUUUD";

        adventOfCodeDayTwo.setup(input);

        String result = adventOfCodeDayTwo.getPassCodeTwo();
        assertEquals("5DB3", result);
    }
}