package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayOne;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdventOfCodeDayOneTest {

//    1122 produces a sum of 3 (1 + 2) because the first digit (1) matches the second digit and the third digit (2) matches the fourth digit.
//    1111 produces 4 because each digit (all 1) matches the next.
//    1234 produces 0 because no digit matches the next.
//    91212129 produces 9 because the only digit that matches the next one is the last digit, 9.

    @Test
    public void testOne() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1122");

        assertEquals(3, res);
    }

    @Test
    public void testTwo() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1111");

        assertEquals(4, res);
    }

    @Test
    public void testThree() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1234");

        assertEquals(0, res);
    }

    @Test
    public void testFour() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("91212129");

        assertEquals(9, res);
    }
}
