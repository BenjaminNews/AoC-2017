package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayNineTest {

    private AdventOfCodeDayNine adventOfCodeDayNine;

    @Before
    public void setup() {
        adventOfCodeDayNine = new AdventOfCodeDayNine();
    }

    @Test
    public void shortestRouteIs605() {
        String input = "London to Dublin = 464\n" +
                       "London to Belfast = 518\n" +
                       "Dublin to Belfast = 141";
        adventOfCodeDayNine.setUp(input);
        int result = adventOfCodeDayNine.getShortestRoute();
        assertEquals(605, result);
    }

    @Test
    public void longestRouteIs982() {
        String input = "London to Dublin = 464\n" +
                       "London to Belfast = 518\n" +
                       "Dublin to Belfast = 141";
        adventOfCodeDayNine.setUp(input);
        int result = adventOfCodeDayNine.getLongestRoute();
        assertEquals(982, result);
    }
}