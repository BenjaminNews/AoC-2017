package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySixTest {

    @Test
    public void stringReturnsEASTER() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input =  "eedadn\n" +
                        "drvtee\n" +
                        "eandsr\n" +
                        "raavrd\n" +
                        "atevrs\n" +
                        "tsrnev\n" +
                        "sdttsa\n" +
                        "rasrtv\n" +
                        "nssdts\n" +
                        "ntnada\n" +
                        "svetve\n" +
                        "tesnvt\n" +
                        "vntsnd\n" +
                        "vrdear\n" +
                        "dvrsen\n" +
                        "enarar";

        adventOfCodeDaySix.setUp(input);
        String result = adventOfCodeDaySix.buildPassCode();
        assertEquals("EASTER", result);
    }

    @Test
    public void stringReturnsADVENT() {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();

        String input =  "eedadn\n" +
                "drvtee\n" +
                "eandsr\n" +
                "raavrd\n" +
                "atevrs\n" +
                "tsrnev\n" +
                "sdttsa\n" +
                "rasrtv\n" +
                "nssdts\n" +
                "ntnada\n" +
                "svetve\n" +
                "tesnvt\n" +
                "vntsnd\n" +
                "vrdear\n" +
                "dvrsen\n" +
                "enarar";

        adventOfCodeDaySix.setUp(input);
        String result = adventOfCodeDaySix.buildPassCodeTwo();
        assertEquals("ADVENT", result);
    }
}

