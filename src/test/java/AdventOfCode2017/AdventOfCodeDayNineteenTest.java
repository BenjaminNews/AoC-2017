package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayNineteenTest {

    @Test
    public void locationsABCDEFareVisitedInMap() {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen();

        String map = "     |          \n" +
                     "     |  +--+    \n" +
                     "     A  |  C    \n" +
                     " F---|----E|--+ \n" +
                     "     |  |  |  D \n" +
                     "     +B-+  +--+ \n";

        adventOfCodeDayNineteen.setup(map);
        adventOfCodeDayNineteen.traverseMap();

        String result = adventOfCodeDayNineteen.getVisitedLocations();

        assertEquals("ABCDEF", result);
    }

    @Test
    public void thirtyEightStepsArePerformed() {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen();

        String map = "     |          \n" +
                     "     |  +--+    \n" +
                     "     A  |  C    \n" +
                     " F---|----E|--+ \n" +
                     "     |  |  |  D \n" +
                     "     +B-+  +--+ \n";

        adventOfCodeDayNineteen.setup(map);
        adventOfCodeDayNineteen.traverseMap();
        String result = adventOfCodeDayNineteen.getVisitedLocations();
        assertEquals("ABCDEF", result);
        assertEquals(38, adventOfCodeDayNineteen.visitedLocations.length());

    }
}