package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayEighteenTest {

    @Test
    public void inputReturnsFour() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input = "set a 1\n" +
                "add a 2\n" +
                "mul a a\n" +
                "mod a 5\n" +
                "snd a\n" +
                "set a 0\n" +
                "rcv a\n" +
                "jgz a -1\n" +
                "set a 1\n" +
                "jgz a -2 ";

        adventOfCodeDayEighteen.setUp();

        adventOfCodeDayEighteen.performActions(input);
        int result = adventOfCodeDayEighteen.getRecovery();
        assertEquals(4, result);
    }


}