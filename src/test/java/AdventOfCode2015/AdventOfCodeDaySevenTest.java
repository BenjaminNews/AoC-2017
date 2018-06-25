package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySevenTest {

    private AdventOfCodeDaySeven adventOfCodeDaySeven;
    @Before
    public void setup() {
        adventOfCodeDaySeven = new AdventOfCodeDaySeven();
    }

    @Test
    public void enterValue123ToX() {
        String input = "123 -> x";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
    }

    @Test
    public void enterValue123ToX456ToY() {
        String input = "123 -> x\n" +
                       "456 -> y";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
    }

    @Test
    public void enterValueXANDYToD() {
        String input = "123 -> x\n" +
                       "456 -> y\n" +
                       "x AND y -> d";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
    }

    @Test
    public void enterValueXORYToE() {
        String input = "123 -> x\n" +
                       "456 -> y\n" +
                       "x AND y -> d\n" +
                       "x OR y -> e";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
        result = adventOfCodeDaySeven.getValue("e");
        assertEquals(507, result);
    }

    @Test
    public void LSHIFTXTwice() {
        String input = "123 -> x\n" +
                "456 -> y\n" +
                "x AND y -> d\n" +
                "x OR y -> e\n" +
                "x LSHIFT 2 -> f";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
        result = adventOfCodeDaySeven.getValue("e");
        assertEquals(507, result);
        result = adventOfCodeDaySeven.getValue("f");
        assertEquals(492, result);
    }

    @Test
    public void RSHIFTXTwice() {
        String input = "123 -> x\n" +
                "456 -> y\n" +
                "x AND y -> d\n" +
                "x OR y -> e\n" +
                "x LSHIFT 2 -> f\n" +
                "y RSHIFT 2 -> g";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
        result = adventOfCodeDaySeven.getValue("e");
        assertEquals(507, result);
        result = adventOfCodeDaySeven.getValue("f");
        assertEquals(492, result);
        result = adventOfCodeDaySeven.getValue("g");
        assertEquals(114, result);
    }

    @Test
    public void NOTXToH() {
        String input = "123 -> x\n" +
                "456 -> y\n" +
                "x AND y -> d\n" +
                "x OR y -> e\n" +
                "x LSHIFT 2 -> f\n" +
                "y RSHIFT 2 -> g\n" +
                "NOT x -> h";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
        result = adventOfCodeDaySeven.getValue("e");
        assertEquals(507, result);
        result = adventOfCodeDaySeven.getValue("f");
        assertEquals(492, result);
        result = adventOfCodeDaySeven.getValue("g");
        assertEquals(114, result);
        result = adventOfCodeDaySeven.getValue("h");
        assertEquals(65412, result);
    }

    @Test
    public void NOTYToI() {
        String input = "123 -> x\n" +
                "456 -> y\n" +
                "x AND y -> d\n" +
                "x OR y -> e\n" +
                "x LSHIFT 2 -> f\n" +
                "y RSHIFT 2 -> g\n" +
                "NOT x -> h\n" +
                "NOT y -> i";
        adventOfCodeDaySeven.performActions(input);
        int result = adventOfCodeDaySeven.getValue("x");
        assertEquals(123, result);
        result = adventOfCodeDaySeven.getValue("y");
        assertEquals(456, result);
        result = adventOfCodeDaySeven.getValue("d");
        assertEquals(72, result);
        result = adventOfCodeDaySeven.getValue("e");
        assertEquals(507, result);
        result = adventOfCodeDaySeven.getValue("f");
        assertEquals(492, result);
        result = adventOfCodeDaySeven.getValue("g");
        assertEquals(114, result);
        result = adventOfCodeDaySeven.getValue("h");
        assertEquals(65412, result);
        result = adventOfCodeDaySeven.getValue("i");
        assertEquals(65079, result);
    }
}