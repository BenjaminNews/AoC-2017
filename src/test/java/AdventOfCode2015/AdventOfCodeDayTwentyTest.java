package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTwentyTest {

    @Test
    public void houseOneGetsTenPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(1);
        assertEquals(10, result);
    }

    @Test
    public void houseTwoGetsThirtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(2);
        assertEquals(30, result);
    }

    @Test
    public void houseThreeGetsFourtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(3);
        assertEquals(40, result);
    }

    @Test
    public void houseFourGetsSeventyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(4);
        assertEquals(70, result);
    }

    @Test
    public void houseFiveGetsSixtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(5);
        assertEquals(60, result);
    }

    @Test
    public void houseSixGetsOneHundredAndTwentyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(6);
        assertEquals(120, result);
    }

    @Test
    public void houseSevenGetsEightyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(7);
        assertEquals(80, result);
    }

    @Test
    public void houseEightGetsOneHundredAndFiftyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(8);
        assertEquals(150, result);
    }

    @Test
    public void houseNineGetsOneHundredAndThirtyPresents() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int result = adventOfCodeDayTwenty.getDeliveredPresents(9);
        assertEquals(130, result);
    }
}