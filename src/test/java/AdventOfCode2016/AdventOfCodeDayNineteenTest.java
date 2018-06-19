package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayNineteenTest {

    @Test
    public void positionThreeGetsAllPresents() {
        AdventOfCodeDayNineteen adventOfCodeDayNineteen = new AdventOfCodeDayNineteen(5);
        int result = adventOfCodeDayNineteen.getElfWithAllPresents();
        assertEquals(3, result);
    }
}