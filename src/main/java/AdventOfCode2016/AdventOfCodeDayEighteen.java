package AdventOfCode2016;

import java.util.Arrays;

public class AdventOfCodeDayEighteen {

    private int[][] floor;
    private int currentRow;

    public int calculateSafeTile(String input, int rows) {
        currentRow = 0;
        floor = new int[rows][input.length()];
        String[] startingTileValues = input.split("");
        for(int i = 0; i < startingTileValues.length; i++) {
            int value = startingTileValues[i].equals(".") ? 0 : 1;
            floor[0][i] = value;
        }
        for(int i = 1; i < rows; i++) {
            Arrays.fill(floor[i],0);
        }
        populateRows();
        return getSafeTileCount();
    }

    private void populateRows() {
        for(int i = 0; i < floor.length - 1; i++) {
            populateRow();;
        }
    }

    private int getSafeTileCount() {
        int count = 0;
        for(int x = 0; x < floor.length; x++) {
            for(int y = 0; y < floor[x].length; y++) {
               if(floor[x][y] == 0) {
                   count++;
               }
            }
        }
        return count;
    }

    private void populateRow() {
        int[] currentRowValuesToCheck = floor[currentRow];
        int[] nextRowValues = new int[currentRowValuesToCheck.length];
        Arrays.fill(nextRowValues, 0);

        for(int i = 0; i < currentRowValuesToCheck.length; i++) {
            if(i == currentRowValuesToCheck.length - 1) {
                if (leftTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                }
            } else if(i == 0) {
                if(rightTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                }
            } else {
                if(leftTileIsTrap(i) && currentTileIsTrap(i) && !rightTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                } else if(currentTileIsTrap(i) && rightTileIsTrap(i) && !leftTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                } else if(leftTileIsTrap(i) && !currentTileIsTrap(i) && !rightTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                } else if(!leftTileIsTrap(i) && !currentTileIsTrap(i) && rightTileIsTrap(i)) {
                    nextRowValues[i] = 1;
                }
            }
        }
        floor[currentRow + 1] = nextRowValues;
        currentRow++;
    }

    private boolean rightTileIsTrap(int position) {
        if(position + 1 < floor[0].length) {
            return floor[currentRow][position + 1] == 1;
        } else {
            return false;
        }
    }

    private boolean leftTileIsTrap(int position) {
        if(position - 1 >= 0) {
            return floor[currentRow][position - 1] == 1;
        } else {
            return false;
        }
    }

    private boolean currentTileIsTrap(int position) {
        return floor[currentRow][position] == 1;
    }


    public static void main(String[] args) {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        String input = ".^^^^^.^^.^^^.^...^..^^.^.^..^^^^^^^^^^..^...^^.^..^^^^..^^^^...^.^.^^^^^^^^....^..^^^^^^.^^^.^^^.^^";
        System.out.println(adventOfCodeDayEighteen.calculateSafeTile(input, 40));
        System.out.println(adventOfCodeDayEighteen.calculateSafeTile(input, 400000));

    }
}
