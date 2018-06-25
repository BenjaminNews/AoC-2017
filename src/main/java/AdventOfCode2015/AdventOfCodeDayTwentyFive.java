package AdventOfCode2015;

public class AdventOfCodeDayTwentyFive {
    public static void main(String[] args) {
        System.out.println(getNum(20_151_125, 18_168_397, 252_533, 33_554_393));
    }

    private static long getNum(long a, long b, long c, long d) {
        for (int i = 1; i < b; i++) {
            a *= c;
            a %= d;
        }
        return a;
    }
}
