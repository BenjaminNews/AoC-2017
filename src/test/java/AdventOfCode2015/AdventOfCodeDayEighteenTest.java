package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEighteenTest {

    @Test
    public void inputResultsWithElevenLightsOnAfterOneStep() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input =  ".#.#.#\n" +
                        "...##.\n" +
                        "#....#\n" +
                        "..#...\n" +
                        "#.#..#\n" +
                        "####..";
        adventOfCodeDayEighteen.setup(input);
        int result = adventOfCodeDayEighteen.animate(1);
        assertEquals(11, result);
    }

    @Test
    public void inputResultsWithEightLightsOnAfterTwoSteps() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input =  ".#.#.#\n" +
                        "...##.\n" +
                        "#....#\n" +
                        "..#...\n" +
                        "#.#..#\n" +
                        "####..";
        adventOfCodeDayEighteen.setup(input);
        int result = adventOfCodeDayEighteen.animate(2);
        assertEquals(8, result);
    }

    @Test
    public void inputResultsWithFourLightsOnAfterThreeSteps() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input =  ".#.#.#\n" +
                        "...##.\n" +
                        "#....#\n" +
                        "..#...\n" +
                        "#.#..#\n" +
                        "####..";
        adventOfCodeDayEighteen.setup(input);
        int result = adventOfCodeDayEighteen.animate(3);
        assertEquals(4, result);
    }

    @Test
    public void inputResultsWithFourLightsOnAfterFourSteps() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input =  ".#.#.#\n" +
                        "...##.\n" +
                        "#....#\n" +
                        "..#...\n" +
                        "#.#..#\n" +
                        "####..";
        adventOfCodeDayEighteen.setup(input);
        int result = adventOfCodeDayEighteen.animate(4);
        assertEquals(4, result);
    }

    @Test
    public void inputResultWithSeventeenLightsOnPartTwo() {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();

        String input =  "##.#.#\n" +
                        "...##.\n" +
                        "#....#\n" +
                        "..#...\n" +
                        "#.#..#\n" +
                        "####.#";
        adventOfCodeDayEighteen.setup(input);
        int result = adventOfCodeDayEighteen.animatePartTwo(5);
        adventOfCodeDayEighteen.printGrid();
        assertEquals(17, result);
    }
}