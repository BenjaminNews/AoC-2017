package AdventOfCode2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdventOfCodeDaySix {

    public int distribute(String input) {
        ArrayList<String> visitedLocations = new ArrayList<String>();
        List<Integer> values = Arrays.stream(input.split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int cycles = 0;
        while(true) {
            int startIndex = values.indexOf(Collections.max(values));
            int distributeCount = values.get(startIndex);
            values.set(startIndex, 0);
            for(int i = startIndex + 1; distributeCount > 0; i++, distributeCount--) {
                if(i == values.size()) i = 0;
                int currentVal = values.get(i);
                values.set(i, ++currentVal);
            }
            cycles++;
            if(visitedLocations.contains(Arrays.deepToString(values.toArray()))) {
                System.out.println(cycles - visitedLocations.indexOf(Arrays.deepToString(values.toArray())) - 1);
                return cycles;
            } else {
                visitedLocations.add(Arrays.deepToString(values.toArray()));
            }
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix();
        System.out.println(adventOfCodeDaySix.distribute(inputData));
    }

    private static final String inputData = "5, 1, 10, 0, 1, 7, 13, 14, 3, 12, 8, 10, 7, 12, 0, 6";
}