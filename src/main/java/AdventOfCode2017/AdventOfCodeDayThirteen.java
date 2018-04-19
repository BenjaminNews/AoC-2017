package AdventOfCode2017;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventOfCodeDayThirteen {

    private HashMap<Integer, ProgramColumn> rows = new HashMap<Integer, ProgramColumn>();
    private ArrayList<Integer> caughtColumns = new ArrayList<>();

    private int startPosition = 0;
    private int delay = -1;

    public void setUp(String input) {
        String[] columns = input.split("\n");

        int endValue = Integer.parseInt(columns[columns.length - 1].split(": ")[0]);

        for(int i = 0; i < endValue; i++) {
            rows.put(i, null);
        }

        for(String s : columns) {
            int columnNumber = Integer.parseInt(s.split(": ")[0]);
            int columnSize = Integer.parseInt(s.split(": ")[1]);
            rows.put(columnNumber, new ProgramColumn(columnSize));
        }
    }

    public int moveProgram() {
        caughtColumns.add(0);
        while(startPosition != rows.size()) {
            startPosition++;
            move();
            if(checkCapture()) {
                caughtColumns.add(startPosition);
            }
        }
        return calculateScore();
    }

    public int moveProgramPartTwo() {
        caughtColumns.add(0);
        while(startPosition != rows.size() - 1) {
            delay++;
            move();
            if(checkCapture()) {
                startPosition = 0;
                caughtColumns.add(startPosition);
            }
            startPosition++;
        }
        return delay;
    }

    private boolean checkCapture() {
        if(rows.get(startPosition) != null) {
            if(rows.get(startPosition).location == 0) {
                return true;
            }
        }
        return false;
    }

    private void move() {
        for(int key : rows.keySet()) {
            ProgramColumn columnToMove = rows.get(key);
            if(columnToMove != null) {
                columnToMove.move();
                rows.put(key, columnToMove);
            }
        }
    }

    private int calculateScore() {
        int totalScore = 0;
        for(int i = 0; i < caughtColumns.size(); i++) {
            totalScore += caughtColumns.get(i) * rows.get(caughtColumns.get(i)).size;
        }
        return totalScore;
    }

    public static void main(String[] args) {
        AdventOfCodeDayThirteen adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();
        adventOfCodeDayThirteen.setUp(puzzleInput);
        int result = adventOfCodeDayThirteen.moveProgram();
        System.out.println("caught count: " + result);

        adventOfCodeDayThirteen = new AdventOfCodeDayThirteen();
        adventOfCodeDayThirteen.setUp(puzzleInput);
        int resultTwo = adventOfCodeDayThirteen.moveProgramPartTwo();
        System.out.println("caught count: " + resultTwo);
    }

    private class ProgramColumn {

        int location = 0;
        int size = 0;
        boolean moveDown = true;

        ProgramColumn(int size) {
            this.size = size;
        }

        private void move() {
            if(moveDown) {
                location++;
                if(location == (size - 1))
                    moveDown = false;
            } else if(moveDown == false) {
                location--;
                if(location == 0)
                    moveDown = true;
            }
        }
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