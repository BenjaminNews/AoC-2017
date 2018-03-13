package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayTwelve;
import org.junit.Test;

public class AdventOfCodeDayTwelveTest {

    @Test
    public void programWithID0ConnectsToSixPrograms() {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        adventOfCodeDayTwelve.setUp();

        adventOfCodeDayTwelve.getConnectionsToZero();
    }

}