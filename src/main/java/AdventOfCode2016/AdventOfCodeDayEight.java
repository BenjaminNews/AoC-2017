package AdventOfCode2016;

public class AdventOfCodeDayEight {
    char[][] display;
    public void setUp(int x, int y) {
        display = new char[y][x];

        for(int row = 0; row < x; row++) {
            for(int column = 0; column < y; column++) {
                display[column][row] = '.';
            }
        }
        printDisplay();
    }

    private void printDisplay() {
        String s = "";

        for(int row = 0; row < display.length; row++) {
            for(int column = 0; column < display[0].length; column++) {
                s += display[row][column];
            }
            s+= "\n";
        }
        System.out.println(s);
    }

    public void lightElements(String input) {
        String[] moveValues = input.split("\n");
        for(String s: moveValues) {
            String[] command = s.split(" ");
            if (command.length == 2) {
                int height = Integer.parseInt(command[1].split("x")[1]);
                int width = Integer.parseInt(command[1].split("x")[0]);
                createRectangle(height, width);
            } else if (command[1].equals("row")) {
                int row = Integer.parseInt(command[2].split("=")[1]);
                int amount = Integer.parseInt(command[4]);
                rotateRow(row, amount);
            } else if (command[1].equals("column")) {
                int column = Integer.parseInt(command[2].split("=")[1]);
                int amount = Integer.parseInt(command[4]);
                rotateColumn(column, amount);
            }
            printDisplay();
        }
    }

    private void createRectangle(int height, int width) {
        for(int xCor = 0; xCor < height; xCor++) {
            for(int yCor = 0; yCor < width; yCor++) {
                display[xCor][yCor] = '#';
            }
        }
    }

    private void rotateRow(int row, int amount) {
        char arr[] = display[row];
        for(int i = 0; i < amount; i++) {
            char val = arr[arr.length-1];
            System.arraycopy(arr, 0, arr, 1, arr.length-1);
            arr[0] = val;
        }

        display[row] = arr;
    }

    public void rotateColumn(int column, int amount) {
        int x = display.length;

        for(int i = column; i < display.length; i++) {
            if(amount == 0) break;
            display[column][i] = 'O';
        }
    }

    public String get(int x, int y) {
        return String.valueOf(display[x][y]);
    }
}
