package AdventOfCode2016;

import java.util.ArrayList;

public class AdventOfCodeDayOne {

    private String[] moves;

    private int xCor = 0;
    private int yCor = 0;
    private int firstVisitedTwiceDistance = -1;

    private ArrayList<String> visitedCoordinates = new ArrayList<>();

    private boolean northFacing = true;
    private boolean southFacing = false;
    private boolean eastFacing = false;
    private boolean westFacing = false;
    private boolean encounteredSameLocation = false;

    public void setup(String input) {
        moves = input.split(", ");
    }

    public int getDistanceFromEndPoint() {
        for(String s: moves) {
            String direction = s.substring(0,1);
            int distance = Integer.parseInt(s.substring(1, s.length()));

            if(direction.equals("L")) {
                moveLeft(distance);
            } else if(direction.equals("R")) {
                moveRight(distance);
            }
        }
        System.out.println("Distance from start: " + calculateDistance() + " xcor: " + xCor + " ycor: " + yCor);
        return calculateDistance();
    }

    public int getDistanceFromAlreadyVisitedPosition() {

        for(String s: moves) {
            if(encounteredSameLocation == false) {
                String direction = s.substring(0, 1);
                int distance = Integer.parseInt(s.substring(1, s.length()));

                if (direction.equals("L")) {
                    moveLeftTwo(distance);
                } else if (direction.equals("R")) {
                    moveRightTwo(distance);
                }
            } else {
                break;
            }
        }
        System.out.println("Distance from start: " + calculateDistance() + " xcor: " + xCor + " ycor: " + yCor);
        return calculateDistance();
    }

    private int calculateDistance() {
        return Math.abs(xCor) + Math.abs(yCor);
    }

    private void moveRight(int distance) {
        if(northFacing) {
            eastFacing = true;
            northFacing = false;
            xCor += distance;
        } else if(eastFacing) {
            southFacing = true;
            eastFacing = false;
            yCor -= distance;
        } else if(southFacing) {
            southFacing = false;
            westFacing = true;
            xCor -= distance;
        } else if(westFacing) {
            westFacing = false;
            northFacing = true;
            yCor += distance;
        }
    }

    private void moveRightTwo(int distance) {
        if(northFacing) {
            eastFacing = true;
            northFacing = false;
            for(int i = distance; i > 0; i--) {
                xCor++;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);
                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(eastFacing) {
            southFacing = true;
            eastFacing = false;
            for(int i = distance; i > 0; i--) {
                yCor--;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(southFacing) {
            southFacing = false;
            westFacing = true;
            for(int i = distance; i > 0; i--) {
                xCor--;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(westFacing) {
            westFacing = false;
            northFacing = true;
            for(int i = distance; i > 0; i--) {
                yCor++;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        }
    }

    private void moveLeftTwo(int distance) {
        if(northFacing) {
            westFacing = true;
            northFacing = false;
            for(int i = distance; i > 0; i--) {
                xCor--;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(eastFacing) {
            northFacing = true;
            eastFacing = false;
            for(int i = distance; i > 0; i--) {
                yCor++;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(southFacing) {
            southFacing = false;
            eastFacing = true;
            for(int i = distance; i > 0; i--) {
                xCor++;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        } else if(westFacing) {
            westFacing = false;
            southFacing = true;
            for(int i = distance; i > 0; i--) {
                yCor--;
                String currentPosition = xCor + "," + yCor;
                System.out.println("current position: " + currentPosition);

                if(visitedCoordinates.contains(currentPosition)) {
                    encounteredSameLocation = true;
                    break;
                } else {
                    visitedCoordinates.add(currentPosition);
                }
            }
        }
    }

    private void moveLeft(int distance) {
        if(northFacing) {
            westFacing = true;
            northFacing = false;
            xCor -= distance;
        } else if(eastFacing) {
            northFacing = true;
            eastFacing = false;
            yCor += distance;
        } else if(southFacing) {
            southFacing = false;
            eastFacing = true;
            xCor += distance;
        } else if(westFacing) {
            westFacing = false;
            southFacing = true;
            yCor -= distance;
        }
    }



    public static void main(String[] args) {
        AdventOfCodeDayOne adventOfCodeDayOne = new AdventOfCodeDayOne();
        adventOfCodeDayOne.setup(input);
        adventOfCodeDayOne.getDistanceFromEndPoint();

        adventOfCodeDayOne = new AdventOfCodeDayOne();
        adventOfCodeDayOne.setup(input);
        int visitedTwiceResult = adventOfCodeDayOne.getDistanceFromAlreadyVisitedPosition();
        System.out.println("visited twice: " + visitedTwiceResult);
    }

    private static final String input = "R4, R5, L5, L5, L3, R2, R1, R1, L5, R5, R2, L1, L3, L4, R3, L1, L1, R2, R3, R3, R1, L3, L5, R3, R1, L1, R1, R2, L1, L4, L5, R4, R2, L192, R5, L2, R53, R1, L5, R73, R5, L5, R186, L3, L2, R1, R3, L3, L3, R1, L4, L2, R3, L5, R4, R3, R1, L1, R5, R2, R1, R1, R1, R3, R2, L1, R5, R1, L5, R2, L2, L4, R3, L1, R4, L5, R4, R3, L5, L3, R4, R2, L5, L5, R2, R3, R5, R4, R2, R1, L1, L5, L2, L3, L4, L5, L4, L5, L1, R3, R4, R5, R3, L5, L4, L3, L1, L4, R2, R5, R5, R4, L2, L4, R3, R1, L2, R5, L5, R1, R1, L1, L5, L5, L2, L1, R5, R2, L4, L1, R4, R3, L3, R1, R5, L1, L4, R2, L3, R5, R3, R1, L3";

    public int getFirstVisitedTwiceLocation() {
        return this.firstVisitedTwiceDistance;
    }
}
