package AdcentOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    @Test
    public void afterFourtyMillionStepsSixHundredAndFiftyIsReturned() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(65, 16807, 8921, 48271, 40000000);

        adventOfCodeDayFifthteen.performSteps(adventOfCodeDayFifthteen.getSteps());
        int res = adventOfCodeDayFifthteen.getMatches();
        assertEquals(588, res);
    }
}