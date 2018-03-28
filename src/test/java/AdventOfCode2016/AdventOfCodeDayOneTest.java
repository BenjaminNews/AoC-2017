package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayOneTest {

    @Test
    public void R2L3leavesFiveBlocksFromStart() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "R2, L3";

        adventOfCodeDayOne.setup(input);

        int result = adventOfCodeDayOne.getDistanceFromEndPoint();
        assertEquals(5, result);
    }

    @Test
    public void R2R2R2leavesTwoBlocksFromStart() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "R2, R2, R2";

        adventOfCodeDayOne.setup(input);

        int result = adventOfCodeDayOne.getDistanceFromEndPoint();
        assertEquals(2, result);
    }

    @Test
    public void R5L5R5R3leavesTwelveBlocksFromStart() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "R5, L5, R5, R3";

        adventOfCodeDayOne.setup(input);

        int result = adventOfCodeDayOne.getDistanceFromEndPoint();
        assertEquals(12, result);
    }

    @Test
    public void firstLocationVisitedTwiceIsFourBlocksAway() {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();

        String input = "R8, R4, R4, R8";

        adventOfCodeDayOne.setup(input);

        int result = adventOfCodeDayOne.getDistanceFromAlreadyVisitedPosition();
        assertEquals(4, result);
    }
}