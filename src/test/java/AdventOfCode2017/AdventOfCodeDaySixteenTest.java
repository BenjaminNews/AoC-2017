package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDaySixteenTest {

    @Test
    public void spinABCDEOfSizeOneReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s1";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getValues();

        assertEquals("eabcd", result);
    }

    @Test
    public void spinABCDEOfSizeTwoReturnsDEABC() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s2";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getValues();

        assertEquals("deabc", result);
    }

    @Test
    public void spinABCDEOfSizeThreeReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s3";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getValues();

        assertEquals("cdeab", result);
    }

    @Test
    public void spinABCDEOfSizeFourReturnsBCDEA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s4";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getValues();

        assertEquals("bcdea", result);
    }

    @Test
    public void spinABCDEOfSizeFiveReturnsABCDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s5";

        adventOfCodeDaySixteen.spin(command);

        String result = adventOfCodeDaySixteen.getValues();

        assertEquals("abcde", result);
    }

    @Test
    public void swapFirsttwoCharactersOfABCDEreturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x0/1";

        adventOfCodeDaySixteen.swap(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("bacde", result);
    }

    @Test
    public void swapFirstAndThirdCharactersOfABCDEreturnsCBADE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x0/2";

        adventOfCodeDaySixteen.swap(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("cbade", result);
    }

    @Test
    public void swapThirdAndFourthCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x2/3";

        adventOfCodeDaySixteen.swap(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("abdce", result);
    }

    @Test
    public void swapFourthAndThirdCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x3/2";

        adventOfCodeDaySixteen.swap(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("abdce", result);
    }

    @Test
    public void swapFifthAndFirstCharactersOfABCDEreturnsEBCDA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "x4/0";

        adventOfCodeDaySixteen.swap(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("ebcda", result);
    }

    @Test
    public void swapProgramsAandBReturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "pa/b";

        adventOfCodeDaySixteen.swapPrograms(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("bacde", result);
    }

    @Test
    public void swapProgramsEandDReturnsABCED() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "pe/d";

        adventOfCodeDaySixteen.swapPrograms(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("abced", result);
    }

    @Test
    public void swapProgramsCandDReturnsABCED() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "pc/d";

        adventOfCodeDaySixteen.swapPrograms(command);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("abdce", result);
    }

    @Test
    public void allActionsReturnBAEDC(){
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s1\n" +
                         "x3/4\n" +
                         "pe/b";

        adventOfCodeDaySixteen.move(command.split("\n"),1);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("baedc", result);
    }

    @Test
    public void allActionsReturnCEADBafterTwoRotations(){
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();

        adventOfCodeDaySixteen.setUp("abcde");

        String command = "s1\n" +
                "x3/4\n" +
                "pe/b";

        adventOfCodeDaySixteen.move(command.split("\n"),2);

        String result = adventOfCodeDaySixteen.getValues();
        assertEquals("ceadb", result);
    }
}