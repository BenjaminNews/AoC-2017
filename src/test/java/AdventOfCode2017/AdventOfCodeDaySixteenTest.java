package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDaySixteen;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDaySixteenTest {

    @Test
    public void spinABCDEOfSizeOneReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s1";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("eabcd", result);
    }

    @Test
    public void spinABCDEOfSizeTwoReturnsDEABC() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s2";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("deabc", result);
    }

    @Test
    public void spinABCDEOfSizeThreeReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s3";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("cdeab", result);
    }

    @Test
    public void spinABCDEOfSizeFourReturnsBCDEA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s4";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("bcdea", result);
    }

    @Test
    public void spinABCDEOfSizeFiveReturnsABCDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s5";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("abcde", result);
    }

    @Test
    public void swapFirsttwoCharactersOfABCDEreturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x0/1";

        adventOfCodeDaySixteen.swapLocations(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("bacde", result);
    }

    @Test
    public void swapFirstAndThirdCharactersOfABCDEreturnsCBADE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x0/2";

        adventOfCodeDaySixteen.swapLocations(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("cbade", result);
    }

    @Test
    public void swapThirdAndFourthCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x2/3";

        adventOfCodeDaySixteen.swapLocations(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("abdce", result);
    }

    @Test
    public void swapFourthAndThirdCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x3/2";

        adventOfCodeDaySixteen.swapLocations(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("abdce", result);
    }

    @Test
    public void swapFifthAndFirstCharactersOfABCDEreturnsEBCDA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x4/0";

        adventOfCodeDaySixteen.swapLocations(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("ebcda", result);
    }

    @Test
    public void swapProgramsAandBReturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "pa/b";

        adventOfCodeDaySixteen.swapPrograms(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("bacde", result);
    }

    @Test
    public void swapProgramsEandDReturnsABCED() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "pe/d";

        adventOfCodeDaySixteen.swapPrograms(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("abced", result);
    }

    @Test
    public void swapProgramsCandDReturnsABCED() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.swapPrograms("abcde");

        String command = "pc/d";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getListAsString();
        assertEquals("abced", result);
    }
}