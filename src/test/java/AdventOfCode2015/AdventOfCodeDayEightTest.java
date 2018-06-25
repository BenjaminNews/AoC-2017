package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEightTest {

    private AdventOfCodeDayEight adventOfCodeDayEight;

    @Before
    public void setup() {
         adventOfCodeDayEight = new AdventOfCodeDayEight();
    }

    @Test
    public void inputDataReturnsScoreOfTwo() throws IOException {
        int result = adventOfCodeDayEight.getStringLength("DayEightTestOneInputData.txt");
        assertEquals(2, result);
    }

    @Test
    public void inputDataReturnsScoreOfThree() throws IOException {
        int result = adventOfCodeDayEight.getStringLength("DayEightTestTwoInputData.txt");
        assertEquals(2, result);
    }

    @Test
    public void inputdataReturnsScoreOfThree() throws IOException {
        int result = adventOfCodeDayEight.getStringLength("DayEightTestThreeInputData.txt");
        assertEquals(3, result);
    }

    @Test
    public void inputDataReturnsScoreOfFive() throws IOException {
        int result = adventOfCodeDayEight.getStringLength("DayEightTestFourInputData.txt");
        assertEquals(5, result);
    }

    @Test
    public void inputDataReturnsScoreOfTwelve() throws IOException {
        int result = adventOfCodeDayEight.getStringLength("DayEightTestFiveInputData.txt");
        assertEquals(12, result);
    }
}