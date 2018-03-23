package AdcentOfCode2017;

public class AdventOfCodeDayEleven {

    //    ne,ne,ne is 3 steps away.
    //    ne,ne,sw,sw is 0 steps away (back where you started).
    //    ne,ne,s,s is 2 steps away (se,se).
    //    se,sw,se,sw,sw is 3 steps away (s,s,sw)

    private int currentXPosition = 0;
    private int currentYPosition = 0;

    //calculate distance x -s from zero;
    private String previousCommand = "";

    private int totalDistance = 0;

    public int setEndPosition(String input) {

        String[] moves = getAllMoves(input);

        for (String step : moves) {
            if(step.equals("n")) {
                moveNorth(step);
            } else if(step.equals("s")) {
                moveSouth(step);
            } else if(step.equals("ne")) {
                moveNorthEast(step);
            } else if(step.equals("nw")) {
                moveNorthWest(step);
            } else if(step.equals("sw")) {
                moveSouthWest(step);
            } else if(step.equals("se")) {
                moveSouthEast(step);
            }
            System.out.println("move: " + step + " end positions x: " + currentXPosition + " y: " + currentYPosition);

        }
        return getDistance();
    }

    private int getDistance() {
        System.out.println("end x position: " + currentXPosition + " end y position: " + currentYPosition);
        if(currentXPosition == 0) {
            return Math.abs(currentYPosition);
        } else if(currentYPosition == 0) {
            return Math.abs(currentXPosition);
        } else {
            if(currentYPosition > 0 && currentXPosition > 0) {
                return getDistanceFromEndValuesBothPositiive();
            } else if (currentYPosition < 0 && currentXPosition < 0) {
                return getDistanceFromEndValuesBothNegative();
            } else if(currentXPosition < 0 && currentYPosition > 0) {
                return getDistanceFromEndValuesWhereXIsNegativeAndYIsPositive();
            } else if (currentXPosition > 0 && currentYPosition < 0) {
                return getDistanceFromEndValuesWhereXIsPositiveAndYIsNegative();
            }
        }
        return 0;
    }

    private int getDistanceFromEndValuesBothPositiive() {
        int steps = 0;

        while(currentXPosition != 0 || currentYPosition != 0) {
            if(currentXPosition > 0 && currentYPosition > 0) {
                currentXPosition--;
                currentYPosition--;
                steps++;
            } else if(currentXPosition == 0) {
                steps+= currentYPosition;
                break;
            } else if(currentYPosition == 0 ) {
                steps += currentXPosition;
                break;
            }
        }
        return steps;
    }

    private int getDistanceFromEndValuesBothNegative() {
        int steps = 0;

        while(currentXPosition != 0 || currentYPosition != 0) {
            if(currentXPosition < 0 && currentYPosition < 0) {
                currentXPosition++;
                currentYPosition++;
                steps++;
            } else if(currentXPosition == 0) {
                steps += Math.abs(currentYPosition);
                break;
            } else if(currentYPosition == 0) {
                steps += Math.abs(currentXPosition);
                break;
            }
        }
        return steps;
    }

    //x is negative y is positive
    private int getDistanceFromEndValuesWhereXIsNegativeAndYIsPositive() {
        int steps = 0;

        while(currentXPosition !=0 || currentYPosition !=0) {
            if(currentXPosition < 0 && currentYPosition > 0) {
                currentXPosition++;
                currentYPosition--;
                steps++;
            } else if(currentYPosition == 0) {
                steps += Math.abs(currentXPosition);
                break;
            } else if(currentXPosition == 0) {
                steps += Math.abs(currentYPosition);
                break;
            }
        }
        return steps;
    }

    //x is positive y is negative
    private int getDistanceFromEndValuesWhereXIsPositiveAndYIsNegative() {
        int steps = 0;

        while(currentXPosition !=0 || currentYPosition !=0) {

            if(currentXPosition > 0 && currentYPosition < 0) {
                currentXPosition--;
                currentYPosition++;
                steps++;
            } else if (currentXPosition == 0) {
                steps += Math.abs(currentYPosition);
                break;
            } else if(currentYPosition == 0) {
                steps += Math.abs(currentXPosition);
                break;
            }
        }
        return steps;
    }

    private void moveSouthEast(String step) {
        if(previousCommand.equals("sw")) {
            currentXPosition++;
        } else {
            currentXPosition++;
            currentYPosition--;
        }
        previousCommand = step;
    }

    private void moveSouthWest(String step) {
        if(previousCommand.equals("se")) {
            currentXPosition--;
        } else {
            currentXPosition--;
            currentYPosition--;
        }
        previousCommand = step;
    }

    private void moveNorthWest(String step) {
        if(previousCommand.equals("ne")) {
            currentXPosition--;
        } else {
            currentXPosition--;
            currentYPosition++;
        }
        previousCommand = step;
    }

    private void moveNorthEast(String step) {
        if(previousCommand.equals("nw")) {
            currentXPosition++;
        } else {
            currentXPosition++;
            currentYPosition++;
        }
        previousCommand = step;
    }

    private void moveSouth(String step) {
        currentYPosition--;
        previousCommand = step;
    }

    private void moveNorth(String step) {
        currentYPosition++;
        previousCommand = step;
    }

    private String[] getAllMoves(String input) {
        return input.split(",");
    }

    public static void main(String[] args) {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();

        adventOfCodeDayEleven.setEndPosition(input);

        System.out.println("distance from start: " + adventOfCodeDayEleven.getDistance());
    }

