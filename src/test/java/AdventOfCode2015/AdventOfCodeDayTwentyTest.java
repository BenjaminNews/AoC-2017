package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyTest {

    private AdventOfCodeDayTwenty adventOfCodeDayTwenty;

    @Before
    public void setup() {
        adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
    }

    @Test
    public void houseOneGetsTenPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(10);
        assertEquals(1, result);
    }

    @Test
    public void houseTwoGetsThirtyPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(30);
        assertEquals(2, result);
    }

    @Test
    public void houseThreeGetsFourtyPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(40);
        assertEquals(3, result);
    }

    @Test
    public void houseFourGetsSeventyPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(70);
        assertEquals(4, result);
    }

    @Test
    public void houseSixGetsOneHundredAndTwentyPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(120);
        assertEquals(6, result);
    }

    @Test
    public void houseEightGetOneHundredAndFiftyPresents() {
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(150);
        assertEquals(8, result);
    }
}