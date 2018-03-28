package AdventOfCode2017;

public class AdventOfCodeDayTwentyTwo {

    private String[][] grid;

    private int carrierXPosition;
    private int carrierYPosition;

    private boolean facingUp = true;
    private boolean facingRight = false;
    private boolean facingDown = false;
    private boolean facingLeft = false;

    private int infectedCount = 0;

    public void setUp(String input, int height, int length) {
        String[] values = input.split("\n");

        grid = new String[height][length];

        insertDefaultValues(height, length);

        int verticalCenter = height / 2;
        int horizontalCenter = length / 2;

        int infectVerticalLength = values.length;
        int infectedHorizontalLength = values[0].length();

        int infectedVerticalCenter = Math.abs(infectVerticalLength / 2);
        int infectedHorizontalCenter = Math.abs(infectedHorizontalLength / 2);

        int infectedVerticalStartPoint = verticalCenter - infectedVerticalCenter;
        int infectedHorizontalStartPoint = horizontalCenter - infectedHorizontalCenter;

        carrierYPosition = infectedVerticalCenter + infectedVerticalStartPoint;
        carrierXPosition = infectedHorizontalCenter + infectedHorizontalStartPoint;

        int infectedHorizontalEndPoint = infectedHorizontalStartPoint + infectedHorizontalLength;
        int infectedVerticalEndPoint = infectedVerticalStartPoint + infectVerticalLength;

        int valueRow = 0;
        int valueColumn = 0;

        for(int y = infectedVerticalStartPoint; y < infectedHorizontalEndPoint; y++) {
            for(int x = infectedHorizontalStartPoint; x < infectedVerticalEndPoint; x++) {
                grid[y][x] = values[valueRow].split("")[valueColumn];
                valueColumn++;
            }
            valueRow++;
            valueColumn = 0;
        }
    }

    private void insertDefaultValues(int x, int y) {
        for(int column = 0; column < x; column++) {
            for(int row = 0; row < y; row++) {
                grid[column][row] = ".";
            }
        }
    }

    public void infect() {
        String currentValue = grid[carrierXPosition][carrierYPosition];

        if(currentValue.equals(".")) {
            grid[carrierXPosition][carrierYPosition] = "#";
            turnUninfected();
            infectedCount++;
        }
        else if(currentValue.equals("#")) {
            grid[carrierXPosition][carrierYPosition] = ".";
            turnInfected();
        }
        move();
        //printGrid();
    }

    private void infectPartTwo() {

        String currentValue = grid[carrierXPosition][carrierYPosition];

        if (currentValue.equals(".")) {
            grid[carrierXPosition][carrierYPosition] = "W";
            turnUninfected();
        } else if (currentValue.equals("#")) {
            grid[carrierXPosition][carrierYPosition] = "F";
            turnInfected();
        } else if(currentValue.equals("F")) {
            grid[carrierXPosition][carrierYPosition] = ".";
            turnUninfected();
            turnUninfected();
        } else if(currentValue.equals("W")) {
            grid[carrierXPosition][carrierYPosition] = "#";
        }
        move();
    }

    public int getInfectionCount() {
        int i = 0;
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                if(grid[x][y].equals("#") || grid[x][y].equals("W")) {
                    i++;
                }
            }
        }
        return i;
    }

    public int returnRunningInfectedCount() {
        return infectedCount;
    }

    //method for testing purposes
    public int step(int numberOfSteps) {
        for(int i = 0; i < numberOfSteps; i++) {
            infect();
        }
        return getInfectionCount();
    }

    public int stepPartTwo(int numberOfSteps) {
        for(int i = 0; i < numberOfSteps; i++) {
            infectPartTwo();
        }
        return getInfectionCount();
    }

    private void turnUninfected() {
        if(facingUp) {
            facingUp = false;
            facingLeft = true;
        } else if(facingLeft) {
            facingLeft = false;
            facingDown = true;
        } else if (facingDown) {
            facingDown = false;
            facingRight = true;
        } else if(facingRight) {
            facingRight = false;
            facingUp = true;
        }
    }

    private void turnInfected() {
        if(facingUp) {
            facingUp = false;
            facingRight = true;
        } else if(facingLeft) {
            facingLeft = false;
            facingUp = true;
        } else if (facingDown) {
            facingDown = false;
            facingLeft = true;
        } else if(facingRight) {
            facingRight = false;
            facingDown = true;
        }
    }

    private void move() {
        if(facingUp) {
            carrierXPosition--;
        } else if(facingLeft) {
            carrierYPosition--;
        } if(facingDown) {
            carrierXPosition++;
        } else if(facingRight) {
            carrierYPosition++;
        }
    }

    public void printGrid() {
        String s = "";
        for(int x = 0; x < grid.length; x++) {
            for(int y = 0; y < grid[x].length; y++) {
                if(x == carrierXPosition && y == carrierYPosition) {
                    s+= "[" + grid[x][y] + "]";
                } else {
                    s += " " + grid[x][y] + " ";
                }
            }
            s += "\n";
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwentyTwo adventOfCodeDayTwentyTwo = new AdventOfCodeDayTwentyTwo();

        adventOfCodeDayTwentyTwo.setUp(input, 10000, 10000);

        adventOfCodeDayTwentyTwo.stepPartTwo(100);
        adventOfCodeDayTwentyTwo.printGrid();

        int result = adventOfCodeDayTwentyTwo.returnRunningInfectedCount();

        System.out.println("infected count: " + result);
    }
    private static final String input = ".....###..#....#.#..##...\n" +
                                        "......##.##...........##.\n" +
                                        ".#..#..#.#.##.##.........\n" +
                                        "...#..###..##.#.###.#.#.#\n" +
                                        "##....#.##.#..####.####..\n" +
                                        "#..##...#.##.##.....##..#\n" +
                                        ".#.#......#...####...#.##\n" +
                                        "###....#######...#####.#.\n" +
                                        "##..#.####...#.#.##......\n" +
                                        "##.....###....#.#..#.##.#\n" +
                                        ".#..##.....#########.##..\n" +
                                        "##...##.###..#.#..#.#...#\n" +
                                        "...####..#...#.##.#..####\n" +
                                        ".#..##......#####..#.###.\n" +
                                        "...#.#.#..##...#####.....\n" +
                                        "#..###.###.#.....#.#.###.\n" +
                                        "##.##.#.#.##.#..#..######\n" +
                                        "####.##..#.###.#...#..###\n" +
                                        ".........#####.##.###..##\n" +
                                        "..#.##.#..#..#...##..#...\n" +
                                        "###.###.#.#..##...###....\n" +
                                        "##..#.#.#.#.#.#.#...###..\n" +
                                        "#..#.#.....#..#..#..##...\n" +
                                        "........#######.#...#.#..\n" +
                                        "..##.###.#.##.#.#.###..##";
}
