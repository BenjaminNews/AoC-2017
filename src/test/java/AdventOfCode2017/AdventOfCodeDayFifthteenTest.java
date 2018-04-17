package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFifthteenTest {

    @Test
    public void inputReturnsOneMatch() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(65, 16807, 8921, 48271, 5);

        adventOfCodeDayFifthteen.performStepsPartOne();
        assertEquals(1, adventOfCodeDayFifthteen.getMatches());
    }

    @Test
    public void inputReturnsFiveHundredAndEightyEightMatches() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(65, 16807, 8921, 48271, 40000000);

        adventOfCodeDayFifthteen.performStepsPartOne();
        assertEquals(588, adventOfCodeDayFifthteen.getMatches());
    }

    @Test
    public void inputReturnsOneMatchPartTwo() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(65, 16807, 8921, 48271, 1086);

        adventOfCodeDayFifthteen.performStepsPartTwo();
        assertEquals(1, adventOfCodeDayFifthteen.getMatches());
    }

    @Test
    public void inputReturnsThreeHundredAndNinePairs() {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(65, 16807, 8921, 48271, 5000000);

        adventOfCodeDayFifthteen.performStepsPartTwo();
        int result = adventOfCodeDayFifthteen.getMatches();
        assertEquals(309, result);
    }
}