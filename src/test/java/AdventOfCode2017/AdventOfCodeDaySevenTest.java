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

        adventOfCodeDaySeven.createDisks(input);
        String result = adventOfCodeDaySeven.getBaseTower();
        assertEquals(result, "tknk");
    }

    @Test
    public void fwtwTotalWeightEquals243() {
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

        adventOfCodeDaySeven.createDisks(input);
        int result = adventOfCodeDaySeven.getTowerWeight("fwft");
        assertEquals(result, 243);
    }

    @Test
    public void padxTotalWeightEquals243() {
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

        adventOfCodeDaySeven.createDisks(input);
        int result = adventOfCodeDaySeven.getTowerWeight("padx");
        assertEquals(result, 243);
    }

    @Test
    public void ugmlTotalWeightEquals251() {
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

        adventOfCodeDaySeven.createDisks(input);
        int result = adventOfCodeDaySeven.getTowerWeight("ugml");
        assertEquals(result, 251);
    }

    @Test
    public void outOfBalanceStackIsUgml() {
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

        adventOfCodeDaySeven.createDisks(input);
        int result = adventOfCodeDaySeven.getOutOfBalanceStack();
        assertEquals(243, result);
    }
}