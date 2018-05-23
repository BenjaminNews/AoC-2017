package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayNineTest {

    @Test
    public void shortestRouteIs605() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "London to Dublin = 464\n" +
                       "London to Belfast = 518\n" +
                       "Dublin to Belfast = 141";
        adventOfCodeDayNine.setUp(input);
        int result = adventOfCodeDayNine.getShortestRoute();
        assertEquals(605, result);
    }

    @Test
    public void longestRouteIs982() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();
        String input = "London to Dublin = 464\n" +
                       "London to Belfast = 518\n" +
                       "Dublin to Belfast = 141";
        adventOfCodeDayNine.setUp(input);
        int result = adventOfCodeDayNine.getLongestRoute();
        assertEquals(982, result);
    }
}