package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayOneTest {

    //part one
    @Test
    public void inputProducesSumOfThree() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1122");

        assertEquals(3, res);
    }

    @Test
    public void inputProducesSumOfFour() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1111");

        assertEquals(4, res);
    }

    @Test
    public void inputProducesZero() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("1234");

        assertEquals(0, res);
    }

    @Test
    public void inputProducesSumOfNine() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partOne("91212129");

        assertEquals(9, res);
    }

    //part two
    @Test
    public void inputProducesSumOfSix() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partTwo("1212");

        assertEquals(6, res);
    }

    @Test
    public void inputProducesZeroPartTwo() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partTwo("1221");

        assertEquals(0, res);
    }

    @Test
    public void inputProducesSumOfFourPartTwo() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partTwo("123425");

        assertEquals(4, res);
    }

    @Test
    public void inputProducesSumOfTwelve() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partTwo("123123");

        assertEquals(12, res);
    }

    @Test
    public void inputProducesSumOfFourPartTwoSecondInput() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        int res = adventOfCodeDayOne.partTwo("12131415");

        assertEquals(4, res);
    }
}
