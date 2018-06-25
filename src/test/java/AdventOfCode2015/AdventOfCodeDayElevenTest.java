package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayElevenTest {

    private AdventOfCodeDayEleven adventOfCodeDayEleven;

    @Before
    public void setup() {
        adventOfCodeDayEleven = new AdventOfCodeDayEleven();
    }

    @Test
    public void inputABCDEFGHReturnsFirstPasswordOfABCDFFAA() {
        String result = adventOfCodeDayEleven.getPassword("abcdefgh");
        assertEquals("abcdffaa", result);
    }
    @Test
    public void inputGHIJKLMNReturnsFirstPasswordOfGHJABCC() {
        String result = adventOfCodeDayEleven.getPassword("ghijklmn");
        assertEquals("ghjaabcc", result);
    }
}