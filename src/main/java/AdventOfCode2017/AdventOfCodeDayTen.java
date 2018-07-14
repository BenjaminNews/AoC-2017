package AdventOfCode2017;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AdventOfCodeDayTen {

    public static int twist(int setSize, String input) {
        List<Integer> lengths = Arrays.stream(input.split(",")).map(Integer::parseInt).collect(Collectors.toList());
        int[] list = IntStream.iterate(0, n -> n + 1).limit(setSize).toArray();
        int pos = 0;
        int skipSize = 0;
        for (int length : lengths) {
            spin(list, pos, length);
            pos += length + skipSize;
            skipSize++;
        }
        return list[0] * list[1];
    }

    public static String twistPartTwo(int setSize, String input, int[] additionalLengths) {
        List<Integer> lengths = input.chars().boxed().collect(Collectors.toList());
        Collections.addAll(lengths, Arrays.stream(additionalLengths).boxed().toArray(Integer[]::new));
        int[] list = IntStream.iterate(0, n -> n + 1).limit(setSize).toArray();
        int pos = 0;
        int skipSize = 0;
        for(int x = 0; x < 64; x++) {
            for (int length : lengths) {
                spin(list, pos, length);
                pos += length + skipSize;
                skipSize++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.length; i += 16) {
            int exclusiveOrValue = list[i] ^ list[i + 1];
            for(int x = i + 2; x < i + 16; x++) {
                exclusiveOrValue = exclusiveOrValue ^ list[x];
            }
            result.append(Integer.toHexString(exclusiveOrValue).length() == 1 ? "0" + Integer.toHexString(exclusiveOrValue) : Integer.toHexString(exclusiveOrValue));
        }
        return result.toString();
    }

    private static void spin(int[] list, int pos, int length) {
        for (int i = 0; i < length / 2; i++) {
            int start = (pos + i) % list.length;
            int end = (pos + length - 1 - i) % list.length;
            int tmp = list[start];
            list[start] = list[end];
            list[end] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(AdventOfCodeDayTen.twist(256, input));
        System.out.println(AdventOfCodeDayTen.twistPartTwo(256, input, new int[] {17, 31, 73, 47, 23}));
    }

    private static final String input = "192,69,168,160,78,1,166,28,0,83,198,2,254,255,41,12";
}