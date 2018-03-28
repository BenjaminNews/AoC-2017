package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayTwentyTest {

    @Test
    public void particleZeroIsCloserToZeroBeforeMoving() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(0);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleOneStaysCloserToZeroAfterFirstMove() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                       "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(1);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(1, result);
    }

    @Test
    public void particleOneStaysCloserToZeroAfterSecondMove() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(2);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(1, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterThirdMove() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(3);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterOneHundredMoves() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(100);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterOneThousand() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(1000);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterTenThousandMoves() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(10000);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterOneHundredThousandMoves() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(100000);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particleZeroStaysCloserToZeroAfterOneMillionMoves() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=< 3,0,0>, v=< 2,0,0>, a=<-1,0,0>\n" +
                "p=< 4,0,0>, v=< 0,0,0>, a=<-2,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.move(1000000);

        int result = adventOfCodeDayTwenty.getParticleClosestToZero();

        assertEquals(0, result);
    }

    @Test
    public void particlesZeroOneAndTwoCollideAndAreDestroyedAndParticleThreeIsLeft() {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();

        String input = "p=<-6,0,0>, v=< 3,0,0>, a=< 0,0,0>    \n" +
                       "p=<-4,0,0>, v=< 2,0,0>, a=< 0,0,0>    -6 -5 -4 -3 -2 -1  0  1  2  3\n" +
                       "p=<-2,0,0>, v=< 1,0,0>, a=< 0,0,0>    (0)   (1)   (2)            (3)\n" +
                       "p=< 3,0,0>, v=<-1,0,0>, a=< 0,0,0>";

        adventOfCodeDayTwenty.setUp(input);

        adventOfCodeDayTwenty.movePartTwo(10);

        int result = adventOfCodeDayTwenty.getNumberOfRemainingParticles();

        assertEquals(1, result);
    }
}