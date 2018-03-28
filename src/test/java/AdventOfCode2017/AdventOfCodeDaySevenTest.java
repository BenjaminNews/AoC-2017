package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDaySeven;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDaySevenTest {

    @Test
    public void tknkIsHoldingUpTower() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "pbga (66)\n" +
                       "xhth (57)\n" +
                       "ebii (61)\n" +
                       "havc (66)\n" +
                       "ktlj (57)\n" +
                       "fwft (72) -> ktlj, cntj, xhth\n" +
                       "qoyq (66)\n" +
                       "padx (45) -> pbga, havc, qoyq\n" +
                       "tknk (41) -> ugml, padx, fwft\n" +
                       "jptl (61)\n" +
                       "ugml (68) -> gyxo, ebii, jptl\n" +
                       "gyxo (61)\n" +
                       "cntj (57)";

        adventOfCodeDaySeven.setUp(input);
        String result = adventOfCodeDaySeven.getBaseTower();
        assertEquals("tknk", result);
    }
}