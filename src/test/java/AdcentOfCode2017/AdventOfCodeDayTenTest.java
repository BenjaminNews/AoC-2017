package AdcentOfCode2017;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayTenTest {

    @Test
    public void reverseListFirstStep() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUp(5);

        String result = adventOfCodeDayTen.updateList(1);

        String expectedResult = "2 1 0 3 4 ";

        assertEquals(expectedResult, result);

        int multipliedFirstValues = adventOfCodeDayTen.multiplyFirstTwoValues();

        assertEquals(2, multipliedFirstValues);

    }

    @Test
    public void reverseListReturnsSecondStep() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUp(5);

        String result = adventOfCodeDayTen.updateList(2);

        String expectedResult = "4 3 0 1 2 ";

        assertEquals(expectedResult, result);

        int multipliedFirstValues = adventOfCodeDayTen.multiplyFirstTwoValues();

        assertEquals(12, multipliedFirstValues);


    }

    @Test
    public void reverseListReturnsThirdStep() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUp(5);

        String result = adventOfCodeDayTen.updateList(3);

        String expectedResult = "4 3 0 1 2 ";

        assertEquals(expectedResult, result);

        int multipliedFirstValues = adventOfCodeDayTen.multiplyFirstTwoValues();

        assertEquals(12, multipliedFirstValues);
    }

    @Test
    public void reverseListReturnsFourthStep() {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUp(5);

        String result = adventOfCodeDayTen.updateList(4);

        String expectedResult = "3 4 2 1 0 ";

        assertEquals(expectedResult, result);

        int multipliedFirstValues = adventOfCodeDayTen.multiplyFirstTwoValues();

        assertEquals(12, multipliedFirstValues);
    }

    @Test
    public void stringReturnsASCIIBytes() throws UnsupportedEncodingException {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        String input = "1,2,3";

        Byte[] res = adventOfCodeDayTen.convertStringToBytes(input);

        String expectedResult = "49 44 50 44 51 ";
        String resultAsString = adventOfCodeDayTen.covertByteArrayToString(res);

        assertEquals(expectedResult, resultAsString);
    }

    @Test
    public void stringReturnsASCIIBytesOnFrontOfSequence() throws UnsupportedEncodingException {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUpBytes();

        String input = "1,2,3";

        Byte[] res = adventOfCodeDayTen.convertStringToBytes(input);

        String expectedResult = "49 44 50 44 51 17 31 73 47 23 ";
        String resultAsString = adventOfCodeDayTen.covertByteArrayToString(res);

        assertEquals(expectedResult, resultAsString);
    }
}