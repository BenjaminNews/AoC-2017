package AdcentOfCode2017;

import org.junit.Test;

public class AdventOfCodeDayTwelveTest {

    @Test
    public void programWithID0ConnectsToSixPrograms() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        adventOfCodeDayTwelve.setUp();

        adventOfCodeDayTwelve.getConnectionsToZero();
    }

}