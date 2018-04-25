package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayTwelveTest {

    @Test
    public void programWithID0ConnectsToSixPrograms() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "0 <-> 2\n" +
                       "1 <-> 1\n" +
                       "2 <-> 0, 3, 4\n" +
                       "3 <-> 2, 4\n" +
                       "4 <-> 2, 3, 6\n" +
                       "5 <-> 6\n" +
                       "6 <-> 4, 5";

        adventOfCodeDayTwelve.setUp(input);

        int result = adventOfCodeDayTwelve.getConnections(0);

        assertEquals(6, result);
    }

    @Test
    public void programListContainTwoGroups() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        String input = "0 <-> 2\n" +
                "1 <-> 1\n" +
                "2 <-> 0, 3, 4\n" +
                "3 <-> 2, 4\n" +
                "4 <-> 2, 3, 6\n" +
                "5 <-> 6\n" +
                "6 <-> 4, 5";

        adventOfCodeDayTwelve.setUp(input);

        int result = adventOfCodeDayTwelve.getConnectionsTwo();

        assertEquals(2, result);
    }
}