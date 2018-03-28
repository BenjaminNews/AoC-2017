package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayTwentyTwoTest {

    @Test
    public void oneStepInfectsThreeElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(1);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(3, result);
    }

    @Test
    public void twoStepsInfectsTwoElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(2);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(2, result);
    }

    @Test
    public void threeStepsInfectsThreeElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(3);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(3, result);
    }

    @Test
    public void fourStepsInfectsFourElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(4);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(4, result);
    }

    @Test
    public void fiveStepsInfectsFiveElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(5);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(5, result);
    }

    @Test
    public void sixStepsInfectsSixElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(6);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(6, result);
    }

    @Test
    public void sevenStepsInfectsFiveElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(7);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(5, result);
    }

    @Test
    public void seventyStepsInfectsFourteenElements() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 8, 9);

        adventOfCodeDayTwentyTwo.step(70);

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(14, result);
    }

//    @Test
//    public void tenThousandStepsInfectsFiveThousandFiveHundredAndEightySeven() {
//        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();
//
//        String input = "..#\n" +
//                       "#..\n" +
//                       "...";
//
//        adventOfCodeDayTwentyTwo.setUp(input, 20000, 20000);
//
//        adventOfCodeDayTwentyTwo.step(10000);
//
//        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
//        assertEquals(5587, result);
//    }

    @Test
    public void oneHundredStepsInfectsTwentySix() {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        String input = "..#\n" +
                       "#..\n" +
                       "...";

        adventOfCodeDayTwentyTwo.setUp(input, 10, 10);

        adventOfCodeDayTwentyTwo.stepPartTwo(100);
        adventOfCodeDayTwentyTwo.printGrid();

        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
        assertEquals(26, result);
    }

//    @Test
//    public void tenMillionInfects2511944() {
//        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();
//
//        String input = "..#\n" +
//                       "#..\n" +
//                       "...";
//
//        adventOfCodeDayTwentyTwo.setUp(input, 10000, 10000);
//
//        adventOfCodeDayTwentyTwo.stepPartTwo(10000000);
//        adventOfCodeDayTwentyTwo.printGrid();
//
//        int result = adventOfCodeDayTwentyTwo.getInfectionCount();
//        assertEquals(2511944, result);
//    }
}