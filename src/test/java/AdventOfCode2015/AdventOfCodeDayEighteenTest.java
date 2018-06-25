package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEighteenTest {

    private AdventOfCodeDayEighteen adventOfCodeDayEighteen;

    @Before
    public void setup() {
        adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        String input =  ".#.#.#\n" +
                "...##.\n" +
                "#....#\n" +
                "..#...\n" +
                "#.#..#\n" +
                "####..";
        adventOfCodeDayEighteen.setup(input);
    }

    @Test
    public void inputResultsWithElevenLightsOnAfterOneStep() {
        int result = adventOfCodeDayEighteen.animate(1);
        assertEquals(11, result);
    }

    @Test
    public void inputResultsWithEightLightsOnAfterTwoSteps() {
        int result = adventOfCodeDayEighteen.animate(2);
        assertEquals(8, result);
    }

    @Test
    public void inputResultsWithFourLightsOnAfterThreeSteps() {
        int result = adventOfCodeDayEighteen.animate(3);
        assertEquals(4, result);
    }

    @Test
    public void inputResultsWithFourLightsOnAfterFourSteps() {
        int result = adventOfCodeDayEighteen.animate(4);
        assertEquals(4, result);
    }

    @Test
    public void inputResultWithSeventeenLightsOnPartTwo() {
        int result = adventOfCodeDayEighteen.animatePartTwo(5);
        assertEquals(17, result);
    }
}