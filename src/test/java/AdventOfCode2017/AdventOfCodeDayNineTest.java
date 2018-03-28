package AdventOfCode2017;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AdventOfCodeDayNineTest {

    @Test
    public void twoAngledBracketsOpenClosereturnZero() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(0, result);
        assertEquals(0, score);
    }

    @Test
    public void twoCurlyBracketsOpenClosereturnOne() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(1, result);
        assertEquals(1, score);
    }

    @Test
    public void threeOpenAngledBracketsWithOneCloseReturnZero() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<<<>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(0, result);
    }

    @Test
    public void openCurlyOpenCurlyOpenCurlyCloseCloseCurlyCloseCurlyReturnsThree() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{{}}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(3, result);
        assertEquals(6, score);
    }

    @Test
    public void openCurlyOpenCurlyBrackeyCloseCurlyBracketCommaOpenCurlyBrackeyCloseCurlyCloseCurlyBracketReeturnsThree() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{},{}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(3, result);
        assertEquals(5, score);
    }

    @Test
    public void openCurlyBracketOpenCurlyBracketOpenCurlyBracketCloseCurlyBracketCommaOpenCurlyBracketCloseCurlyBracketCommaOpenCurlyBracketOpenCurlyBracketCloseCurlyBracketCloseCurlyBracketCloseCurlyBracketCloseCurlyBracketReturnsSix() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{{},{},{{}}}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(6, result);
    }

    @Test
    public void openCurlyOpenAngledOpenCurlyCloseCurlyCommaOpenCurlyCloseCurlyCommaOpenCurlyOpenCurlyCloseCurlyCloseCurlyCloseAngledCloseCurlyReturnsOne() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{<{},{},{{}}>}";;

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(1, result);
    }

    @Test
    public void openCurlyOpenAngledAClosedAngledCommaOpenAngledAClosedAngledCommaOpenAngledAClosedAngledCommaOpenAngledAClosedAngledCloseCurlyReturnOne() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{<a>,<a>,<a>,<a>}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(1, result);
    }


    //{{<a>},{<a>},{<a>},{<a>}}
    @Test
    public void returnsFiveGroups() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{<a>},{<a>},{<a>},{<a>}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(5, result);
    }

    //{{<!>},{<!>},{<!>},{<a>}}
    @Test
    public void returnsTwoGroupsAsNestedAreCancelledByExclamationMarks() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{<!>},{<!>},{<!>},{<a>}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);

        assertEquals(2, result);
    }

    //{<a>,<a>,<a>,<a>}
    @Test
    public void returnsOnegroupAndOneScore() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{<a>,<a>,<a>,<a>}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(1, result);
        assertEquals(1, score);
    }

    //{{<ab>},{<ab>},{<ab>},{<ab>}}
    @Test
    public void returnsFiveGroupsAndAScoreOfNine() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{<ab>},{<ab>},{<ab>},{<ab>}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(5, result);
        assertEquals(9, score);
    }

    //{{<!!>},{<!!>},{<!!>},{<!!>}}
    @Test
    public void returnsFiveGroupsAndAScoreOfNineTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{<!!>},{<!!>},{<!!>},{<!!>}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(5, result);
        assertEquals(9, score);
    }
    //{{<a!>},{<a!>},{<a!>},{<ab>}}
    @Test
    public void returnsTwoGroupsAndAScoreOfThree() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "{{<a!>},{<a!>},{<a!>},{<ab>}}";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();

        assertEquals(2, result);
        assertEquals(3, score);
    }

    //<> returns 0
    @Test
    public void openAngleCloseAnglereturnsZero() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(0, garbageCount);
    }

    //<random characters> returns 17
    @Test
    public void openAngleAndSeventeenRandomCharactersCloseBracketReturnsSeventeen() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<random characters>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(17, garbageCount);
    }

    //<<<<>
    @Test
    public void fourOpenAnglesAndOneClosingReturnsThree() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<<<<>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(3, garbageCount);
    }

    //<{!>}>
    @Test
    public void dataReturnsTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<{!>}>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(2, garbageCount);
    }

    //<!!>
    @Test
    public void dataReturnsZero() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<!!>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(0, garbageCount);
    }

    //<!!!>>
    public void dataRturnsZeroTwo() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<!!!>>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(0, garbageCount);
    }

    //<{o"i!a,<{i<a>
    public void dataReturnsTen() {
        AdventOfCodeDayNine adventOfCodeDayNine = new AdventOfCodeDayNine();

        String input = "<{o\"i!a,<{i<a>";

        int result = adventOfCodeDayNine.getNumberOfValidGroups(input);
        int score = adventOfCodeDayNine.getScore();
        int garbageCount = adventOfCodeDayNine.getCancelledCharacters();

        assertEquals(0, result);
        assertEquals(0, score);
        assertEquals(10, garbageCount);
    }
}