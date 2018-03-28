package AdventOfCode2017;

import AdcentOfCode2017.AdventOfCodeDayEleven;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdventOfCodeDayElevenTest {

    @Test
    public void nNisTwoStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "n,n";

        int result = adventOfCodeDayEleven.setEndPosition(input);
        assertEquals(2, result);
    }

    @Test
    public void sSisTwoStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "s,s";

        int result = adventOfCodeDayEleven.setEndPosition(input);
        assertEquals(2, result);
    }

    @Test
    public void nwNELeaveOneStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "nw,ne";

        int result = adventOfCodeDayEleven.setEndPosition(input);
        assertEquals(1, result);
    }

    @Test
    public void neNWLeaveOneStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,nw";

        int result = adventOfCodeDayEleven.setEndPosition(input);
        assertEquals(1, result);
    }

    @Test
    public void neNWNwLeaveTwoStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,nw,nw";

        int result = adventOfCodeDayEleven.setEndPosition(input);
        assertEquals(2, result);
    }

    @Test
    public void nwNENELeaveTwoStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "nw,ne,ne";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(2, result);
    }

    @Test
    public void sSNLeavesOneStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "s,s,n";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(1, result);
    }

    @Test
    public void nNSLeavesOneStepsAway() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "n,n,s";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(1, result);
    }

    @Test
    public void neNeNeLeavesThreeStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,ne";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(3, result);
    }

    @Test
    public void neNeSwSwReturnsToStartingPoint() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,sw,sw";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(0, result);
    }

    @Test
    public void neNeSSLeavesThwoStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,ne,s,s";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(2, result);
    }

    @Test
    public void nwNwSSLeavesThwoStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "nw,nw,s,s";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(2, result);
    }

    @Test
    public void seSwSeSwLeaveTwoStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,sw,se,sw";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(2, result);
    }

    @Test
    public void seSwSeSWSWLeavesThreeStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,sw,se,sw,sw";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(3, result);
    }

    @Test
    public void seSeNwNwReturnsToZero() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,se,nw,nw";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(0, result);
    }

    @Test
    public void neNNLeavesThreeStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "ne,n,n";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(3, result);
    }

    @Test
    public void seSSLeavesThreeStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,s,s";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(3, result);
    }

    @Test
    public void seSwSOneStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "se,sw";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(1, result);
    }

    @Test
    public void swSeSOneStepsFromStart() {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        String input = "sw,se";

        int result = adventOfCodeDayEleven.setEndPosition(input);

        assertEquals(1, result);
    }
//
//    @Test
//    public void swSeSwSeSeLeavesTwoStepsFromStart() {
//        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
//
//        String input = "sw,se,sw";
//
//        int result = adventOfCodeDayEleven.setEndPosition(input);
//
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void swSeSwSeLeavesTwoStepsFromStart() {
//        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
//
//        String input = "sw,se,sw,se";
//
//        int result = adventOfCodeDayEleven.setEndPosition(input);
//
//        assertEquals(2, result);
//    }
//
//    @Test
//    public void swSeSwSeSeLeavesThreeStepsFromStart() {
//        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
//
//        String input = "sw,se,sw,se,se";
//
//        int result = adventOfCodeDayEleven.setEndPosition(input);
//
//        assertEquals(3, result);
//    }
}