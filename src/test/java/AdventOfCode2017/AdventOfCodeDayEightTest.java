package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayEight;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayEightTest {

    @Test
    public void largestValueInRegisterReturnsOnet() {
        AdventOfCodeDayEight adventOfCodeDayEight = new AdventOfCodeDayEight();

        ArrayList<String> instructions = new ArrayList<String>();
        instructions.add("b inc 5 if a > 1");
        instructions.add("a inc 1 if b < 5");
        instructions.add("c dec -10 if a >= 1");
        instructions.add("c inc -20 if c == 10");

        int res = adventOfCodeDayEight.getLargestValueInRegister(instructions);
        assertEquals(1, res);

    }
}