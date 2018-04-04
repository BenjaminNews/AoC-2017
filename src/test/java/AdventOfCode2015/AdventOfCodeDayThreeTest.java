package AdventOfCode2015;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayThreeTest {

    @Test
    public void inputOneDeliversToTwoHouses() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = ">";

        int result = adventOfCodeDayThree.deliverPresents(input);

        assertEquals(2, result);
    }

    @Test
    public void inputTwoDeliversToTwoHouses() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "^>v<";

        int result = adventOfCodeDayThree.deliverPresents(input);

        assertEquals(4, result);
    }

    @Test
    public void inputThreeDeliversToTwoHouses() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "^v^v^v^v^v";

        int result = adventOfCodeDayThree.deliverPresents(input);

        assertEquals(2, result);
    }

    @Test
    public void inputOneDeliversToTwoHousesParttwo() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "^v";

        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);

        assertEquals(3, result);
    }

    @Test
    public void inputTwoDeliversToTwoHousesPartTwo() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "^>v<";

        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);

        assertEquals(3, result);
    }

    @Test
    public void inputThreeDeliversToTwoHousesPartTwo() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "^v^v^v^v^v";

        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);

        assertEquals(11, result);
    }

}