package AdcentOfCode2017;

import java.util.HashMap;

public class AdventOfCodeDayThirteen {

    private HashMap<Integer, int[]> rows = new HashMap<Integer, int[]>();

    private int startPosition = 0;
    private int catchCount = 0;
    int picoSeconds = 0;

    public void setup(String input) {

        String[] inputRows = input.split("\n");

        for(int i = 0; i < inputRows.length; i++) {
            int columnNumber = Integer.parseInt(inputRows[i].split(": ")[0]);
            int columnSize = Integer.parseInt(inputRows[i].split(": ")[1]);

            int[] values = new int[columnSize];

            values[0] = 1;

            rows.put(columnNumber, values);
        }
    }

    public int move() {

        while(catchCount != -1) {
            catchCount = 0;

            while (startPosition < 99) {
                if (rows.containsKey(startPosition)) {
                    if (rows.get(startPosition)[0] == 1 ) {
                        //catchCount += (startPosition * rows.get(startPosition).length);
                        catchCount++;

                    }
                } else {
                    for (Integer columnNumber : rows.keySet()) {
                        int[] tempArray = rows.get(columnNumber);
                        for (int i = 0; i < tempArray.length; i++) {
                            if (tempArray[i] != 0) {

                                if (tempArray[i] == -1) {
                                    if (i - 1 == 0) {
                                        tempArray[i - 1] = 1;
                                    } else {
                                        tempArray[i - 1] = -1;
                                    }
                                    tempArray[i] = 0;
                                    break;
                                } else if (tempArray[i] == 1) {
                                    if (i + 1 == (tempArray.length - 1)) {
                                        tempArray[i + 1] = -1;
                                    } else {
                                        tempArray[i + 1] = 1;
                                    }
                                    tempArray[i] = 0;
                                    break;
                                }
                            }
                        }
                    }
                    if(catchCount == 0) {
                        System.out.println(picoSeconds);
                        break;
                    } else {
                        catchCount = 0;
                    }
                    startPosition++;
                }
                startPosition = 0;
                picoSeconds++;

            }
            if(catchCount == 0) {
                System.out.println("picoSeconds: " + picoSeconds);
                catchCount = -1;
                break;
            }
            //System.out.println(catchCount);
            startPosition = 0;
            catchCount = 0;
        }
        System.out.println(catchCount);
        return catchCount;
    }

    private int[] populateColumn(int[] column) {
        column[0] = 1;

        for(int i = 1; i < column.length; i++) {
            column[i] = 0;
        }

        return column;
    }

    private String printArray(int[] array) {
        String s = "";

        for(int i = 0; i < array.length; i++) {
            s+= array[i] + " ";
        }
        return s;
    }

    private void printHashMap() {
        for (Integer columnNumber: rows.keySet()){
            System.out.println("Column Number: " + columnNumber + " val: " + printArray(rows.get(columnNumber)));
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDayThirteen adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();
        adventOfCodeDayThirteen.setup(puzzleInput);
        adventOfCodeDayThirteen.move();
    }

    private static String puzzleInput = "0: 4\n"+
            "1: 2\n"+
            "2: 3\n"+
            "4: 4\n"+
            "6: 8\n"+
            "8: 5\n"+
            "10: 6\n"+
            "12: 6\n"+
            "14: 10\n"+
            "16: 8\n"+
            "18: 6\n"+
            "20: 9\n"+
            "22: 8\n"+
            "24: 6\n"+
            "26: 8\n"+
            "28: 8\n"+
            "30: 12\n"+
            "32: 12\n"+
            "34: 12\n"+
            "36: 12\n"+
            "38: 10\n"+
            "40: 12\n"+
            "42: 12\n"+
            "44: 14\n"+
            "46: 8\n"+
            "48: 14\n"+
            "50: 12\n"+
            "52: 14\n"+
            "54: 14\n"+
            "58: 14\n"+
            "60: 12\n"+
            "62: 14\n"+
            "64: 14\n"+
            "66: 12\n"+
            "68: 12\n"+
            "72: 14\n"+
            "74: 18\n"+
            "76: 17\n"+
            "86: 14\n"+
            "88: 20\n"+
            "92: 14\n"+
            "94: 14\n"+
            "96: 18\n"+
            "98: 18";
}
