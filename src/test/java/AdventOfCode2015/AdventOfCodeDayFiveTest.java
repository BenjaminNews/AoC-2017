package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFiveTest {

    @Test
    public void inputOneReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "ugknbfddgicrmopn";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(1, result);
    }

    @Test
    public void inputTwoReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "aaa";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(1, result);
    }

    @Test
    public void inputThreeReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "jchzalrnumimnmhp";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputFourReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "haegwjzuvuyypxyu";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputFiveReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "dvszwmarrgswjxmb";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputSixReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "qjhvhtzxzqqjkmpb";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(1, result);
    }

    @Test
    public void inputSevenReturnsNice() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "xxyxx";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(1, result);
    }

    @Test
    public void inputEightReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "uurcxstgmygtbstg";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(0, result);
    }

    @Test
    public void inputNineReturnsNaughty() {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "ieodomkazucvgmuy";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(0, result);
    }
}