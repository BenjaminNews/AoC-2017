package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayFour;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayFourTest {

    @Test
    public void validStringOne() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "aa bb cc dd ee";

        int result = adventOfCodeDayFour.getInvalidCount(input);

        assertEquals(0, result);
    }

    @Test
    public void invalidStringOne() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "aa bb cc dd aa";

        int result = adventOfCodeDayFour.getInvalidCount(input);

        assertEquals(1, result);
    }

    @Test
    public void validStringTwo() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "aa bb cc dd aaa";

        int result = adventOfCodeDayFour.getInvalidCount(input);

        assertEquals(0, result);
    }

    @Test
    public void stringAnagramCheckIsValid() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "abcde fghij";

        int result = adventOfCodeDayFour.getInvalidCountWithAnagrams(input);

        assertEquals(0, result);
    }

    @Test
    public void stringAnagramCheckIsInvalid() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "abcde xyz ecdab";

        int result = adventOfCodeDayFour.getInvalidCountWithAnagrams(input);

        assertEquals(1, result);
    }

    @Test
    public void stringAnagramCheckIsValidTwo() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "a ab abc abd abf abj";

        int result = adventOfCodeDayFour.getInvalidCountWithAnagrams(input);

        assertEquals(0, result);
    }

    @Test
    public void stringAnagramCheckIsValidThree() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "iiii oiii ooii oooi oooo";

        int result = adventOfCodeDayFour.getInvalidCountWithAnagrams(input);

        assertEquals(0, result);
    }

    @Test
    public void stringAnagramCheckIsInvalidTwo() {
        AdventOfCodeDayFour adventOfCodeDayFour = new AdventOfCodeDayFour();

        String input = "oiii ioii iioi iiio";

        int result = adventOfCodeDayFour.getInvalidCountWithAnagrams(input);

        assertEquals(1, result);
    }
}