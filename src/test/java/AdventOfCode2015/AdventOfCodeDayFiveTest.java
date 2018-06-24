package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFiveTest {

    private AdventOfCodeDayFive adventOfCodeDayFive;

    @Before
    public void setup() {
        adventOfCodeDayFive = new AdventOfCodeDayFive();
    }

    @Test
    public void inputOneReturnsNice() {
        String input = "ugknbfddgicrmopn";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(1, result);
    }

    @Test
    public void inputTwoReturnsNice() {
        String input = "aaa";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(1, result);
    }

    @Test
    public void inputThreeReturnsNaughty() {
        String input = "jchzalrnumimnmhp";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputFourReturnsNaughty() {
        String input = "haegwjzuvuyypxyu";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputFiveReturnsNaughty() {
        String input = "dvszwmarrgswjxmb";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStrings();
        assertEquals(0, result);
    }

    @Test
    public void inputSixReturnsNice() {
        String input = "qjhvhtzxzqqjkmpb";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(1, result);
    }

    @Test
    public void inputSevenReturnsNice() {
        String input = "xxyxx";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(1, result);
    }

    @Test
    public void inputEightReturnsNaughty() {
        String input = "uurcxstgmygtbstg";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(0, result);
    }

    @Test
    public void inputNineReturnsNaughty() {
        String input = "ieodomkazucvgmuy";
        adventOfCodeDayFive.setUp(input);
        int result = adventOfCodeDayFive.getTotalHappyStringsPartTwo();
        assertEquals(0, result);
    }
}