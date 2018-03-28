package AdventOfCode2017;

import java.util.ArrayList;
import java.util.Arrays;

public class AdventOfCodeDaySix {

    private ArrayList<String> visitedPositions = new ArrayList<>();

    private int[] values;

    private int nestedLoopSize = 0;

    public AdventOfCodeDaySix(String input) {
        if(input.contains("\t")) {
            values = Arrays.stream(input.split("\t")).mapToInt(Integer::parseInt).toArray();
        } else {
            values = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        visitedPositions.add(getStringRepresentation());
    }

    public void step() {

        int[] sortedValues = values.clone();
        Arrays.sort(sortedValues);

        int highestValue = sortedValues[sortedValues.length - 1];
        int index = getHighestValueIndex(values, highestValue);

        for (int countDownValue = highestValue + 1, startIndex = index; countDownValue > 0; countDownValue--, startIndex++) {

            if (startIndex == index) {
                //do nothing
            } else {
                if (startIndex == values.length) {
                    values[index]--;
                    values[0]++;
                    startIndex = 0;
                } else {
                    values[index]--;
                    values[startIndex]++;
                }
            }
        }
    }

    private int getHighestValueIndex(int[] indexValues, int value) {
        for(int i = 0; i < indexValues.length; i++) {
            if(indexValues[i] == value)
                return i;
        }
        return -1;
    }

    public String getStringRepresentation() {
        String stringRepresentation = "";

        for(int i = 0; i < values.length; i++) {
            stringRepresentation += values[i];
            if(i + 1 == values.length)
                break;
            stringRepresentation += " ";
        }
        return stringRepresentation;
    }

    public int findLoop() {

        boolean reachedLoopEnd = false;

        while(reachedLoopEnd ==  false) {
            step();
            String positionRepresentation = getStringRepresentation();
            if(visitedPositions.contains(positionRepresentation)) {
                reachedLoopEnd = true;
            } else {
                visitedPositions.add(positionRepresentation);
            }
        }
        nestedLoopSize = visitedPositions.size() - visitedPositions.indexOf(getStringRepresentation());
        return visitedPositions.size();
    }

    public int getNestedLoopSize() {
        return this.nestedLoopSize;
    }

    public static void main(String[] args) {
        AdventOfCodeDaySix adventOfCodeDaySix = new AdventOfCodeDaySix(inputData);
        System.out.println("loop size: " + adventOfCodeDaySix.findLoop());
        System.out.println("nested loop size: " + adventOfCodeDaySix.getNestedLoopSize());
    }

    private static final String inputData = "5\t1\t10\t0\t1\t7\t13\t14\t3\t12\t8\t10\t7\t12\t0\t6";

}
