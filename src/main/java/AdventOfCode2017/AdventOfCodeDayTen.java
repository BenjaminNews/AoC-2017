package AdventOfCode2017;

import java.util.Arrays;
import java.util.Collections;

public class AdventOfCodeDayTen {

    private int skipSize = 0;
    private int position = 0;

    private int[] twistString;
    private int[] steps;

    public void setUp(int length, String input) {
        twistString = new int[length];
        for(int i = 0; i < length; i++) {
            twistString[i] = i;
        }
        steps = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
    }

    public int twist() {
        for(int twistNumber = 0; twistNumber < steps.length; twistNumber++) {
            int sizeToTwist = steps[twistNumber];
            int[] twistArray = getArrayToTwist(sizeToTwist);
            int[] reversedTwist = twistArrayString(twistArray);
            updateTwistString(reversedTwist);
            if(position + sizeToTwist + skipSize >= twistString.length) {
                position = (sizeToTwist + skipSize + position) - twistString.length;
            } else {
                position = position + sizeToTwist + skipSize;
            }
            skipSize++;
        }
        return twistString[0] * twistString[1];
    }

    private void updateTwistString(int[] reversedTwist) {
        int currentPosition = position;
        for(int i = 0; i < reversedTwist.length; i++) {
            if(currentPosition + 1 > twistString.length) {
                currentPosition = 0;
                twistString[currentPosition] = reversedTwist[i];
            } else {
                twistString[currentPosition] = reversedTwist[i];
            }
            currentPosition++;
        }
    }

    private int[] twistArrayString(int[] twistArray) {
        int[] reversed = new int[twistArray.length];
        Collections.reverse(Arrays.asList(twistArray));
        for(int i = twistArray.length - 1, x = 0; i >= 0; i--, x++) {
            reversed[x] = twistArray[i];
        }
        return reversed;
    }

    private int[] getArrayToTwist(int sizeToTwist) {
        int index = position;
        int[] nestedList = new int[sizeToTwist];
        for(int i = 0; i < sizeToTwist; i++, index++) {
            if(index + 1 > twistString.length) {
                index = 0;
                nestedList[i] = twistString[index];
            } else {
                nestedList[i] = twistString[index];
            }
        }
        return nestedList;
    }

    public static void main(String[] args) {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();

        adventOfCodeDayTen.setUp(256, input);
        int result = adventOfCodeDayTen.twist();
        System.out.println("result: " + result);
    }

    private static final String input = "192,69,168,160,78,1,166,28,0,83,198,2,254,255,41,12";
}