    private static final String input = "ne,nw,se,nw,ne,s,s,s,sw,ne,sw,sw,sw,sw,sw,nw,nw,sw,se,ne,nw,nw,nw,nw,nw,nw,n,n,s,nw,n,n,nw,n,n,n,n,ne,n,n,ne,n,n,s,n,se,ne,ne,ne,n,se,ne,ne,ne,ne,se,ne,ne,ne,ne,ne,ne,ne,sw,ne,ne,s,se,se,se,s,ne,ne,se,ne,ne,sw,ne,se,se,se,se,se,se,s,s,se,se,ne,se,se,se,se,ne,se,se,s,se,se,s,n,s,se,s,ne,se,se,nw,ne,s,n,s,se,se,s,se,se,se,s,sw,se,s,s,s,n,se,se,s,se,s,se,se,s,se,se,s,s,ne,s,s,se,n,s,s,s,s,sw,s,s,n,s,sw,n,s,s,s,s,s,sw,s,s,s,s,s,sw,s,se,ne,s,s,s,s,s,sw,s,sw,s,nw,sw,s,s,sw,sw,nw,s,sw,se,sw,sw,sw,s,se,s,sw,se,nw,sw,s,n,s,sw,n,sw,n,sw,sw,sw,nw,nw,sw,sw,sw,s,sw,s,sw,sw,sw,sw,sw,sw,sw,se,n,nw,s,se,sw,sw,se,sw,se,sw,nw,sw,s,sw,sw,sw,sw,s,s,sw,n,nw,nw,se,sw,nw,sw,sw,sw,nw,ne,s,sw,nw,n,nw,n,sw,nw,ne,n,n,sw,nw,sw,nw,nw,n,nw,nw,nw,se,nw,sw,se,nw,sw,nw,nw,nw,nw,sw,nw,n,sw,nw,nw,nw,nw,nw,nw,sw,nw,nw,sw,nw,sw,nw,sw,nw,sw,sw,nw,nw,nw,sw,nw,se,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,sw,se,nw,nw,nw,nw,nw,nw,n,nw,sw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,sw,s,ne,nw,nw,s,se,ne,nw,nw,nw,nw,nw,sw,nw,ne,se,nw,nw,nw,s,n,ne,n,nw,nw,n,s,nw,se,nw,s,sw,n,n,nw,n,nw,nw,nw,n,n,nw,n,nw,nw,n,ne,s,n,n,n,sw,nw,nw,ne,ne,n,nw,n,nw,n,n,se,nw,n,s,n,nw,n,n,nw,se,sw,nw,n,nw,n,n,sw,n,n,n,nw,n,nw,n,n,n,n,ne,n,n,nw,n,nw,n,n,n,nw,n,s,nw,n,n,se,sw,n,n,n,ne,se,n,n,se,s,n,n,n,nw,n,n,n,ne,n,n,n,n,n,s,n,n,n,n,n,n,n,n,n,ne,n,n,n,n,ne,n,ne,se,n,n,n,n,sw,sw,n,n,ne,n,n,n,sw,ne,n,n,s,ne,n,ne,n,ne,ne,n,s,nw,sw,n,n,ne,ne,n,n,n,n,n,n,nw,ne,n,n,n,n,ne,n,ne,ne,n,se,n,s,n,n,n,n,n,s,n,ne,n,n,ne,sw,ne,ne,ne,n,ne,nw,ne,n,n,n,se,n,se,ne,ne,ne,se,ne,n,n,ne,nw,n,n,n,ne,sw,n,ne,nw,nw,ne,ne,ne,ne,ne,sw,se,ne,ne,ne,ne,n,ne,n,n,sw,ne,nw,n,ne,ne,ne,ne,ne,sw,ne,n,ne,n,ne,nw,ne,ne,sw,ne,nw,nw,ne,ne,ne,ne,n,sw,se,ne,ne,ne,ne,ne,ne,ne,n,n,sw,ne,ne,se,n,ne,sw,ne,ne,ne,n,ne,ne,ne,ne,sw,ne,ne,ne,ne,sw,ne,ne,ne,ne,ne,nw,ne,ne,ne,ne,ne,ne,nw,ne,ne,se,ne,ne,se,ne,ne,ne,ne,ne,ne,s,se,s,ne,ne,ne,n,ne,ne,n,ne,ne,ne,nw,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,ne,ne,se,ne,ne,s,s,nw,ne,ne,ne,se,ne,s,n,se,n,ne,ne,s,se,se,se,ne,ne,ne,se,sw,se,ne,ne,nw,ne,se,ne,ne,ne,ne,se,ne,nw,ne,ne,ne,se,ne,se,s,se,se,ne,ne,ne,ne,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,nw,ne,ne,se,sw,ne,se,ne,nw,se,n,se,n,ne,ne,ne,ne,s,se,ne,se,se,ne,ne,ne,ne,ne,se,ne,se,ne,se,ne,se,se,se,ne,nw,ne,nw,ne,ne,se,s,ne,s,n,se,sw,ne,se,ne,ne,ne,se,se,ne,ne,se,se,se,se,ne,n,sw,ne,se,ne,sw,sw,nw,s,se,se,ne,se,n,ne,se,s,sw,ne,se,se,s,se,se,se,se,se,sw,ne,se,s,se,se,s,se,ne,se,ne,ne,se,ne,se,ne,se,se,ne,ne,ne,se,ne,se,n,se,se,se,s,ne,se,se,ne,s,s,nw,ne,se,se,ne,se,se,se,se,se,se,se,s,se,se,sw,se,sw,se,se,se,ne,se,s,se,se,se,se,se,se,se,se,ne,se,s,se,se,se,se,sw,n,se,se,se,ne,se,se,se,se,s,se,se,sw,se,se,se,sw,se,n,se,se,se,se,se,nw,se,se,sw,se,se,s,se,se,se,ne,se,se,se,se,s,se,se,se,se,s,se,se,se,s,se,se,s,se,se,se,se,se,se,se,se,se,se,n,se,s,se,se,se,se,se,ne,se,se,se,ne,se,se,se,se,n,se,se,se,se,se,se,se,se,se,se,s,s,se,ne,s,se,s,se,s,se,se,s,s,s,se,s,se,se,ne,s,s,se,se,se,s,s,se,se,se,s,se,se,ne,s,n,s,s,se,ne,se,se,sw,se,se,se,se,s,n,s,s,sw,sw,se,s,se,ne,se,se,se,s,se,n,s,s,sw,se,se,se,s,se,se,s,sw,s,s,se,se,nw,s,s,se,nw,n,s,se,s,se,se,sw,s,s,se,se,s,se,n,nw,se,se,s,s,s,se,s,s,se,s,se,se,s,n,s,se,s,se,s,sw,nw,ne,s,s,se,se,se,se,s,se,se,s,s,s,se,se,se,sw,se,se,n,se,se,n,s,se,se,s,s,se,ne,sw,se,se,s,se,s,s,se,se,s,se,se,s,s,nw,se,se,s,se,n,s,n,n,se,s,se,se,se,sw,s,s,n,s,s,se,ne,se,nw,se,s,s,s,s,s,se,ne,s,se,s,se,n,sw,nw,s,s,s,s,nw,se,sw,se,s,s,sw,s,nw,se,nw,s,s,nw,n,s,sw,se,s,nw,s,se,se,n,ne,s,s,s,s,se,s,se,s,se,s,s,s,se,s,s,s,sw,s,s,s,se,s,s,s,s,se,s,s,s,ne,se,s,se,s,s,s,se,n,s,se,se,s,se,ne,s,n,s,s,se,ne,s,s,s,s,s,s,s,s,s,s,s,s,s,nw,se,s,n,se,s,se,s,ne,s,s,s,ne,n,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,se,s,s,n,s,n,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,s,n,s,s,s,s,s,s,s,s,s,sw,s,nw,sw,s,nw,s,s,s,nw,s,se,nw,s,s,s,s,s,s,sw,s,s,nw,s,sw,s,s,sw,s,s,s,s,ne,s,s,s,sw,sw,s,sw,s,s,s,s,se,s,s,sw,sw,s,s,s,s,s,n,nw,s,s,s,ne,s,n,s,s,sw,s,s,s,s,s,s,n,s,s,ne,s,ne,sw,s,ne,sw,s,s,ne,s,s,s,s,s,sw,s,s,s,s,sw,sw,sw,sw,s,se,sw,s,s,s,s,s,s,s,s,s,n,sw,s,s,s,sw,s,sw,sw,n,ne,s,s,s,s,s,s,s,s,s,n,s,sw,sw,s,s,s,sw,s,s,s,sw,s,s,se,sw,s,sw,sw,sw,s,ne,nw,sw,n,s,s,sw,s,s,s,nw,s,s,sw,s,se,sw,sw,sw,s,sw,s,s,n,ne,s,nw,s,s,s,n,ne,s,s,sw,sw,sw,nw,s,s,sw,s,sw,sw,sw,s,sw,sw,se,se,s,s,s,s,s,sw,se,s,s,sw,s,s,nw,s,s,sw,sw,s,s,s,s,s,sw,n,sw,sw,sw,sw,sw,sw,s,sw,s,s,se,sw,s,sw,sw,sw,sw,s,n,s,s,sw,s,nw,s,s,ne,nw,sw,sw,sw,sw,s,s,s,s,s,sw,s,s,s,sw,sw,s,sw,s,s,s,sw,sw,s,s,s,nw,sw,s,sw,ne,s,sw,sw,nw,s,sw,s,sw,nw,sw,ne,ne,sw,sw,sw,sw,s,sw,s,sw,se,n,s,s,sw,sw,se,nw,sw,sw,sw,ne,sw,sw,se,sw,sw,se,s,ne,s,se,nw,sw,sw,sw,sw,s,s,sw,sw,sw,se,sw,nw,sw,se,ne,s,sw,sw,n,s,s,sw,nw,s,sw,sw,sw,s,ne,sw,nw,n,sw,n,sw,s,sw,sw,sw,s,sw,s,s,s,nw,s,sw,se,sw,sw,s,sw,s,s,s,sw,sw,n,sw,sw,sw,ne,sw,se,sw,s,nw,ne,ne,s,s,s,sw,ne,sw,sw,sw,sw,sw,sw,se,sw,s,sw,sw,sw,s,ne,s,sw,sw,s,nw,sw,sw,s,sw,s,s,sw,n,sw,s,sw,nw,nw,sw,sw,sw,s,ne,s,sw,sw,sw,s,n,sw,sw,s,sw,sw,sw,sw,n,sw,sw,ne,sw,ne,nw,sw,n,nw,s,s,sw,s,sw,sw,sw,sw,sw,sw,sw,se,sw,sw,sw,nw,sw,sw,n,ne,sw,sw,sw,sw,ne,sw,sw,sw,sw,sw,s,sw,sw,sw,sw,sw,sw,sw,sw,sw,ne,s,sw,n,s,sw,sw,sw,sw,sw,sw,ne,s,sw,sw,nw,s,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,ne,sw,sw,sw,sw,sw,sw,sw,nw,se,sw,sw,sw,sw,se,sw,sw,se,sw,sw,se,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,se,sw,s,sw,sw,sw,n,sw,sw,nw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,n,ne,n,sw,sw,nw,sw,sw,sw,nw,sw,sw,n,n,sw,sw,sw,sw,sw,se,n,nw,sw,nw,nw,ne,n,s,n,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,se,se,sw,sw,nw,sw,sw,nw,sw,s,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,nw,sw,ne,sw,sw,sw,se,sw,sw,sw,ne,n,s,sw,nw,sw,ne,ne,sw,sw,sw,sw,sw,nw,sw,nw,sw,sw,sw,sw,nw,s,nw,sw,sw,sw,se,n,sw,sw,sw,sw,sw,nw,sw,sw,sw,sw,nw,sw,nw,sw,sw,nw,s,s,sw,sw,ne,nw,sw,sw,sw,sw,sw,sw,n,ne,ne,sw,se,n,nw,nw,nw,s,sw,ne,sw,se,ne,sw,sw,sw,sw,sw,sw,s,sw,nw,sw,n,sw,nw,nw,sw,sw,sw,sw,sw,sw,ne,nw,sw,sw,n,sw,sw,sw,sw,sw,n,sw,nw,nw,sw,sw,sw,sw,s,sw,sw,se,sw,sw,nw,sw,sw,sw,nw,sw,nw,n,sw,sw,sw,n,sw,nw,nw,sw,nw,nw,nw,n,sw,s,nw,nw,sw,sw,ne,sw,sw,s,s,se,nw,sw,n,se,sw,nw,sw,n,nw,nw,se,nw,nw,sw,nw,sw,nw,s,sw,sw,sw,sw,ne,sw,sw,sw,sw,nw,nw,se,nw,nw,sw,nw,nw,sw,sw,ne,n,sw,nw,s,ne,sw,ne,sw,sw,sw,sw,nw,nw,sw,sw,sw,sw,sw,sw,sw,s,sw,n,nw,sw,sw,sw,sw,nw,sw,s,nw,sw,sw,nw,nw,sw,sw,nw,sw,nw,sw,sw,sw,nw,nw,sw,sw,ne,nw,nw,sw,sw,sw,sw,sw,nw,ne,nw,sw,sw,ne,sw,nw,n,se,nw,sw,sw,se,se,nw,s,sw,sw,sw,sw,sw,s,nw,nw,sw,sw,sw,nw,sw,nw,n,nw,nw,s,s,sw,ne,n,sw,nw,sw,nw,sw,nw,nw,sw,sw,sw,sw,nw,sw,s,nw,nw,sw,sw,nw,nw,nw,sw,se,ne,sw,nw,nw,n,sw,nw,s,se,nw,nw,nw,ne,nw,sw,sw,nw,s,ne,n,s,nw,nw,nw,sw,n,nw,s,se,nw,nw,nw,sw,nw,ne,nw,nw,nw,sw,sw,se,nw,nw,sw,ne,sw,nw,sw,nw,sw,sw,sw,nw,n,nw,sw,s,sw,nw,sw,sw,sw,nw,s,ne,sw,nw,nw,sw,se,sw,nw,nw,nw,nw,nw,nw,sw,n,nw,nw,nw,s,nw,sw,nw,sw,sw,s,nw,sw,nw,sw,nw,sw,sw,sw,nw,nw,sw,sw,nw,sw,nw,nw,nw,sw,sw,nw,sw,nw,sw,nw,se,nw,nw,s,sw,sw,nw,nw,nw,sw,nw,nw,n,nw,sw,sw,nw,sw,ne,s,nw,sw,sw,nw,sw,sw,sw,nw,nw,sw,nw,ne,nw,nw,nw,n,ne,nw,sw,sw,nw,sw,n,nw,sw,nw,sw,sw,nw,nw,ne,nw,se,sw,nw,se,sw,nw,nw,s,nw,s,nw,nw,nw,s,nw,sw,nw,nw,nw,sw,nw,nw,se,nw,nw,nw,nw,sw,n,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,s,nw,s,sw,nw,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,se,ne,nw,s,se,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,sw,sw,se,sw,nw,nw,ne,nw,sw,nw,nw,s,n,nw,sw,s,nw,sw,ne,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,s,nw,nw,s,se,nw,nw,nw,ne,nw,nw,nw,nw,nw,sw,nw,n,n,se,nw,nw,nw,nw,sw,nw,nw,se,nw,nw,sw,nw,nw,nw,nw,sw,nw,ne,nw,nw,sw,nw,nw,nw,n,nw,se,nw,nw,ne,nw,se,nw,sw,nw,nw,n,nw,nw,s,nw,nw,nw,ne,nw,nw,nw,nw,sw,ne,n,sw,n,se,nw,sw,s,nw,sw,nw,sw,nw,nw,nw,nw,nw,nw,se,se,nw,nw,nw,s,nw,nw,nw,sw,nw,nw,se,nw,sw,nw,nw,ne,ne,nw,s,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,n,nw,nw,nw,s,s,se,nw,nw,nw,ne,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,n,nw,se,nw,n,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,sw,ne,nw,nw,nw,nw,nw,ne,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,se,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,se,nw,nw,nw,nw,nw,nw,s,nw,nw,nw,n,nw,nw,nw,n,nw,nw,nw,nw,n,nw,sw,n,nw,se,n,nw,ne,nw,n,n,nw,s,nw,se,sw,n,nw,nw,nw,n,nw,nw,nw,n,n,nw,nw,ne,sw,nw,ne,nw,nw,nw,sw,s,nw,nw,nw,se,nw,nw,sw,n,sw,nw,sw,nw,nw,n,nw,nw,n,n,nw,nw,nw,nw,nw,ne,se,nw,nw,n,nw,nw,nw,nw,nw,ne,nw,nw,n,nw,nw,n,ne,nw,ne,ne,n,nw,nw,nw,nw,n,nw,n,nw,nw,nw,nw,nw,nw,ne,se,nw,nw,n,nw,n,sw,nw,n,s,sw,n,n,ne,sw,nw,n,s,n,se,nw,se,n,ne,nw,nw,nw,s,nw,nw,nw,nw,se,se,nw,n,nw,nw,nw,nw,nw,nw,nw,n,n,nw,n,n,sw,sw,n,nw,n,nw,nw,s,nw,nw,n,nw,nw,nw,nw,n,se,s,nw,n,nw,nw,se,s,sw,n,nw,nw,nw,ne,nw,nw,n,s,nw,n,n,se,n,n,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,ne,n,s,nw,nw,nw,ne,ne,n,nw,nw,n,s,nw,n,n,n,n,nw,s,n,n,nw,nw,n,nw,n,nw,nw,nw,n,nw,n,nw,ne,nw,nw,nw,nw,nw,nw,s,n,nw,n,nw,nw,n,nw,n,n,nw,n,nw,n,n,n,n,n,n,n,ne,n,nw,nw,n,s,n,n,nw,nw,nw,s,n,nw,nw,n,sw,n,nw,n,s,nw,nw,n,se,n,s,n,nw,n,n,nw,n,nw,n,s,n,n,nw,s,nw,n,n,n,n,nw,nw,n,nw,nw,nw,nw,s,nw,n,nw,n,nw,n,nw,se,nw,nw,n,ne,sw,sw,nw,nw,nw,n,nw,nw,n,nw,ne,nw,n,n,n,nw,n,nw,se,se,n,nw,nw,nw,n,s,s,nw,n,nw,nw,s,nw,n,n,n,nw,ne,nw,nw,nw,sw,nw,nw,ne,nw,ne,nw,sw,se,nw,n,nw,nw,n,nw,sw,n,n,n,n,n,nw,s,nw,nw,nw,nw,nw,s,nw,n,nw,nw,n,n,n,ne,n,nw,nw,ne,sw,nw,nw,nw,s,n,n,ne,sw,se,n,nw,n,nw,n,n,nw,nw,nw,nw,n,n,se,s,n,n,n,nw,n,n,n,nw,nw,nw,nw,nw,n,n,n,se,nw,se,n,n,n,n,ne,nw,se,n,n,n,n,nw,se,nw,nw,nw,n,se,n,nw,n,nw,nw,nw,n,s,n,ne,nw,s,n,nw,n,nw,nw,n,nw,nw,ne,ne,se,n,n,n,n,n,nw,n,n,se,nw,n,n,n,sw,sw,n,n,se,nw,n,n,n,n,n,sw,s,n,n,nw,nw,n,n,nw,n,nw,nw,se,nw,n,n,n,n,n,n,nw,nw,ne,nw,n,nw,sw,n,n,n,n,sw,nw,n,n,n,nw,n,n,s,nw,s,n,sw,nw,nw,n,nw,s,se,nw,nw,n,n,n,n,nw,n,n,n,nw,nw,sw,s,nw,n,nw,n,nw,s,n,nw,nw,n,n,nw,n,n,n,nw,n,se,nw,se,n,se,n,ne,s,n,n,n,s,sw,nw,s,n,n,n,n,nw,n,nw,nw,sw,s,nw,nw,n,nw,ne,nw,n,sw,n,se,n,n,n,nw,nw,ne,nw,n,n,n,n,s,n,n,n,nw,n,nw,n,nw,n,sw,s,n,nw,n,n,n,n,s,n,n,nw,n,nw,nw,nw,nw,n,n,n,n,n,n,n,nw,sw,se,s,nw,n,ne,sw,n,nw,nw,n,n,n,n,n,n,n,n,nw,nw,n,s,n,n,s,n,ne,sw,nw,s,nw,n,n,n,se,n,n,n,nw,ne,n,nw,n,n,n,n,n,n,se,s,n,n,n,nw,ne,se,n,se,n,nw,n,n,nw,n,n,sw,nw,n,n,n,ne,n,n,n,n,nw,n,n,n,se,nw,n,n,n,n,n,n,nw,nw,n,n,nw,nw,n,n,nw,n,n,n,n,n,n,nw,nw,n,n,n,se,n,n,se,n,nw,nw,nw,ne,n,se,s,nw,n,nw,n,n,n,n,n,s,se,n,n,n,n,n,nw,sw,sw,ne,n,nw,nw,ne,se,n,n,sw,se,n,n,n,nw,se,n,nw,n,n,s,ne,ne,nw,n,nw,n,n,nw,n,nw,nw,n,n,n,n,n,n,nw,sw,n,sw,n,n,nw,n,n,n,n,n,se,n,n,se,n,se,n,n,n,n,n,ne,n,ne,n,ne,n,sw,n,sw,n,n,n,n,n,n,n,n,se,n,n,n,ne,n,n,n,n,n,n,s,nw,n,n,n,nw,n,n,n,n,n,n,ne,sw,n,ne,n,n,n,n,n,n,n,n,nw,n,n,n,n,n,n,n,n,se,n,n,n,n,n,n,s,nw,n,ne,n,n,sw,sw,n,n,n,ne,n,n,n,n,n,n,n,sw,n,n,n,n,ne,se,se,s,n,n,n,n,n,n,n,n,nw,ne,n,n,nw,n,se,n,sw,n,n,n,nw,n,s,se,n,se,n,n,n,n,n,sw,ne,sw,n,s,n,nw,n,nw,n,s,n,s,se,ne,nw,n,n,n,n,n,n,n,n,n,ne,se,n,n,n,ne,n,n,n,se,n,n,n,n,nw,n,n,n,n,n,n,n,ne,sw,n,n,n,se,n,sw,nw,n,nw,n,ne,n,n,n,n,n,s,n,n,n,n,n,se,ne,n,sw,s,s,n,n,n,n,n,n,n,n,n,s,s,n,n,n,n,n,sw,nw,n,n,n,n,n,se,n,n,n,sw,n,n,n,n,n,n,n,n,ne,n,s,n,n,n,n,se,n,n,n,n,n,n,ne,n,n,s,n,s,n,n,n,n,n,sw,n,n,n,se,n,n,n,se,ne,n,ne,n,n,n,n,n,s,n,n,n,n,n,se,n,sw,nw,s,n,n,n,s,n,n,n,n,n,n,sw,n,n,n,n,n,n,n,n,n,n,n,n,ne,n,s,s,n,ne,n,n,n,se,ne,ne,n,nw,nw,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,n,ne,n,n,n,n,ne,sw,n,nw,sw,ne,s,n,n,n,n,se,n,sw,n,n,ne,n,n,n,n,ne,ne,n,n,n,n,n,n,n,ne,ne,n,se,n,s,n,se,n,se,n,nw,n,sw,n,n,n,n,n,ne,ne,se,nw,ne,n,nw,n,n,ne,ne,n,n,n,ne,n,n,ne,ne,n,n,n,n,n,n,n,n,s,n,n,n,ne,ne,n,sw,n,n,n,n,n,ne,n,n,n,sw,n,n,n,n,n,n,ne,ne,n,n,se,n,ne,n,ne,n,n,n,n,n,n,sw,n,n,ne,n,ne,n,nw,ne,ne,n,n,n,n,n,ne,n,ne,sw,n,n,n,n,nw,ne,n,ne,n,n,ne,nw,n,se,se,n,n,n,ne,nw,sw,ne,ne,ne,n,ne,n,n,n,n,n,s,n,ne,n,n,ne,n,n,n,nw,ne,n,nw,n,nw,n,se,s,n,n,n,n,n,n,n,n,n,ne,se,n,ne,n,n,nw,ne,n,n,s,ne,n,n,n,n,n,ne,n,n,ne,ne,n,n,n,n,n,n,sw,nw,n,n,nw,ne,sw,n,n,n,n,n,n,n,nw,n,se,sw,ne,n,se,ne,sw,n,n,n,n,n,s,n,ne,n,n,n,n,ne,n,ne,se,n,n,n,n,n,ne,nw,ne,n,n,n,ne,sw,se,n,s,n,n,sw,n,n,n,n,sw,ne,n,ne,ne,n,n,n,ne,se,ne,n,n,ne,ne,n,se,ne,ne,ne,n,n,se,n,n,n,ne,n,se,ne,ne,sw,n,ne,se,ne,ne,n,se,n,n,nw,n,n,n,ne,n,ne,ne,ne,ne,ne,n,n,n,ne,n,n,n,nw,n,n,n,n,n,s,n,ne,ne,n,ne,nw,ne,n,n,n,n,ne,n,ne,ne,sw,ne,nw,se,n,ne,nw,ne,ne,n,n,n,s,s,s,ne,sw,ne,ne,s,sw,ne,se,se,n,n,n,sw,n,n,ne,n,ne,n,n,n,n,n,n,ne,n,n,n,ne,se,n,n,n,n,ne,n,n,se,n,sw,n,n,ne,n,ne,ne,n,ne,nw,sw,se,n,n,ne,n,se,ne,n,ne,ne,n,ne,ne,ne,nw,s,ne,nw,ne,ne,n,sw,n,n,n,n,ne,n,s,n,n,ne,sw,s,n,n,n,n,sw,n,sw,n,n,se,s,n,se,n,n,ne,ne,n,ne,s,n,ne,n,n,n,se,n,n,ne,ne,sw,se,n,ne,ne,n,ne,ne,n,ne,ne,ne,n,ne,n,ne,n,n,ne,ne,ne,ne,se,ne,se,ne,ne,sw,n,n,ne,ne,ne,n,n,ne,n,n,se,ne,ne,ne,ne,se,n,ne,n,ne,ne,se,ne,s,ne,n,n,n,ne,se,nw,ne,ne,sw,ne,n,ne,n,sw,ne,ne,sw,ne,n,n,se,ne,ne,ne,n,n,n,ne,n,n,ne,n,n,se,ne,n,ne,n,n,ne,ne,ne,n,ne,ne,n,n,ne,ne,ne,se,ne,ne,ne,n,n,sw,s,ne,ne,n,sw,n,ne,sw,n,ne,sw,n,n,ne,ne,nw,sw,ne,s,ne,ne,n,s,se,nw,s,ne,n,n,s,ne,ne,ne,n,ne,ne,ne,ne,se,ne,ne,ne,se,ne,ne,ne,n,n,n,n,nw,ne,ne,ne,n,n,n,n,ne,nw,n,n,n,ne,nw,n,sw,ne,n,ne,ne,ne,ne,sw,ne,nw,nw,ne,ne,n,ne,n,s,ne,sw,s,ne,ne,n,ne,n,n,sw,ne,n,ne,n,ne,ne,sw,se,ne,n,n,sw,ne,ne,nw,n,sw,ne,n,ne,ne,nw,n,ne,ne,n,se,n,s,ne,ne,ne,s,n,n,ne,n,ne,n,ne,ne,se,ne,ne,n,ne,ne,ne,ne,n,ne,ne,nw,ne,se,ne,ne,ne,ne,n,ne,ne,ne,ne,ne,se,ne,n,n,ne,ne,n,nw,ne,n,ne,ne,ne,ne,ne,ne,ne,ne,ne,n,n,n,ne,ne,sw,n,ne,ne,se,s,ne,n,sw,ne,n,ne,n,ne,n,ne,ne,ne,ne,ne,n,ne,ne,n,sw,n,ne,ne,ne,n,ne,n,se,n,n,ne,n,n,n,n,ne,ne,ne,s,n,ne,ne,ne,ne,ne,ne,ne,ne,n,n,ne,sw,ne,n,s,n,ne,se,ne,ne,ne,ne,nw,n,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,n,sw,ne,n,n,n,ne,s,ne,ne,n,s,ne,sw,nw,ne,s,ne,ne,ne,se,ne,n,ne,ne,sw,ne,n,ne,ne,se,s,s,n,n,ne,ne,se,ne,ne,ne,n,ne,ne,n,sw,ne,ne,ne,ne,s,ne,se,ne,ne,ne,ne,ne,n,ne,ne,se,nw,ne,nw,ne,ne,ne,ne,n,se,ne,n,nw,ne,ne,ne,n,ne,ne,ne,n,ne,n,n,ne,ne,ne,ne,ne,s,n,n,ne,se,ne,sw,n,se,sw,ne,n,ne,ne,ne,ne,ne,s,nw,n,ne,ne,ne,ne,sw,n,ne,ne,ne,ne,sw,s,ne,ne,ne,ne,nw,n,n,ne,ne,se,ne,ne,se,ne,sw,ne,sw,ne,ne,ne,n,ne,s,se,ne,ne,n,ne,n,n,sw,ne,sw,ne,ne,ne,ne,ne,ne,n,ne,ne,n,ne,ne,ne,ne,ne,ne,ne,n,ne,n,sw,ne,ne,ne,ne,n,s,se,ne,ne,s,ne,n,ne,ne,n,n,ne,ne,ne,se,ne,n,s,n,ne,s,ne,ne,se,ne,ne,s,n,se,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,n,ne,s,ne,ne,ne,sw,n,ne,ne,ne,ne,ne,se,nw,n,n,ne,ne,n,ne,ne,ne,ne,ne,ne,ne,ne,ne,nw,se,n,ne,se,n,ne,n,ne,ne,n,n,ne,ne,ne,ne,ne,ne,ne,sw,sw,n,ne,s,se,ne,ne,ne,se,ne,ne,ne,se,nw,nw,ne,ne,sw,n,ne,s,se,n,s,ne,ne,ne,ne,ne,ne,s,ne,s,nw,n,ne,ne,se,ne,nw,sw,ne,s,ne,ne,ne,ne,ne,nw,ne,ne,ne,n,ne,se,n,ne,ne,ne,ne,se,ne,ne,ne,sw,ne,ne,ne,ne,ne,se,ne,ne,n,ne,ne,ne,sw,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,ne,sw,n,ne,sw,ne,ne,ne,sw,nw,ne,ne,ne,se,ne,ne,n,ne,ne,ne,ne,ne,se,ne,se,ne,ne,ne,ne,ne,ne,ne,s,ne,ne,ne,ne,sw,ne,ne,ne,ne,ne,ne,s,ne,ne,ne,ne,ne,ne,ne,ne,sw,ne,ne,ne,ne,ne,sw,n,nw,ne,ne,ne,n,ne,ne,ne,n,ne,ne,ne,ne,se,ne,ne,s,nw,ne,ne,ne,sw,ne,ne,n,ne,n,ne,ne,ne,s,ne,sw,ne,n,ne,ne,ne,ne,nw,nw,nw,sw,sw,sw,ne,sw,nw,s,s,se,s,n,s,s,s,s,se,se,se,sw,nw,se,n,se,se,ne,sw,sw,ne,ne,ne,ne,ne,s,ne,ne,n,ne,ne,nw,ne,n,se,n,n,ne,ne,ne,ne,nw,n,n,ne,n,n,n,n,n,n,nw,n,n,s,n,n,s,n,nw,n,ne,n,n,n,n,ne,nw,ne,n,nw,nw,nw,n,n,nw,nw,nw,nw,nw,nw,n,nw,nw,sw,sw,nw,nw,nw,nw,nw,nw,nw,sw,nw,nw,nw,nw,n,sw,nw,n,nw,nw,sw,sw,sw,nw,sw,nw,sw,sw,sw,sw,ne,nw,sw,s,n,sw,sw,nw,nw,n,se,sw,s,sw,se,s,nw,nw,sw,se,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,sw,sw,sw,nw,sw,s,sw,n,sw,se,s,sw,sw,sw,s,s,sw,s,sw,ne,sw,s,sw,s,sw,s,s,s,nw,s,s,s,sw,s,sw,s,s,ne,s,s,s,s,sw,s,ne,s,n,sw,s,s,s,s,s,se,n,s,s,s,s,n,n,s,nw,se,s,s,s,se,sw,s,ne,se,n,s,s,s,s,s,n,se,s,se,s,se,s,se,n,se,sw,sw,s,se,s,s,s,s,sw,s,s,s,se,se,s,s,se,se,s,se,n,s,n,s,se,se,n,s,sw,s,ne,se,sw,se,se,n,s,s,se,nw,se,s,s,n,se,se,se,se,se,se,s,s,nw,se,s,se,se,se,se,se,se,s,s,s,se,ne,n,se,s,se,se,s,s,sw,se,se,nw,sw,se,se,se,se,ne,se,se,sw,se,sw,s,sw,n,se,se,se,se,se,ne,se,se,se,se,se,se,se,ne,se,se,se,s,ne,se,n,ne,sw,ne,ne,se,nw,se,sw,se,se,ne,n,se,se,se,ne,se,se,s,ne,ne,nw,se,se,n,se,se,sw,ne,se,ne,se,se,ne,se,se,nw,ne,ne,se,ne,n,ne,ne,se,ne,ne,ne,ne,ne,ne,se,se,ne,se,ne,se,se,ne,ne,se,s,ne,ne,ne,ne,ne,ne,s,ne,ne,se,se,ne,ne,se,ne,ne,ne,se,se,se,se,ne,ne,ne,ne,ne,ne,se,nw,ne,ne,se,ne,ne,s,se,ne,ne,s,ne,ne,ne,ne,ne,nw,ne,ne,ne,ne,ne,ne,ne,se,ne,ne,ne,s,ne,n,ne,ne,ne,ne,ne,s,s,n,ne,ne,ne,ne,ne,ne,ne,ne,se,ne,n,sw,ne,ne,ne,ne,se,ne,ne,ne,n,ne,ne,ne,ne,ne,nw,ne,n,ne,ne,ne,n,nw,ne,ne,nw,n,ne,ne,ne,se,ne,ne,ne,n,ne,nw,n,ne,se,ne,se,n,se,n,ne,n,ne,ne,se,ne,ne,ne,ne,nw,n,ne,n,ne,n,ne,ne,se,sw,n,se,ne,nw,n,ne,s,s,n,ne,ne,s,ne,nw,ne,ne,ne,ne,n,n,s,n,s,s,n,ne,n,ne,n,nw,sw,s,n,s,n,n,n,sw,ne,n,n,ne,n,se,nw,n,n,ne,n,n,nw,s,n,ne,n,ne,n,ne,n,n,ne,n,ne,ne,n,ne,n,ne,ne,n,sw,ne,nw,n,n,n,ne,n,n,n,ne,sw,n,n,n,n,se,sw,n,se,n,nw,ne,n,ne,ne,n,sw,n,se,n,n,sw,nw,n,n,ne,s,n,n,n,n,n,n,n,n,n,n,n,n,ne,s,n,n,n,n,n,sw,nw,n,n,n,n,n,nw,n,n,n,ne,ne,n,ne,nw,n,n,nw,n,ne,n,n,sw,n,s,n,nw,n,se,n,n,s,s,ne,ne,nw,n,nw,nw,n,n,n,sw,ne,n,n,n,n,n,n,n,n,n,n,s,ne,se,nw,n,nw,n,ne,se,nw,nw,n,n,n,ne,nw,n,n,s,n,nw,n,n,nw,se,nw,n,se,n,n,n,sw,nw,nw,n,n,n,nw,nw,nw,n,n,n,n,n,ne,n,n,sw,n,n,n,n,nw,n,sw,n,n,ne,n,ne,nw,se,nw,ne,n,sw,nw,s,n,n,n,n,nw,n,nw,n,n,sw,n,ne,n,nw,ne,n,nw,nw,nw,nw,n,nw,sw,n,nw,n,n,nw,nw,nw,nw,n,ne,sw,nw,n,n,ne,nw,nw,nw,nw,nw,nw,n,ne,n,nw,nw,nw,nw,nw,nw,nw,nw,nw,sw,n,nw,sw,nw,nw,n,nw,n,nw,nw,se,n,s,n,n,nw,nw,nw,nw,nw,nw,n,nw,nw,nw,nw,nw,nw,nw,nw,n,nw,nw,n,nw,nw,nw,ne,nw,n,nw,nw,se,s,nw,nw,ne,ne,nw,sw,nw,nw,se,se,nw,nw,nw,nw,nw,n,n,nw,nw,ne,n,nw,se,nw,nw,nw,nw,nw,nw,sw,nw,nw,n,nw,nw,s,nw,nw,n,nw,n,sw,nw,nw,nw,nw,nw,nw,nw,s,nw,se,nw,nw,nw,nw,se,nw,sw,nw,nw,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,se,nw,nw,s,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,s,n,nw,nw,nw,nw,n,sw,nw,nw,nw,sw,nw,nw,nw,nw,s,sw,sw,s,s,nw,s,nw,se,nw,nw,sw,nw,nw,nw,nw,nw,nw,nw,nw,nw,nw,ne,nw,nw,nw,nw,nw,sw,s,sw,nw,nw,se,nw,nw,nw,nw,nw,nw,sw,s,nw,ne,sw,nw,nw,nw,s,sw,nw,nw,nw,nw,nw,sw,ne,nw,ne,sw,sw,sw,nw,nw,nw,sw,se,nw,s,sw,ne,nw,nw,nw,sw,ne,sw,s,nw,nw,nw,sw,nw,nw,nw,n,sw,nw,nw,s,nw,se,nw,sw,nw,nw,sw,s,sw,nw,sw,s,sw,nw,sw,nw,n,nw,sw,sw,nw,sw,nw,nw,n,sw,sw,nw,nw,sw,s,sw,ne,n,nw,sw,sw,nw,nw,sw,s,nw,sw,nw,s,nw,sw,nw,sw,nw,sw,sw,nw,sw,sw,nw,nw,nw,ne,sw,nw,sw,sw,nw,nw,nw,se,sw,nw,sw,s,se,sw,nw,sw,nw,nw,nw,se,sw,nw,nw,sw,ne,sw,sw,n,nw,n,n,sw,sw,nw,sw,sw,sw,sw,sw,s,n,sw,sw,sw,s,sw,se,n,nw,sw,sw,ne,nw,sw,sw,s,sw,sw,sw,nw,nw,sw,nw,sw,n,sw,nw,n,ne,sw,sw,nw,sw,s,nw,sw,sw,nw,s,sw,s,sw,nw,nw,nw,sw,sw,sw,nw,n,n,sw,s,sw,s,nw,ne,nw,nw,nw,sw,sw,sw,se,nw,sw,sw,nw,s,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,sw,ne,sw,sw,sw,nw,sw,sw,nw,nw,sw,sw,sw,nw,n,sw,sw,sw,sw,se,sw,se,sw,nw,sw,sw,sw,sw,se,nw,ne,sw,sw,sw,sw,sw,nw,nw,sw,sw,sw,sw,s,nw,sw,n,sw,sw,se,sw,sw,nw,nw,sw,sw,nw,nw,sw,sw,sw,ne,s,sw,sw,s,sw,sw,sw,nw,sw,sw,sw,sw,sw,sw,s,se,n,sw,s,sw,sw,sw,sw,sw,sw,ne,se,sw,sw,sw,sw,sw,n,sw,sw,s,sw,n,sw,sw,sw,sw,sw,sw,sw,se,se,sw,sw,sw,sw,ne,sw,nw,sw,sw,sw,sw,sw,sw,n,ne,ne,sw,sw,sw,sw,sw,sw,sw,sw,se,sw,sw,ne,sw,sw,sw,sw,sw,nw,sw,sw,sw,ne,sw,n,sw,sw,sw,se,sw,sw,sw,sw,ne,sw,sw,sw,se,s,sw,sw,ne,sw,sw,sw,n,sw,sw,sw,sw,sw,ne,s,sw,sw,se,ne,sw,sw,sw,nw,ne,sw,s,s,sw,s,s,s,sw,sw,s,sw,se,sw,nw,sw,s,sw,ne,s,sw,s,sw,n,sw,sw,sw,sw,sw,sw,sw,ne,n,sw,n,sw,s,sw,sw,s,sw,ne,se,sw,s,s,sw,s,sw,sw,ne,s,sw,sw,sw,sw,s,sw,sw,nw,sw,sw,s,sw,n,s,s,nw,se,sw,sw,se,sw,sw,sw,ne,s,sw,sw,s,sw,sw,sw,sw,s,sw,s,s,ne,sw,sw,s,ne,s,se,sw,ne,s,s,sw,sw,s,nw,n,ne,sw,sw,s,s,nw,nw,sw,sw,sw,sw,sw,sw,ne,s,sw,s,sw,s,s,sw,s,sw,s,sw,sw,s,sw,se,sw,nw,nw,ne,ne,sw,sw,sw,sw,s,s,sw,sw,sw,sw,sw,nw,se,nw,sw,sw,sw,n,s,sw,sw,se,sw,sw,s,nw,sw,s,s,sw,sw,sw,s,sw,s,sw,sw,n,sw,s,sw,s,sw,ne,s,s,sw,sw,sw,s,s,sw,s,sw,s,s,se,s,sw,s,s,sw,se,sw,nw,s,sw,s,s,s,s,s,s,s,n,sw,sw,sw,sw,s,nw,s,s,sw,s,sw,sw,s,sw,se,sw,sw,s,s,sw,s,s,s,s,s,sw,nw,s,ne,sw,s,sw,sw,s,s,s,sw,sw,s,s,s,sw,nw,se,s,s,s,sw,s,s,sw,s,se,s,se,se,sw,s,s,nw,sw,s,s,s,sw,s,ne,sw,sw,sw,s,s,s,s,s,s,sw,s,sw,sw,s,s,s,s,sw,s,s,ne,ne,nw,ne,n,s,sw,s,s,nw,s,n,sw,ne,s,s,sw,sw,s,s,n,s,ne,s,sw,n,s,sw,sw,s,sw,sw,sw,se,se,s,s,s,sw,ne,s,s,s,s,n,sw,sw,s,n,s,s,s,s,nw,se,s,sw,sw,s,s,s,ne,nw,s,s,s,n,sw,s,s,s,s,s,s,s,s,s,ne,s,s,s,s,s,sw,sw,s,se,nw,s,s,se,s,s,nw,nw,s,s,s,nw,s,s,ne,sw,s,s,s,s,sw,sw,s,s,s,s,s,s,s,s,s,s,s,s,se,s,ne,sw,s,n,s,s,s,s,sw,se,sw,ne,s,sw,ne,s,n,s,n,s,se,s,s,s,sw,s,se,s,s,s,ne,s,s,s,s,s,s,s,s,s,sw,s,s,s,s,s,s,se,sw,s,s,n,s,s,s,s,nw,s,s,sw,s,n,se,nw,s,sw,s,s,s,ne,se,s,se,s,s,s,nw,nw,se,n,s,s,s,s,s,ne,se,se,nw,s,s,s,s,s,s,s,s,nw,se,nw,s,n,s,s,ne,n,n,se,s,s,s,s,s,se,sw,ne,s,s,s,s,s,s,s,s,se,nw,s,s,se,nw,s,sw,s,se,s,s,s,s,s,s,s,n,s,se,ne,se,se,s,s,s,s,se,s,s,se,se,s,s,s,se,sw,s,s,s,sw,se,s,s,nw,ne,n,nw,nw,se,s,s,se,s,s,ne,s,s,n,s,s,n,s,s,sw,s,s,s,s,s,ne,se,s,sw,nw,s,s,s,sw,n,ne,nw,s,se,ne,s,s,s,ne,se,s,n,nw,s,s,s,s,s,s,s,s,s,se,se,sw,s,s,s,s,se,se,s,n,s,s,s,s,s,s,se,se,s,s,s,se,se,se,s,ne,s,s,s,nw,s,sw,s,s,s,nw,s,nw,s,s,se,s,s,s,s,ne,s,s,s,s,s,sw,n,s,s,s,s,se,se,s,s,n,s,nw,sw,se,s,s,se,nw,s,s,s,se,sw,se,s,s,s,s,se,se,s,s,s,s,nw,se,se,s,se,ne,s,s,se,s,se,s,sw,sw,s,s,s,s,s,se,s,se,se,se,s,ne,s,nw,s,se,se,nw,s,s,ne,s,s,s,s,sw,s,n,s,s,s,s,sw,se,s,s,nw,s,ne,se,se,s,s,s,se,s,s,s,se,sw,se,n,sw,sw,se,s,s,s,s,s,s,s,s,ne,se,nw,sw,ne,s,s,s,s,sw,nw,se,s,n,nw,se,se,se,s,s,s,se,s,se,se,s,se,s,se,se,sw,nw,se,se,s,se,s,se,nw,ne,s,se,s,se,sw,s,s,se,s,n,nw,s,se,s,ne,sw,s,s,s,n,se,s,se,s,sw,se,s,sw,se,s,s,se,se,se,s,sw,se,se,s,s,s,s,n,se,s,se,nw,nw,s,se,s,s,s,se,s,se,ne,se,s,se,se,se,se,sw,se,se,se,se,se,se,n,s,se,se,n,nw,s,s,s,s,nw,se,s,s,se,s,s,nw,sw,se,s,s,s,se,se,s,se,s,se,s,sw,se,se,s,s,se,se,se,ne,n,s,s,se,se,se,se,s,s,se,se,s,se,s,s,se,sw,se,s,se,se,s,sw,se,s,sw,sw,se,s,s,s,se,sw,s,se,se,se,se,sw,se,s,s,se,se,s,s,s,s,ne,ne,s,s,se,se,se,s,se,se,se,se,se,se,s,se,se,se,n,se,se,s,se,sw,se,se,se,ne,se,se,se,se,se,nw,se,se,se,se,se,se,s,nw,se,se,se,s,se,se,s,se,s,s,ne,sw,se,se,se,s,s,se,se,s,se,se,s,se,n,se,se,s,s,se,se,ne,se,se,n,n,ne,s,se,se,s,n,s,sw,n,se,s,se,se,se,se,s,n,se,se,se,se,s,se,se,se,nw,se,se,s,se,se,se,se,sw,ne,s,se,s,se,se,se,se,n,se,se,se,se,se,se,se,se,se,se,se,se,se,se,sw,sw,se,se,se,nw,s,nw,se,se,se,se,se,se,s,s,se,se,nw,se,se,nw,nw,se,se,s,se,sw,se,se,se,se,n,ne,se,s,se,se,se,se,se,se,se,se,sw,s,se,se,sw,se,se,se,se,se,se,se,se,se,se,s,se,se,se,ne,nw,s,se,se,se,se,ne,se,s,se,se,se,se,se,se,nw,se,s,se,se,se,se,s,se,se,n,se,se,se,sw,se,sw,se,se,n,se,se,se,s,se,se,sw,ne,sw,s,se,se,se,se,sw,se,s,se,se,se,se,se,s,se,se,se,se,nw,ne,nw,se,se,n,se";
}
