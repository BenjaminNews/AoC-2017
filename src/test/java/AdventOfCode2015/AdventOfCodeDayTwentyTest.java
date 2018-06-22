package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyTest {

    @Test
    public void houseOneGetsTenPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(10);
        assertEquals(1, result);
    }

    @Test
    public void houseTwoGetsThirtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(30);
        assertEquals(2, result);
    }

    @Test
    public void houseThreeGetsFourtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(40);
        assertEquals(3, result);
    }

    @Test
    public void houseFourGetsSeventyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(70);
        assertEquals(4, result);
    }

    @Test
    public void houseSixGetsOneHundredAndTwentyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(120);
        assertEquals(6, result);
    }

    @Test
    public void houseEightGetOneHundredAndFiftyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getLowestHouseNumberForPresents(150);
        assertEquals(8, result);
    }
}