package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayThreeTest {

    private AdventOfCodeDayThree adventOfCodeDayThree;
    @Before
    public void setup() {
        adventOfCodeDayThree = new AdventOfCodeDayThree();
    }

    @Test
    public void inputOneDeliversToTwoHouses() {
        String input = ">";
        int result = adventOfCodeDayThree.deliverPresents(input);
        assertEquals(2, result);
    }

    @Test
    public void inputTwoDeliversToTwoHouses() {
        String input = "^>v<";
        int result = adventOfCodeDayThree.deliverPresents(input);
        assertEquals(4, result);
    }

    @Test
    public void inputThreeDeliversToTwoHouses() {
        String input = "^v^v^v^v^v";
        int result = adventOfCodeDayThree.deliverPresents(input);
        assertEquals(2, result);
    }

    @Test
    public void inputOneDeliversToTwoHousesParttwo() {
        String input = "^v";
        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);
        assertEquals(3, result);
    }

    @Test
    public void inputTwoDeliversToTwoHousesPartTwo() {
        String input = "^>v<";
        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);
        assertEquals(3, result);
    }

    @Test
    public void inputThreeDeliversToTwoHousesPartTwo() {
        String input = "^v^v^v^v^v";
        int result = adventOfCodeDayThree.deliverPresentsPartTwo(input);
        assertEquals(11, result);
    }
}