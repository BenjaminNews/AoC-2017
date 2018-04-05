package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFiveTest {

    @Test
    public void inputOneReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "ugknbfddgicrmopn";

        int result = adventOfCodeDayFive.getNiceCount(input);

        assertEquals(1, result);
    }

    @Test
    public void inputTwoReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "aaa";

        int result = adventOfCodeDayFive.getNiceCount(input);

        assertEquals(1, result);
    }

    @Test
    public void inputThreeReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "jchzalrnumimnmhp";

        int result = adventOfCodeDayFive.getNiceCount(input);

        assertEquals(0, result);
    }

    @Test
    public void inputFourReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "haegwjzuvuyypxyu";

        int result = adventOfCodeDayFive.getNiceCount(input);

        assertEquals(0, result);
    }

    @Test
    public void inputFiveReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "dvszwmarrgswjxmb";

        int result = adventOfCodeDayFive.getNiceCount(input);

        assertEquals(0, result);
    }

    @Test
    public void inputOneReturnsNicePartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "qjhvhtzxzqqjkmpb";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(1, result);
    }

    @Test
    public void inputTwoReturnsNaughtyPartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "uurcxstgmygtbstg";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(0, result);
    }

    @Test
    public void inputThreeReturnsNaughtyPartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "ieodomkazucvgmuy";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(0, result);
    }

    @Test
    public void inputFourReturnsNicePartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "xxyxx";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(1, result);
    }

    @Test
    public void inputFiveReturnsNicePartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "xlyxlvhv";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(1, result);
    }

    @Test
    public void inputSixReturnsNicePartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "abaxtaxt";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(1, result);
    }

    @Test
    public void inputEightReturnsNaughtyPartTwo() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();

        String input = "aaa";

        int result = adventOfCodeDayFive.getNiceCountPartTwo(input);

        assertEquals(0, result);
    }
}