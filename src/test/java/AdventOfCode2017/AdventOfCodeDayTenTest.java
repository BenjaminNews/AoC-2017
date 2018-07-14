package AdventOfCode2017;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayTenTest {

    @Test
    public void input3_4_1_5ReturnsScoreOfTwelvewithSingleKnotHash() {
        assertEquals(12, AdventOfCodeDayTen.twist(5, "3,4,1,5"));
    }

    @Test
    public void emptyInputReturnsResultOfa2582a3a0e66e6e86e3812dcb672a272() {
        assertEquals("a2582a3a0e66e6e86e3812dcb672a272", AdventOfCodeDayTen.twistPartTwo(256, "", new int[] {17, 31, 73, 47, 23}));
    }

    @Test
    public void inputAoC_2017ReturnsResultOf33efeb34ea91902bb2f59c9920caa6cd() {
        assertEquals("33efeb34ea91902bb2f59c9920caa6cd", AdventOfCodeDayTen.twistPartTwo(256, "AoC 2017", new int[] {17, 31, 73, 47, 23}));
    }

    @Test
    public void input1_2_3ReturnsResultOf3efbe78a8d82f29979031a4aa0b16a9d() {
        assertEquals("3efbe78a8d82f29979031a4aa0b16a9d", AdventOfCodeDayTen.twistPartTwo(256, "1,2,3", new int[] {17, 31, 73, 47, 23}));
    }

    @Test
    public void input1_2_4ReturnsResultOf63960835bcdc130f0b66d7ff4f6a5a8e() {
        assertEquals("63960835bcdc130f0b66d7ff4f6a5a8e", AdventOfCodeDayTen.twistPartTwo(256, "1,2,4", new int[] {17, 31, 73, 47, 23}));
    }
}