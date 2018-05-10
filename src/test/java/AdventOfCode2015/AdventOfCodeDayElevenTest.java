package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayElevenTest {

    @Test
    public void inputABCDEFGHReturnsFirstPasswordOfABCDFFAA() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
        String input = "abcdefgh";
        String result = adventOfCodeDayEleven.getPassword(input);
        assertEquals("abcdffaa", result);
    }
    @Test
    public void inputGHIJKLMNReturnsFirstPasswordOfGHJABCC() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
        String input = "ghijklmn";
        String result = adventOfCodeDayEleven.getPassword(input);
        assertEquals("ghjaabcc", result);
    }

}