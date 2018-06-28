package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDaySixteenTest {

    @Test
    public void spinABCDEOfSizeOneReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s1");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("eabcd", result);
    }

    @Test
    public void spinABCDEOfSizeTwoReturnsDEABC() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s2");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("deabc", result);
    }

    @Test
    public void spinABCDEOfSizeThreeReturnsCDEAB() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s3");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("cdeab", result);
    }

    @Test
    public void spinABCDEOfSizeFourReturnsBCDEA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s4");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("bcdea", result);
    }

    @Test
    public void spinABCDEOfSizeFiveReturnsABCDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s5");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("abcde", result);
    }

    @Test
    public void swapFirsttwoCharactersOfABCDEreturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "x0/1");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("bacde", result);
    }

    @Test
    public void swapFirstAndThirdCharactersOfABCDEreturnsCBADE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "x0/2");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("cbade", result);
    }

    @Test
    public void swapThirdAndFourthCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "x2/3");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("abdce", result);
    }

    @Test
    public void swapThirdAndSecondCharactersOfABCDEreturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "x3/2");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("abdce", result);
    }

    @Test
    public void swapFifthAndFirstCharactersOfABCDEreturnsEBCDA() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "x4/0");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("ebcda", result);
    }

    @Test
    public void swapProgramsAandBReturnsBACDE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "pa/b");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("bacde", result);
    }

    @Test
    public void swapProgramsEandDReturnsABCED() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "pe/d");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("abced", result);
    }

    @Test
    public void swapProgramsCandDReturnsABDCE() {
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "pc/d");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("abdce", result);
    }

    @Test
    public void allActionsReturnBAEDC(){
        AdventOfCodeDaySixteen adventOfCodeDaySixteen = new AdventOfCodeDaySixteen();
        adventOfCodeDaySixteen.setUp("abcde", "s1,x3/4,pe/b");
        String result = adventOfCodeDaySixteen.execute();
        assertEquals("baedc", result);
    }
}