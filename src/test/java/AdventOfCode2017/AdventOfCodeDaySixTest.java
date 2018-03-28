package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDaySix;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDaySixTest {

    @Test
    public void oneStepProduces2412() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        adventOfCodeDaySix.step();

        String stringResult = adventOfCodeDaySix.getStringRepresentation();

        assertEquals("2 4 1 2", stringResult);
    }

    @Test
    public void twoStepsProduces3123() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();

        String stringResult = adventOfCodeDaySix.getStringRepresentation();

        assertEquals("3 1 2 3", stringResult);
    }

    @Test
    public void threeStepsProduces0234() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();

        String stringResult = adventOfCodeDaySix.getStringRepresentation();

        assertEquals("0 2 3 4", stringResult);
    }

    @Test
    public void fourStepsProduces1341() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();
        adventOfCodeDaySix.step();

        String stringResult = adventOfCodeDaySix.getStringRepresentation();

        assertEquals("1 3 4 1", stringResult);
    }

    @Test
    public void fiveStepsProducesInifinteLoop() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        int result = adventOfCodeDaySix.findLoop();

        String stringResult = adventOfCodeDaySix.getStringRepresentation();

        assertEquals("2 4 1 2", stringResult);
        assertEquals(5, result);
    }

    @Test
    public void intermediantLoopInFourSteps() {
        String input = "0, 2, 7, 0";

        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(input);

        adventOfCodeDaySix.findLoop();

        int result = adventOfCodeDaySix.getNestedLoopSize();

        assertEquals(4, result);
    }
}