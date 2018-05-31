package AdventOfCode2015;

public class AdventOfCodeDayEighteen {

    private int[][] lightGrid;
    private int size;

    public void setup(String input) {
        this.size = input.split("\n")[0].length();
        lightGrid = new int[size][size];
        String[] lineValues = input.split("\n");
        for(int i = 0; i < lineValues.length; i++) {
            String[] lineValue = lineValues[i].split("");
            int[] lineIntegerValues = new int[lineValue.length];
            for(int x = 0; x < lineValue.length; x++) {
                lineIntegerValues[x] = lineValue[x].equals("#") ? 1 : 0;
            }
            lightGrid[i] = lineIntegerValues;
        }
    }

    public int animate(int steps) {
        for(int step = 0; step < steps; step++) {
            int[][] tempGrid = new int[size][size];
            for(int x = 0; x < lightGrid.length; x++) {
                for(int y = 0; y < lightGrid[x].length; y++) {
                    if(x == 0 && y == 0) {
                        tempGrid[x][y] = checkTopLeftCorner();
                    } else if(x == 0 && y == size - 1) {
                        tempGrid[x][y] = checkTopRightCorner();
                    } else if(x == size - 1 && y == 0) {
                        tempGrid[x][y] = checkBottomLeftCorner();
                    } else if(x == size - 1 && y == size - 1) {
                        tempGrid[x][y] = checkBottomRightCorner();
                    } else if(x == 0) {
                        tempGrid[x][y] = checkTopRow(y);
                    } else if(y == 0) {
                        tempGrid[x][y] = checkLeftColumn(x);
                    } else if(y == size - 1) {
                        tempGrid[x][y] = checkRightColumn(x);
                    } else if(x == size - 1) {
                        tempGrid[x][y] = checkBottomRow(y);
                    } else {
                        tempGrid[x][y] = checkNonEdgeLight(x, y) ;
                    }
                }
            }
            lightGrid = tempGrid;
        }
        return getTotalLit();
    }

    public int animatePartTwo(int steps) {
        for(int step = 0; step < steps; step++) {
            int[][] tempGrid = new int[size][size];
            for(int x = 0; x < lightGrid.length; x++) {
                for(int y = 0; y < lightGrid[x].length; y++) {
                    if(x == 0 && y == 0 || x == 0 && y == size - 1 || x == size - 1 && y == 0 || x == size - 1 && y == size - 1) {
                        tempGrid[x][y] = 1;
                    } else if(x == 0) {
                        tempGrid[x][y] = checkTopRow(y);
                    } else if(x > 0 &&  x < size - 1 && y == 0) {
                        tempGrid[x][y] = checkLeftColumn(x);
                    } else if(x > 0 && x < size - 1 && y == size - 1) {
                        tempGrid[x][y] = checkRightColumn(x);
                    } else if(x == size - 1 && y > 0 && y < size -1) {
                        tempGrid[x][y] = checkBottomRow(y);
                    } else {
                        tempGrid[x][y] = checkNonEdgeLight(x, y) ;
                    }
                }
            }
            lightGrid = tempGrid;
        }
        return getTotalLit();
    }

