package AdventOfCode2015;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayTwentyThreeTest {

    @Test
    public void inputReturnsValueOfTwoForA() {
        AdventOfCodeDayTwentyThree adventOfCodeDayTwentyThree  = new AdventOfCodeDayTwentyThree();
        adventOfCodeDayTwentyThree.setUp(0, 0);
        String input =  "inc a\n" +
                        "jio a, +2\n" +
                        "tpl a\n" +
                        "inc a";

        adventOfCodeDayTwentyThree.executeInstructions(input);
        int result = adventOfCodeDayTwentyThree.getRegisterValue("a");
        assertEquals(2, result);
    }

}