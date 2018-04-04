package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayEightTest {

    @Test
    public void threeByTwoSquareIsCreatedInTopLeftCorner() {
        AdventOfCodeDayEight adventOfCodeDayEight = new AdventOfCodeDayEight();

        adventOfCodeDayEight.setUp(7, 3);

        String input = "rect 3x2";

        adventOfCodeDayEight.lightElements(input);

        String result1 = adventOfCodeDayEight.get(0, 0);
        String result2 = adventOfCodeDayEight.get(0, 1);
        String result3 = adventOfCodeDayEight.get(0, 2);
        String result4 = adventOfCodeDayEight.get(1, 0);
        String result5 = adventOfCodeDayEight.get(1, 1);
        String result6 = adventOfCodeDayEight.get(1, 2);
        String result7 = adventOfCodeDayEight.get(0, 3);
        String result8 = adventOfCodeDayEight.get(1, 3);
        String result9 = adventOfCodeDayEight.get(2, 0);

        assertEquals("#", result1);
        assertEquals("#", result2);
        assertEquals("#", result3);
        assertEquals("#", result4);
        assertEquals("#", result5);
        assertEquals("#", result6);
        assertEquals(".", result7);
        assertEquals(".", result8);
        assertEquals(".", result9);
    }

    @Test
    public void setupThenRotateColumnInTopLeftCorner() {
        AdventOfCodeDayEight adventOfCodeDayEight = new AdventOfCodeDayEight();

        adventOfCodeDayEight.setUp(7, 3);

        String input = "rect 3x2\n" +
                       "rotate column x=1 by 1";

        adventOfCodeDayEight.lightElements(input);

        String result1 = adventOfCodeDayEight.get(0, 0);
        String result2 = adventOfCodeDayEight.get(0, 1);
        String result3 = adventOfCodeDayEight.get(0, 2);
        String result4 = adventOfCodeDayEight.get(1, 0);
        String result5 = adventOfCodeDayEight.get(1, 1);
        String result6 = adventOfCodeDayEight.get(1, 2);
        String result7 = adventOfCodeDayEight.get(0, 3);
        String result8 = adventOfCodeDayEight.get(1, 3);
        String result9 = adventOfCodeDayEight.get(2, 0);
        String result10 = adventOfCodeDayEight.get(1, 3);

        assertEquals('#', result1);
        assertEquals('.', result2);
        assertEquals('#', result3);
        assertEquals('#', result4);
        assertEquals('#', result5);
        assertEquals('#', result6);
        assertEquals('.', result7);
        assertEquals('.', result8);
        assertEquals('.', result9);
        assertEquals('#', result10);
    }
//
//    //rotate row y=0 by 4
//    @Test
//    public void setupThenRotateRowInTopLeftCorner() {
//        AdventOfCodeDayEight adventOfCodeDayEight = new AdventOfCodeDayEight();
//
//        adventOfCodeDayEight.setUp(7, 3);
//
//        String input = "rect 3x2 rotate\n" +
//                       "column x=1 by 1\n" +
//                       "rotate row y=0 by 4";
//
//        adventOfCodeDayEight.lightElements(input);
//
//        String result1 = adventOfCodeDayEight.get(0, 0);
//        String result2 = adventOfCodeDayEight.get(0, 1);
//        String result3 = adventOfCodeDayEight.get(0, 2);
//        String result4 = adventOfCodeDayEight.get(1, 0);
//        String result5 = adventOfCodeDayEight.get(1, 1);
//        String result6 = adventOfCodeDayEight.get(1, 2);
//        String result7 = adventOfCodeDayEight.get(0, 3);
//        String result8 = adventOfCodeDayEight.get(1, 3);
//        String result9 = adventOfCodeDayEight.get(2, 0);
//        String result10 = adventOfCodeDayEight.get(1, 3);
//        String result11 = adventOfCodeDayEight.get(0, 4);
//        String result12 = adventOfCodeDayEight.get(0, 5);
//        String result13 = adventOfCodeDayEight.get(0, 6);
//
//        assertEquals('.', result1);
//        assertEquals('.', result2);
//        assertEquals('.', result3);
//        assertEquals('#', result4);
//        assertEquals('#', result5);
//        assertEquals('#', result6);
//        assertEquals('.', result7);
//        assertEquals('.', result8);
//        assertEquals('.', result9);
//        assertEquals('#', result10);
//        assertEquals('#', result11);
//        assertEquals('.', result12);
//        assertEquals('#', result13);
//    }
//
//    @Test
//    public void rotateColumnOneAgainWraps() {
//        AdventOfCodeDayEight adventOfCodeDayEight = new AdventOfCodeDayEight();
//
//        adventOfCodeDayEight.setUp(7, 3);
//
//        String input = "rect 3x2 rotate\n" +
//                "column x=1 by 1\n" +
//                "rotate row y=0 by 4\n" +
//                "column x=1 by 1";
//
//        adventOfCodeDayEight.lightElements(input);
//
//        String result1 = adventOfCodeDayEight.get(0, 0);
//        String result2 = adventOfCodeDayEight.get(0, 1);
//        String result3 = adventOfCodeDayEight.get(0, 2);
//        String result4 = adventOfCodeDayEight.get(1, 0);
//        String result5 = adventOfCodeDayEight.get(1, 1);
//        String result6 = adventOfCodeDayEight.get(1, 2);
//        String result7 = adventOfCodeDayEight.get(0, 3);
//        String result8 = adventOfCodeDayEight.get(1, 3);
//        String result9 = adventOfCodeDayEight.get(2, 0);
//        String result10 = adventOfCodeDayEight.get(1, 3);
//        String result11 = adventOfCodeDayEight.get(0, 4);
//        String result12 = adventOfCodeDayEight.get(0, 5);
//        String result13 = adventOfCodeDayEight.get(0, 6);
//
//        assertEquals('.', result1);
//        assertEquals('#', result2);
//        assertEquals('.', result3);
//        assertEquals('#', result4);
//        assertEquals('.', result5);
//        assertEquals('#', result6);
//        assertEquals('.', result7);
//        assertEquals('#', result8);
//        assertEquals('.', result9);
//        assertEquals('#', result10);
//        assertEquals('#', result11);
//        assertEquals('.', result12);
//        assertEquals('#', result13);
//    }
}