    private int checkNonEdgeLight(int x, int y) {
        int[] aboveRow = lightGrid[x - 1];
        int[] currentRow = lightGrid[x];
        int[] rowBelow = lightGrid[x + 1];
        int total = aboveRow[y - 1] + aboveRow[y] + aboveRow[y + 1] + currentRow[y - 1] + currentRow[y + 1] + rowBelow[y - 1] + rowBelow[y] + rowBelow[y + 1];
        if(currentRow[y] == 1 && (total == 2 || total == 3) || currentRow[y] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkBottomRow(int y) {
        int[] currentRow = lightGrid[size - 1];
        int[] aboveRow = lightGrid[size - 2];
        int total = currentRow[y - 1] + currentRow[y + 1] + aboveRow[y - 1] + aboveRow[y] + aboveRow[y + 1];
        if(currentRow[y] == 1 && (total == 2 || total == 3) || currentRow[y] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkRightColumn(int x) {
        int[] aboveRow = lightGrid[x -  1];
        int[] belowRow = lightGrid[x + 1];
        int[] currentRow = lightGrid[x];
        int total =  aboveRow[size - 1] + aboveRow[size - 2] + currentRow[size - 2] + belowRow[size - 2] + belowRow[size - 1];
        if(lightGrid[x][size - 1] == 1 && (total == 2 || total == 3) || (lightGrid[x][size - 1] == 0 && total == 3)) {
            return 1;
        }
        return 0;
    }

    private int checkLeftColumn(int x) {
        int[] aboveRow = lightGrid[x - 1];
        int[] currentRow = lightGrid[x];
        int[] belowRow = lightGrid[x + 1];
        int total = aboveRow[0] + aboveRow[1] + currentRow[1] + belowRow[0] + belowRow[1];
        if(currentRow[0] == 1 && (total == 2 || total == 3) || (currentRow[0] == 0 && total == 3)) {
            return 1;
        }
        return 0;
    }

    private int checkTopRow(int y) {
        int[] currentLine = lightGrid[0];
        int[] nextLine = lightGrid[1];
        int total = currentLine[y - 1] + currentLine[y + 1] + nextLine[y] + nextLine[y - 1] + nextLine[y + 1];
        if(currentLine[y] == 1 && (total == 2 || total == 3) || currentLine[y] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkBottomRightCorner() {
        int[] bottomRow = lightGrid[size - 1];
        int[] aboveRow = lightGrid[size - 2];
        int total = bottomRow[size - 2] + aboveRow[size - 2] + aboveRow[size - 1];
        if(bottomRow[size - 1] == 1 && (total == 2 || total == 3) || bottomRow[size - 1] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkBottomLeftCorner() {
        int[] currentRow = lightGrid[size - 1];
        int[] aboveRow = lightGrid[size - 2];
        int total = aboveRow[0] + aboveRow[1] + currentRow[1];
        if(currentRow[0] == 1 && (total == 2 || total == 3) || currentRow[size - 1] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkTopRightCorner() {
        int[] topRow = lightGrid[0];
        int[] belowRow = lightGrid[1];
        int total = topRow[size - 2] + belowRow[size - 1] + belowRow[size - 2];
        if(topRow[size - 1] == 1 && (total == 2 || total == 3) || topRow[size - 1] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int checkTopLeftCorner() {
        int[] topRow = lightGrid[0];
        int[] belowRow = lightGrid[1];
        int total = topRow[1] + belowRow[0] + belowRow[1];
        if(topRow[0] == 1 && (total == 2 || total == 3) || topRow[0] == 0 && total == 3) {
            return 1;
        }
        return 0;
    }

    private int getTotalLit() {
        int total = 0;
        for(int x = 0; x < lightGrid.length; x++) {
            for (int i : lightGrid[x]) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        adventOfCodeDayEighteen.setup(input);
        System.out.println(adventOfCodeDayEighteen.animate(100));

        adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        adventOfCodeDayEighteen.setup(inputTwo);
        System.out.println(adventOfCodeDayEighteen.animatePartTwo(100));
    }

    private static final String input = "#...##......#......##.##..#...##......##.#.#.###.#.#..#..#......####..#......###.#.#....#..##..###..\n" +
                                        "####..#.#...#....#.#####.##.##.#..#.......#....#.##...###.###..#.#.#........#..#.#.##...##..#.####.#\n" +
                                        "...#..##...#.#.###.#.###..#.##.####.###...#...........#.###..##.#.##.#.###...#.#..###....#.###.#..#.\n" +
                                        ".#...##...####.#..#.....#..#...#.#.##...#...##..#.#.###....#..###.....##..#.###..###.....##..###...#\n" +
                                        "..##.#####....##..#.#..##.##..######...#..###.######.....#..##...#.#..##..##..#..#..#..##.#.#.#.#...\n" +
                                        ".###.###.###...##...##..###..##.###.#.....##..##.#.#########...##..##.#..##.#..##..####..#.#.#.#####\n" +
                                        "#.#####..###.###.##.##.#...#.#.#.#..#.###...#..##.###.#...####.#..#.#.....###..#..####..#.#.#...##..\n" +
                                        "....#...##.....#....####.##.#.###..#.#.##..#.#...##.###.###..#.##..#.#.##..##..#.##.###..#.#.###.###\n" +
                                        "##.##...#.##...#.#..#.#..#...###...###.#..#..#.#####..###.#......#.....###.#####.#.#..#.#.#.##..#.#.\n" +
                                        "#.#..#.....#.....##.#..##...###..##...##...###.#.###.#..#.#.###...##..##..#.###...#.#######.#...#.#.\n" +
                                        "#.#.....####.#..#.##...#.##....#####.###.#.....#####....###..#........##..####...#...#.###....#..###\n" +
                                        "##.#.##..#.#.##.#.....##.#.....###.####.#..######.....####.#.#..##.#.##...#..#.#.....#.####.#.......\n" +
                                        "#..#..#.#..#.######.##..##.####.....##.#.##.#.######..#.#....#.#...#.#..#..#.#.###.#..#.#.#..#...###\n" +
                                        "####..####.#.#.###.....#.#.#.##..#.##.##.##.#..##..##.#.##.....#.#..#.####.....###.#..#.####.#.#..##\n" +
                                        "###.##..##.#.##..#..##...#.#####.##.#....##.####.#.##....#..###.#.#.##...#.....#.#.#.#.#..##.#.#..#.\n" +
                                        "......#..####...##.##...#.##.##...##..#..##.###..#...#..##...#.#....###.####...#.##.###.#.##.####.##\n" +
                                        "..#...#####.#.#..#.##....#..#...#..####.....###...##.###....#..#.###...#........#.#.##..#..#.#.....#\n" +
                                        "#######.#.#.###.###..######.##..#####.##.###.###....####.#..##.##...###.#..############.#.##....##.#\n" +
                                        "#.#...##.###.#.###..#.#.#.#.#.#..##..####.#..##.....#.##..#.##...##.#..##..#.#.#....##....##.#..#.#.\n" +
                                        "..#.#.####.....###..#######.#.#.#.#...##.#####.....##...##...##.###..######.###..#...####.#..###.###\n" +
                                        ".#.##....#.#.##..##.#.##.##..######...#.....#..#.#.#.#.....#.#..##.#.#.......#######....#.......#...\n" +
                                        "..###.##.##..##....#.###...#.....##..##......###...##..###.##...##.###.#.#.#.###.###.#.#...###..#...\n" +
                                        ".##.#.#...#...##.#.#...#..#..#.#...##.#.##...##..#....#.#..##.#..#.#..#.#.....#..#.#...#######.#.##.\n" +
                                        "...####....#.###.#..###..##...##..#.#.#.###...#..##.##.##..##.#...#..#.##.....#.#........#..#.#.####\n" +
                                        ".....##..###...#....#.#.#.#...###.###...#.#...#.#.####....#..####...###..#..######..##.##..###.#####\n" +
                                        "#####.##..#....###.###....##.....#.#..#....#.#####.##.#.####.#.##...#..###...###..##...#.###.#####..\n" +
                                        "###.##..........########.######....####.###.#..##...#.##.####.#.....##..#####..###...#####.....#.#.#\n" +
                                        "##..#####.##.#.#####.#.##.##..#.##....########.#####.#...#.###.##...#.###.#.#..#....##.#..#...#.#.#.\n" +
                                        ".##.#....#..#...#..#####..#..##.#......#..#....########...#..#...#.....####.#...##...#.###.#.#..##.#\n" +
                                        ".##.##.#.##.#.##...#.#.#..##.##.###.#..##..#...###.##.###.#####.#.###..#..###.#...#.###.#...#..#.#.#\n" +
                                        ".#..#..#.#..#..###..#....###.####.##.#.###.#.##.###.#.##.###.###...###...###.#...####...#.##.##.#.#.\n" +
                                        "###..##...###...#..##.#..#.#...##....###.##.##..#####....###..#..#....#..###.###.#...#.##...#.#.#..#\n" +
                                        "#....#.......##.....#.##...#..#.###.#.##..##..#.##..#.###..##.##...#####.#..#####..#####..#####....#\n" +
                                        ".####.####....###..###.#.##.####.##.#...####.#.###.#.....#...####..#####.###..#.#.###.##.##...##..#.\n" +
                                        "####..##...##.########...##..###..#..###.##.#.#.#........#.#####.#...#.###.####.#..####..#.#.#....##\n" +
                                        "###.#..#...###.#..#..#.###...##..###.##.#.#...#..#...####..##....#.#..#..##.#.#...#####.###.#..#.#.#\n" +
                                        "...##....#.###.#.#..##...##.###.#..#..#......#...#.#..####.#.##..######.####.#...#..#..#..##.#.#.##.\n" +
                                        "##.####.#...#..#.#.##..##.#.#.###..##...####......#..######.#......#.##.#....##...###.#.#..#......##\n" +
                                        "#.....#...#######.##.#..#.#...###.#..#.####....#.#.##.#.##...###..#...#.###.##..#.###..#.##...#####.\n" +
                                        "#####.##...#..#.#.#.......#.##..#####..#####...###..##.#.#..###.#.#####.####..#.#..##...#.##...#.###\n" +
                                        ".##.#..#######.###.#.####.....##...#.##.#.#..#...##....####......######.#..######.....##########.##.\n" +
                                        "##...#.#..#.##.###.#.#.#.##.###.##..##.##.##...#.#..###.#######..#.....#####..#....######.#..##..###\n" +
                                        ".#.#.###.....#..##..#.#..##..#.###...###.#..##...#...#.#####.#.#####..###.#..#...##..#.#..#..####...\n" +
                                        ".#......##..#.....####.###....##.###.....###.##........#.###.##..#..#.#######.#.######..##..###.....\n" +
                                        "..##.#.#..#.##...#.###.###...######..#..#.#..#....###.#.#....#..........#...##.##.##.#..##..#.#####.\n" +
                                        "###.###.#..#.##..##.#..#..##.....##.....#..#######.#..#.#.#.####.###..###.#.#..#.##.##.####.###.####\n" +
                                        "#.#.#..#....########.#..#..#...##..#.##..#.#..##..####...##.....#.##.#.#...########..#.###.#..#.#.##\n" +
                                        ".##.....#...#.#...##.##....###...##..#.####...#..#.#..#..#.##..#.###.##.####.##..####.....##.#.....#\n" +
                                        "....####.#.##.#.##.#..##.#.######.##.####..#...####.#..###.#.#..#..##.#.#.....##.#####.#.####...#.#.\n" +
                                        "#..#####.#####.....##....######..##....#..#.#.###.#####.....##.##.####.#...##...#.##.#.#####.##.#...\n" +
                                        "##.####..###.#....#...#.#.#.#.###.#####.#.####..####...####......##..#..#..#.#.##...########....#...\n" +
                                        ".###.#.#.#.#..####.##.#..######..#.#.###.....#.#......#.#.#.#..####.##...##.#####.#.##..##..#..#.#..\n" +
                                        ".....###...#...#.####.###.#.#.#.#.....#....#.####.###.##.##.##.#######......#.####......#....##.....\n" +
                                        "##..#..#.#.##..#...#..##.##.##..###.#....##.##....####.#.##.###....#.##.#.#.##...##.###...#..#..####\n" +
                                        "...#.#..##..##.#...##.##...#.#......#.#.##..###....####.##...#.#.###.#..#..#.####..##..##..#####.###\n" +
                                        ".##.##..##########.##...#.##.####.#.#######.##.#.##.##..#...##....########.###..##.##.##.#..##.#.#.#\n" +
                                        "#####.#....#.##..#.....#......##.##..#.##.###..##.......###..##.#.###.##.###....####.#..#.###..#.#.#\n" +
                                        ".#...#..#.##....##....#...####....#...#..#...####...########.###.#..##.#.#.##..###..#.#.###.....##.#\n" +
                                        "##..##.....###......#..###.##.####.##.####.#.#....#..#...#..#.#..#.###.#...#...#..##.##...#..#######\n" +
                                        ".....##..###..##...#####.#.#.....###.#.#..####...#.#.#..#..####..##.#..###.####.#....##..###....#..#\n" +
                                        "#.#.##.#....#.#####.#....##...#...##...##....#.#.......#....#..#...###.###.#.####..####....#.##.#.#.\n" +
                                        "..##...##..###.#.#.##.#..#....#.#.....##.###.#.###.###.....#...#.#..#######.#####..#.###...##......#\n" +
                                        "#......###..#....#.#..#.###.##.#...##..###.####.#.#....#.##..#.###..##.#..#####..##.###.....#..###..\n" +
                                        "##.#.##..##.###.#..##.....#.##.....###....##.####.######.#...#..###....#.#...#.##.....###....#..#.#.\n" +
                                        ".##.#.#.#.##..#.#.#..##..#.###.####....#..###.######..####.#.....###.##..#...###.#..######.##.#.##..\n" +
                                        "...##.####.#..##.#####.##.#...##..#..#...#.#.#.#####...#....#..###...#..#....#.#.##.#.######.#..####\n" +
                                        "..#.#.#.#...#.######.#.....#..#.#..###....#.#.########...#....#.#.##..#...##...#.#..#.#.###....##...\n" +
                                        "#####..#..##..#..##..#..#.#.##.#....#####.####.##.#.###..##..##....#.....#.#####.#...#.#####.##.#.#.\n" +
                                        "#.#..#####...####.###.###.....####.###.....##...##...#..#..#######.#.##....##..####.....##...#..#..#\n" +
                                        "#.#.###.#.#..##..#....#.#...#.#.##.##..#.##.....##...#.#..##.......##.#.###..#####.#.##....#.##.....\n" +
                                        "...#.......#....#.#.####.#.###.###..#....#..##.#..####........#.##..#...#.#...###.#..#.#.#...#...#..\n" +
                                        "...##.#####.##.#.###.##.##.#.##..##.#.#.#.#.#.##.#..##...##.#.#..#..##.##.#####.#.###...#####..#..#.\n" +
                                        "#######.#..#..#....##.#.#..####.#..#..###...#..#.......###.#.#.####....#.###...#.#.###.#.#.#.#..###.\n" +
                                        "..##.##.#.##.###....###.##.#.###.#...#....#.####..###..###.#.#..#...##.#.#.#..##.###..###.#.##...###\n" +
                                        "######..######..##..##.#.#.##.##.#..##..#.#.#.##..#.#...#...#.#.#..######.#..#.#.######..#......##.#\n" +
                                        "#.#####.....#.......#########..###.##...#...##.#.#..#...#####...#...#..#.###.#..#.#...###.#.#.#...#.\n" +
                                        "#....##....###...##.##.#...##.........##.#.#..#.#.##.#.######.#####..#..###.###.#...#.#.##.######...\n" +
                                        "#.#...###.#.###.##.#.######.#######.###.##..#.#.#...######.##.####.##..#.#.#.#......##..##.........#\n" +
                                        "..###..##....#.....##...#.#.###.#.#.....##.#...###.####.#...#...##..##.#.#.####..###...######....#.#\n" +
                                        "..###.#.##.####.#..#.##....##..#####....#..##.##.#..#######...#.####...##.#.#.##.........#....#....#\n" +
                                        ".##.#...#.####..#.#...#.##..######.##..##.#.###.##..###.###....##..#.##.##..##.#...###.##.##.###....\n" +
                                        "#...###.###.#..#....#.......#..#.....###..#.###.##.##....#.####.#.####.##..##..#..#.....#....##.#.#.\n" +
                                        ".##.#..#..#.##.......#.####.#######.....#.##.##.#.....#.#..#....######.#..###.##.##.....#.####..##.#\n" +
                                        "###..#.###.#..####.....##....#..####....#.##.##..#...######.#########...#.#....##...###.#..#.##...#.\n" +
                                        "#..###..##..#.#.##.###.#.#.##...###.#...##.##..#.###....###..#.#...#.###..######.#..#.###..#..#..#.#\n" +
                                        ".#........##.#.###..###.#.#.##.....##.##.#.#...##..#.##....###..#.#.#.#.##....#.##..#.#...###...#...\n" +
                                        "####.####..#....#.#.#..#..##.......##.####...###.##..#.#.##.#..##..######.......##.#.##..#...#.....#\n" +
                                        "..#..#..###..##.##..######.#..###..###.#.##..##.#..#####.#.#.#.##..#.##..##.##......####.#..........\n" +
                                        "...##.##..###.#...###....#.#.#.#.....#.##.....##...#...#......####...##.##....##.#..#.####.#..###.#.\n" +
                                        "..#.....####.#.###.#####..#..###..#..#.#...#####...###.###....#.###..#...#..#..#.#..#.##..##.#.#....\n" +
                                        "..##.#####...###.###.........#....##.####.##..#.#..#.#...#...##.##.##..#.#.##.########......#####...\n" +
                                        "...###.#.#..#...#.###.###.......##.###.#..#.##########...#..#.#.#.##.#.###...######..#.#...###.##...\n" +
                                        ".#.#.#######.#..##.##..##...#...####...#..#####.#..##...###.#.#...#.##...#......#..##.####..#.....##\n" +
                                        ".##.##.#.#......#######..###.....##.#.##..###......#....####...#.###.#.##.#........#..#....##.....##\n" +
                                        "#...#.###.#.##...##.####....#...#.###..#.#.....#.#....#.#.#.##...#.#..#####.#.#..#..#..#....#...####\n" +
                                        ".....##...###......#####..##.##.##...##.#.#####..##...#.#.#.#.###...###.##.####..#.#..#.#..#.####.##\n" +
                                        "#..#..##.#.##.#.##.#.#.#..###....###.##.#.##.#...#.#..#...#....###.#..#.#.######.#...####..#..##.#.#\n" +
                                        "#..#.#..#...###.#..##.#...#...##.#......#...#..#..####..##.....#.###...#.#..#.#....#.#####.##.###...\n" +
                                        "###....#.#..#.#..###..#.##......#...#..#..##.#..###..##..#..#.####..#...########..##.#.##.#.#.#...#.\n" +
                                        ".#.#.##.##.###..#...#.#....#..#.##..#.#.#.#.##.##.#####...#........####..###..####.#####..#.##.#.##.";

    private static final String inputTwo =  "#...##......#......##.##..#...##......##.#.#.###.#.#..#..#......####..#......###.#.#....#..##..###.#\n" +
                                            "####..#.#...#....#.#####.##.##.#..#.......#....#.##...###.###..#.#.#........#..#.#.##...##..#.####.#\n" +
                                            "...#..##...#.#.###.#.###..#.##.####.###...#...........#.###..##.#.##.#.###...#.#..###....#.###.#..#.\n" +
                                            ".#...##...####.#..#.....#..#...#.#.##...#...##..#.#.###....#..###.....##..#.###..###.....##..###...#\n" +
                                            "..##.#####....##..#.#..##.##..######...#..###.######.....#..##...#.#..##..##..#..#..#..##.#.#.#.#...\n" +
                                            ".###.###.###...##...##..###..##.###.#.....##..##.#.#########...##..##.#..##.#..##..####..#.#.#.#####\n" +
                                            "#.#####..###.###.##.##.#...#.#.#.#..#.###...#..##.###.#...####.#..#.#.....###..#..####..#.#.#...##..\n" +
                                            "....#...##.....#....####.##.#.###..#.#.##..#.#...##.###.###..#.##..#.#.##..##..#.##.###..#.#.###.###\n" +
                                            "##.##...#.##...#.#..#.#..#...###...###.#..#..#.#####..###.#......#.....###.#####.#.#..#.#.#.##..#.#.\n" +
                                            "#.#..#.....#.....##.#..##...###..##...##...###.#.###.#..#.#.###...##..##..#.###...#.#######.#...#.#.\n" +
                                            "#.#.....####.#..#.##...#.##....#####.###.#.....#####....###..#........##..####...#...#.###....#..###\n" +
                                            "##.#.##..#.#.##.#.....##.#.....###.####.#..######.....####.#.#..##.#.##...#..#.#.....#.####.#.......\n" +
                                            "#..#..#.#..#.######.##..##.####.....##.#.##.#.######..#.#....#.#...#.#..#..#.#.###.#..#.#.#..#...###\n" +
                                            "####..####.#.#.###.....#.#.#.##..#.##.##.##.#..##..##.#.##.....#.#..#.####.....###.#..#.####.#.#..##\n" +
                                            "###.##..##.#.##..#..##...#.#####.##.#....##.####.#.##....#..###.#.#.##...#.....#.#.#.#.#..##.#.#..#.\n" +
                                            "......#..####...##.##...#.##.##...##..#..##.###..#...#..##...#.#....###.####...#.##.###.#.##.####.##\n" +
                                            "..#...#####.#.#..#.##....#..#...#..####.....###...##.###....#..#.###...#........#.#.##..#..#.#.....#\n" +
                                            "#######.#.#.###.###..######.##..#####.##.###.###....####.#..##.##...###.#..############.#.##....##.#\n" +
                                            "#.#...##.###.#.###..#.#.#.#.#.#..##..####.#..##.....#.##..#.##...##.#..##..#.#.#....##....##.#..#.#.\n" +
                                            "..#.#.####.....###..#######.#.#.#.#...##.#####.....##...##...##.###..######.###..#...####.#..###.###\n" +
                                            ".#.##....#.#.##..##.#.##.##..######...#.....#..#.#.#.#.....#.#..##.#.#.......#######....#.......#...\n" +
                                            "..###.##.##..##....#.###...#.....##..##......###...##..###.##...##.###.#.#.#.###.###.#.#...###..#...\n" +
                                            ".##.#.#...#...##.#.#...#..#..#.#...##.#.##...##..#....#.#..##.#..#.#..#.#.....#..#.#...#######.#.##.\n" +
                                            "...####....#.###.#..###..##...##..#.#.#.###...#..##.##.##..##.#...#..#.##.....#.#........#..#.#.####\n" +
                                            ".....##..###...#....#.#.#.#...###.###...#.#...#.#.####....#..####...###..#..######..##.##..###.#####\n" +
                                            "#####.##..#....###.###....##.....#.#..#....#.#####.##.#.####.#.##...#..###...###..##...#.###.#####..\n" +
                                            "###.##..........########.######....####.###.#..##...#.##.####.#.....##..#####..###...#####.....#.#.#\n" +
                                            "##..#####.##.#.#####.#.##.##..#.##....########.#####.#...#.###.##...#.###.#.#..#....##.#..#...#.#.#.\n" +
                                            ".##.#....#..#...#..#####..#..##.#......#..#....########...#..#...#.....####.#...##...#.###.#.#..##.#\n" +
                                            ".##.##.#.##.#.##...#.#.#..##.##.###.#..##..#...###.##.###.#####.#.###..#..###.#...#.###.#...#..#.#.#\n" +
                                            ".#..#..#.#..#..###..#....###.####.##.#.###.#.##.###.#.##.###.###...###...###.#...####...#.##.##.#.#.\n" +
                                            "###..##...###...#..##.#..#.#...##....###.##.##..#####....###..#..#....#..###.###.#...#.##...#.#.#..#\n" +
                                            "#....#.......##.....#.##...#..#.###.#.##..##..#.##..#.###..##.##...#####.#..#####..#####..#####....#\n" +
                                            ".####.####....###..###.#.##.####.##.#...####.#.###.#.....#...####..#####.###..#.#.###.##.##...##..#.\n" +
                                            "####..##...##.########...##..###..#..###.##.#.#.#........#.#####.#...#.###.####.#..####..#.#.#....##\n" +
                                            "###.#..#...###.#..#..#.###...##..###.##.#.#...#..#...####..##....#.#..#..##.#.#...#####.###.#..#.#.#\n" +
                                            "...##....#.###.#.#..##...##.###.#..#..#......#...#.#..####.#.##..######.####.#...#..#..#..##.#.#.##.\n" +
                                            "##.####.#...#..#.#.##..##.#.#.###..##...####......#..######.#......#.##.#....##...###.#.#..#......##\n" +
                                            "#.....#...#######.##.#..#.#...###.#..#.####....#.#.##.#.##...###..#...#.###.##..#.###..#.##...#####.\n" +
                                            "#####.##...#..#.#.#.......#.##..#####..#####...###..##.#.#..###.#.#####.####..#.#..##...#.##...#.###\n" +
                                            ".##.#..#######.###.#.####.....##...#.##.#.#..#...##....####......######.#..######.....##########.##.\n" +
                                            "##...#.#..#.##.###.#.#.#.##.###.##..##.##.##...#.#..###.#######..#.....#####..#....######.#..##..###\n" +
                                            ".#.#.###.....#..##..#.#..##..#.###...###.#..##...#...#.#####.#.#####..###.#..#...##..#.#..#..####...\n" +
                                            ".#......##..#.....####.###....##.###.....###.##........#.###.##..#..#.#######.#.######..##..###.....\n" +
                                            "..##.#.#..#.##...#.###.###...######..#..#.#..#....###.#.#....#..........#...##.##.##.#..##..#.#####.\n" +
                                            "###.###.#..#.##..##.#..#..##.....##.....#..#######.#..#.#.#.####.###..###.#.#..#.##.##.####.###.####\n" +
                                            "#.#.#..#....########.#..#..#...##..#.##..#.#..##..####...##.....#.##.#.#...########..#.###.#..#.#.##\n" +
                                            ".##.....#...#.#...##.##....###...##..#.####...#..#.#..#..#.##..#.###.##.####.##..####.....##.#.....#\n" +
                                            "....####.#.##.#.##.#..##.#.######.##.####..#...####.#..###.#.#..#..##.#.#.....##.#####.#.####...#.#.\n" +
                                            "#..#####.#####.....##....######..##....#..#.#.###.#####.....##.##.####.#...##...#.##.#.#####.##.#...\n" +
                                            "##.####..###.#....#...#.#.#.#.###.#####.#.####..####...####......##..#..#..#.#.##...########....#...\n" +
                                            ".###.#.#.#.#..####.##.#..######..#.#.###.....#.#......#.#.#.#..####.##...##.#####.#.##..##..#..#.#..\n" +
                                            ".....###...#...#.####.###.#.#.#.#.....#....#.####.###.##.##.##.#######......#.####......#....##.....\n" +
                                            "##..#..#.#.##..#...#..##.##.##..###.#....##.##....####.#.##.###....#.##.#.#.##...##.###...#..#..####\n" +
                                            "...#.#..##..##.#...##.##...#.#......#.#.##..###....####.##...#.#.###.#..#..#.####..##..##..#####.###\n" +
                                            ".##.##..##########.##...#.##.####.#.#######.##.#.##.##..#...##....########.###..##.##.##.#..##.#.#.#\n" +
                                            "#####.#....#.##..#.....#......##.##..#.##.###..##.......###..##.#.###.##.###....####.#..#.###..#.#.#\n" +
                                            ".#...#..#.##....##....#...####....#...#..#...####...########.###.#..##.#.#.##..###..#.#.###.....##.#\n" +
                                            "##..##.....###......#..###.##.####.##.####.#.#....#..#...#..#.#..#.###.#...#...#..##.##...#..#######\n" +
                                            ".....##..###..##...#####.#.#.....###.#.#..####...#.#.#..#..####..##.#..###.####.#....##..###....#..#\n" +
                                            "#.#.##.#....#.#####.#....##...#...##...##....#.#.......#....#..#...###.###.#.####..####....#.##.#.#.\n" +
                                            "..##...##..###.#.#.##.#..#....#.#.....##.###.#.###.###.....#...#.#..#######.#####..#.###...##......#\n" +
                                            "#......###..#....#.#..#.###.##.#...##..###.####.#.#....#.##..#.###..##.#..#####..##.###.....#..###..\n" +
                                            "##.#.##..##.###.#..##.....#.##.....###....##.####.######.#...#..###....#.#...#.##.....###....#..#.#.\n" +
                                            ".##.#.#.#.##..#.#.#..##..#.###.####....#..###.######..####.#.....###.##..#...###.#..######.##.#.##..\n" +
                                            "...##.####.#..##.#####.##.#...##..#..#...#.#.#.#####...#....#..###...#..#....#.#.##.#.######.#..####\n" +
                                            "..#.#.#.#...#.######.#.....#..#.#..###....#.#.########...#....#.#.##..#...##...#.#..#.#.###....##...\n" +
                                            "#####..#..##..#..##..#..#.#.##.#....#####.####.##.#.###..##..##....#.....#.#####.#...#.#####.##.#.#.\n" +
                                            "#.#..#####...####.###.###.....####.###.....##...##...#..#..#######.#.##....##..####.....##...#..#..#\n" +
                                            "#.#.###.#.#..##..#....#.#...#.#.##.##..#.##.....##...#.#..##.......##.#.###..#####.#.##....#.##.....\n" +
                                            "...#.......#....#.#.####.#.###.###..#....#..##.#..####........#.##..#...#.#...###.#..#.#.#...#...#..\n" +
                                            "...##.#####.##.#.###.##.##.#.##..##.#.#.#.#.#.##.#..##...##.#.#..#..##.##.#####.#.###...#####..#..#.\n" +
                                            "#######.#..#..#....##.#.#..####.#..#..###...#..#.......###.#.#.####....#.###...#.#.###.#.#.#.#..###.\n" +
                                            "..##.##.#.##.###....###.##.#.###.#...#....#.####..###..###.#.#..#...##.#.#.#..##.###..###.#.##...###\n" +
                                            "######..######..##..##.#.#.##.##.#..##..#.#.#.##..#.#...#...#.#.#..######.#..#.#.######..#......##.#\n" +
                                            "#.#####.....#.......#########..###.##...#...##.#.#..#...#####...#...#..#.###.#..#.#...###.#.#.#...#.\n" +
                                            "#....##....###...##.##.#...##.........##.#.#..#.#.##.#.######.#####..#..###.###.#...#.#.##.######...\n" +
                                            "#.#...###.#.###.##.#.######.#######.###.##..#.#.#...######.##.####.##..#.#.#.#......##..##.........#\n" +
                                            "..###..##....#.....##...#.#.###.#.#.....##.#...###.####.#...#...##..##.#.#.####..###...######....#.#\n" +
                                            "..###.#.##.####.#..#.##....##..#####....#..##.##.#..#######...#.####...##.#.#.##.........#....#....#\n" +
                                            ".##.#...#.####..#.#...#.##..######.##..##.#.###.##..###.###....##..#.##.##..##.#...###.##.##.###....\n" +
                                            "#...###.###.#..#....#.......#..#.....###..#.###.##.##....#.####.#.####.##..##..#..#.....#....##.#.#.\n" +
                                            ".##.#..#..#.##.......#.####.#######.....#.##.##.#.....#.#..#....######.#..###.##.##.....#.####..##.#\n" +
                                            "###..#.###.#..####.....##....#..####....#.##.##..#...######.#########...#.#....##...###.#..#.##...#.\n" +
                                            "#..###..##..#.#.##.###.#.#.##...###.#...##.##..#.###....###..#.#...#.###..######.#..#.###..#..#..#.#\n" +
                                            ".#........##.#.###..###.#.#.##.....##.##.#.#...##..#.##....###..#.#.#.#.##....#.##..#.#...###...#...\n" +
                                            "####.####..#....#.#.#..#..##.......##.####...###.##..#.#.##.#..##..######.......##.#.##..#...#.....#\n" +
                                            "..#..#..###..##.##..######.#..###..###.#.##..##.#..#####.#.#.#.##..#.##..##.##......####.#..........\n" +
                                            "...##.##..###.#...###....#.#.#.#.....#.##.....##...#...#......####...##.##....##.#..#.####.#..###.#.\n" +
                                            "..#.....####.#.###.#####..#..###..#..#.#...#####...###.###....#.###..#...#..#..#.#..#.##..##.#.#....\n" +
                                            "..##.#####...###.###.........#....##.####.##..#.#..#.#...#...##.##.##..#.#.##.########......#####...\n" +
                                            "...###.#.#..#...#.###.###.......##.###.#..#.##########...#..#.#.#.##.#.###...######..#.#...###.##...\n" +
                                            ".#.#.#######.#..##.##..##...#...####...#..#####.#..##...###.#.#...#.##...#......#..##.####..#.....##\n" +
                                            ".##.##.#.#......#######..###.....##.#.##..###......#....####...#.###.#.##.#........#..#....##.....##\n" +
                                            "#...#.###.#.##...##.####....#...#.###..#.#.....#.#....#.#.#.##...#.#..#####.#.#..#..#..#....#...####\n" +
                                            ".....##...###......#####..##.##.##...##.#.#####..##...#.#.#.#.###...###.##.####..#.#..#.#..#.####.##\n" +
                                            "#..#..##.#.##.#.##.#.#.#..###....###.##.#.##.#...#.#..#...#....###.#..#.#.######.#...####..#..##.#.#\n" +
                                            "#..#.#..#...###.#..##.#...#...##.#......#...#..#..####..##.....#.###...#.#..#.#....#.#####.##.###...\n" +
                                            "###....#.#..#.#..###..#.##......#...#..#..##.#..###..##..#..#.####..#...########..##.#.##.#.#.#...#.\n" +
                                            "##.#.##.##.###..#...#.#....#..#.##..#.#.#.#.##.##.#####...#........####..###..####.#####..#.##.#.###";
}
