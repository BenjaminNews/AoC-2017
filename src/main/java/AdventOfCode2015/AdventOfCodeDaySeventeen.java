package AdventOfCode2015;

import java.util.Arrays;
import java.util.Stack;

public class AdventOfCodeDaySeventeen {

    private Stack<Integer> stack = new Stack<Integer>();

    private int[] values;
    private int targetSize, sumInStack, totalArrangements = 0, smallestSet = Integer.MAX_VALUE;

    public void setUp(String input, int targetSize) {
        values = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        this.targetSize = targetSize;
    }

    public int populateSubset(int fromIndex) {
        if (sumInStack == targetSize) {
            if(stack.size() < smallestSet) {
                smallestSet = stack.size();
            }
            totalArrangements++;
        }
        for (int currentIndex = fromIndex; currentIndex < values.length; currentIndex++) {

            if (sumInStack + values[currentIndex] <= targetSize) {
                stack.push(values[currentIndex]);
                sumInStack += values[currentIndex];
                populateSubset(currentIndex + 1);
                sumInStack -= stack.pop();
            }
        }
        return totalArrangements;
    }

    public int getSmallestSet() {
        return smallestSet;
    }

    public static void main(String[] args) {
        AdventOfCodeDaySeventeen adventOfCodeDaySeventeen = new AdventOfCodeDaySeventeen();
        adventOfCodeDaySeventeen.setUp(input, 150);
        int result = adventOfCodeDaySeventeen.populateSubset(0);
        System.out.println("arrangements: " + result);
        System.out.println("smallest set size: " + adventOfCodeDaySeventeen.getSmallestSet());
    }

    private static final String input = "11, 30, 47, 31, 32, 36, 3, 1, 5, 3, 32, 36, 15, 11, 46, 26, 28, 1, 19, 3";
}