package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayEighteen;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayEighteenTest {

    //----------------input data--------------//
    /**
     * set a 1
     * add a 2
     * mul a a
     * mod a 5
     * snd a
     * set a 0
     * rcv a
     * jgz a -1
     * set a 1
     * jgz a -2
     **/

    @Test

    public void aboveDataReturnsFour() {
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

        int result = adventOfCodeDayEighteen.getRecovery(input);

        assertEquals(4, result);
    }


}