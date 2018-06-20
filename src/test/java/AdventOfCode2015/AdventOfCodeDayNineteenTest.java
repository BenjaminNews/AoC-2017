package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayNineteenTest {

    @Test
    public void inputReturnsTotalOfFourDistinctMolecules() {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen();
        String startValue = "HOH";
        String input =  "H => HO\n" +
                        "H => OH\n" +
                        "O => HH";
        adventOfCodeDayNineteen.setUp(input, startValue);
        int result = adventOfCodeDayNineteen.getUniqueMolecules();
        assertEquals(result, 4);
    }
}