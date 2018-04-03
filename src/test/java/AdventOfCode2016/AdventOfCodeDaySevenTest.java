package AdventOfCode2016;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDaySevenTest {

    @Test
    public void inputOneSupportsTLS() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "abba[mnop]qrst";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCount();
        assertEquals(1, valid);
    }

    @Test
    public void inputTwoDoesNotSupportTLS() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "abcd[bddb]xyyx";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCount();
        assertEquals(0, valid);
    }

    @Test
    public void inputThreeDoesNotSupportTLS() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "aaaa[qwer]tyui";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCount();
        assertEquals(0, valid);
    }

    @Test
    public void inputFourSupportsTLS() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "ioxxoj[asdfgh]zxcvbn";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCount();
        assertEquals(1, valid);
    }

    @Test
    public void inputreturnsAScoreOfTwo() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "abba[mnop]qrst\n" +
                       "aaaa[qwer]tyui\n" +
                       "abcd[bddb]xyyx\n" +
                       "ioxxoj[asdfgh]zxcvbn";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCount();
        assertEquals(2, valid);
    }

    @Test
    public void invalid() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "htryepnqeptnntbvy[ruetrynxkllonponrzp]uimyvygbbjskgfuuu[gossoavktylxmncyyfs]yotrlpozunzomjtc[tgoikyfrrmlvyvoe]rlnwzyigyvkhequuh";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCount();

        assertEquals(0, valid);
    }

    @Test
    public void invalidTwo() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "snwnqixjgwhcrpfeun[mvseymbltdzywnw]xbogzgtddtzzadgsrin[sibgoazaxuyfaaf]tdtrrjbxjzusuvzogpa[etytgiqwoyxevcq]ifanoaaqoldczzj";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCount();

        assertEquals(0, valid);
    }

    @Test
    public void inputSupportsSSL() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "aba[bab]xyz";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCountPartTwo();
        assertEquals(1, valid);
    }


    @Test
    public void inputDoesNotSupportsSSL() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "xyx[xyx]xyx";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCountPartTwo();
        assertEquals(0, valid);
    }

    @Test
    public void inputSupportsSSLTwo() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "aaa[kek]eke";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCountPartTwo();
        assertEquals(1, valid);
    }

    @Test
    public void inputSupportsSSLThree() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();
        String input = "azbz[bzb]cdb";
        adventOfCodeDaySeven.setUp(input);
        int valid = adventOfCodeDaySeven.getValidCountPartTwo();
        assertEquals(1, valid);
    }

    @Test
    public void inputreturnsAScoreOfTwoPartTwo() {
        AdventOfCodeDaySeven adventOfCodeDaySeven = new AdventOfCodeDaySeven();

        String input = "aba[bab]xyz\n" +
                "xyx[xyx]xyx\n" +
                "aaa[kek]eke\n" +
                "azbz[bzb]cdb";

        adventOfCodeDaySeven.setUp(input);

        int valid = adventOfCodeDaySeven.getValidCountPartTwo();
        assertEquals(3, valid);
    }
}