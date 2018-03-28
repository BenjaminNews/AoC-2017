package AdventOfCode2017;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdventOfCodeDayTen {

//    Suppose we instead only had a circular list containing five elements, 0, 1, 2, 3, 4,
//    and were given input lengths of 3, 4, 1, 5.
//
//    The list begins as [0] 1 2 3 4 (where square brackets indicate the current position).
//    The first length, 3, selects ([0] 1 2) 3 4 (where parentheses indicate the sublist to be reversed).
//
//    After reversing that section (0 1 2 into 2 1 0), we get ([2] 1 0) 3 4.
//
//    Then, the current position moves forward by the length, 3, plus the skip size, 0: 2 1 0 [3] 4.
//
//    Finally, the skip size increases to 1.
//    The second length, 4, selects a section which wraps: 2 1) 0 ([3] 4.
//
//    The sublist 3 4 2 1 is reversed to form 1 2 4 3: 4 3) 0 ([1] 2.
//
//    The current position moves forward by the length plus the skip size, a total of 5, causing it not
//    to move because it wraps around: 4 3 0 [1] 2. The skip size increases to 2.
//
//    The third length, 1, selects a sublist of a single element, and so reversing it has no effect.
//
//    The current position moves forward by the length (1) plus the skip size (2): 4 [3] 0 1 2. The skip
//    size increases to 3.
//
//    The fourth length, 5, selects every element starting with the second: 4) ([3] 0 1 2. Reversing
//    this sublist (3 0 1 2 4 into 4 2 1 0 3) produces: 3) ([4] 2 1 0.
//
//    Finally, the current position moves forward by 8: 3 4 2 1 [0]. The skip size increases to 4.

    private int startingPoition = 0;
    private int skipSize = 0;

    //private static final int[] moveCommands = new int[] {192,69,168,160,78,1,166,28,0,83,198,2,254,255,41,12};

    private int[] moveCommands = new int[] { 3, 4, 1, 5 };

    int moveStartPosition = 0;

    private List<Integer> values = new ArrayList<Integer>();

    private List<Byte> valueBytes = new ArrayList<Byte>();

    public String updateList(int inputLength) {

        for(int movesToPerforms = 0; movesToPerforms < inputLength; movesToPerforms++) {
            int length = moveCommands[moveStartPosition];

            List<Integer> subList = new ArrayList<Integer>();

            if(startingPoition > values.size()) {
                startingPoition = startingPoition - values.size();
            }

            for (int i = startingPoition, countDown = length; countDown > 0; i++) {
                if (i == values.size()) {
                    i = -1;
                } else {
                    subList.add(values.get(i));
                    countDown--;
                }
            }

            Collections.reverse(subList);
            int insertionPosition = startingPoition;
            for (int reversedListIndex = 0; subList.isEmpty() == false; reversedListIndex++) {
                values.set(insertionPosition, subList.get(0));
                subList.remove(0);
                insertionPosition++;
                if (insertionPosition == values.size()) {
                    insertionPosition = 0;
                }
            }
            moveStartPosition ++;
            startingPoition = startingPoition + length + skipSize;
            skipSize++;
        }
        return printList();
    }

    public int multiplyFirstTwoValues() {
        return values.get(0) * values.get(1);
    }


    public void setUp(int numberOfPositions) {
        for(int i = 0; i < numberOfPositions; i++) {
            values.add(i);
        }
    }

    public void setUpBytes() {
        Byte[] setupBytes = new Byte[] { 17, 31, 73, 47, 23 };
        for(Byte i = 0; i < setupBytes.length; i++) {
            valueBytes.add(setupBytes[i]);
        }
    }

    private String printList() {
        String s = "";

        for(Integer value : values) {
            s+= value + " ";
        }
        return s;
    }

    public String covertByteArrayToString(Byte[] input) {
        String s = "";

        for(int i = 0; i < input.length; i++) {
            s += input[i] + " ";
        }

        return s;
    }

    public Byte[] convertStringToBytes(String coversionString) throws UnsupportedEncodingException {
        byte[] bytes = coversionString.getBytes("US-ASCII");
        for(int i = (bytes.length - 1); i >= 0 ; i--) {
            valueBytes.add(0, bytes[i]);
        }
        return  valueBytes.toArray(new Byte[valueBytes.size()]);
    }


//    public static void main(String[] args) {
//        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
//        adventOfCodeDayTen.setUp(256);
//        adventOfCodeDayTen.updateList(moveCommands.length);
//        System.out.println(adventOfCodeDayTen.printList());
//        int res = multiplyFirstTwoValues();
//        System.out.println("first two values multiplied: " + res);
//
//    }
//    public String updateList(int inputLength) {
//
//        for(int movesToPerforms = 0; movesToPerforms < inputLength; movesToPerforms++) {
//            int length = moveCommands[moveStartPosition];
//
//            List<Integer> subList = new ArrayList<Integer>();
//
//            if(startingPoition > values.size()) {
//                startingPoition = startingPoition - values.size();
//            }
//
//            for (int i = startingPoition, countDown = length; countDown > 0; i++) {
//                if (i == values.size()) {
//                    i = -1;
//                } else {
//                    subList.add(values.get(i));
//                    countDown--;
//                }
//            }
//
//            Collections.reverse(subList);
//            int insertionPosition = startingPoition;
//            for (int reversedListIndex = 0; subList.isEmpty() == false; reversedListIndex++) {
//                values.set(insertionPosition, subList.get(0));
//                subList.remove(0);
//                insertionPosition++;
//                if (insertionPosition == values.size()) {
//                    insertionPosition = 0;
//                }
//            }
//            moveStartPosition ++;
//            startingPoition = startingPoition + length + skipSize;
//            skipSize++;
//        }
//        return printList();
//    }

}


