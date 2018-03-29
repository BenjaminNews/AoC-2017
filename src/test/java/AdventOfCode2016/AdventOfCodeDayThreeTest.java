package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayThreeTest {

    @Test
    public void noValidTriangles() {
        AdventOfCodeDayThree adventOfCodeDayThree = new AdventOfCodeDayThree();

        String input = "5 10 15";

        adventOfCodeDayThree.setup(input);
        int result = adventOfCodeDayThree.getNumberOfValidTriangles();
        assertEquals(0, result);
    }
}