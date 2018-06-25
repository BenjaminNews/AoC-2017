package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayTwentyThreeTest {

    private AdventOfCodeDayTwentyThree adventOfCodeDayTwentyThree;

    @Before
    public void setup() {
        adventOfCodeDayTwentyThree  = new AdventOfCodeDayTwentyThree();
        adventOfCodeDayTwentyThree.setUp(0, 0);

    }

    @Test
    public void inputReturnsValueOfTwoForA() {
        String input =  "inc a\n" +
                "jio a, +2\n" +
                "tpl a\n" +
                "inc a";
        adventOfCodeDayTwentyThree.executeInstructions(input);
        int result = adventOfCodeDayTwentyThree.getRegisterValue("a");
        assertEquals(2, result);
    }
}