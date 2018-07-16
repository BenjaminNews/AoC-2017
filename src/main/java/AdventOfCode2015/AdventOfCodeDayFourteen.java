package AdventOfCode2015;

import java.util.ArrayList;
import java.util.Comparator;

public class AdventOfCodeDayFourteen {
    private ArrayList<AdventOfCodeDayFourteenReindeer> allDeer = new ArrayList<>();

    public void setup(ArrayList<AdventOfCodeDayFourteenReindeer> allDeer) {
        this.allDeer = allDeer;
    }

    public void fly(int movementCount) {
        for(int i = 0; i < movementCount; i++) {
            for(AdventOfCodeDayFourteenReindeer deer: allDeer) {
                deer.fly();
            }
            giveScore();
        }
    }

    private void giveScore() {
        allDeer.sort(Comparator.comparing(AdventOfCodeDayFourteenReindeer::getDistanceTravelled));
        if(allDeer.get(allDeer.size() - 1).getDistanceTravelled() != allDeer.get(allDeer.size() - 2).getDistanceTravelled())
            allDeer.get(allDeer.size() -1).incrementScore();
    }

    public int getFurthestTravelledDitsance() {
        int furthestDistanceFromStart = 0;

        for(AdventOfCodeDayFourteenReindeer deer : allDeer) {
            if(deer.getDistanceTravelled() > furthestDistanceFromStart) {
                furthestDistanceFromStart = deer.getDistanceTravelled();
            }
        }
        return furthestDistanceFromStart;
    }

    public int getHighestScore() {
        int highestScore = 0;
        for(AdventOfCodeDayFourteenReindeer deer : allDeer) {
            if (deer.getScore() > highestScore) {
                highestScore = deer.getScore();
            }
        }
        return highestScore;
    }

    public static void main(String[] args) {
        ArrayList<AdventOfCodeDayFourteenReindeer> allDeer = new ArrayList<>();

        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 27,5,132);
        AdventOfCodeDayFourteenReindeer cupid = new AdventOfCodeDayFourteenReindeer("Cupid", 22,2,41);
        AdventOfCodeDayFourteenReindeer rudolph = new AdventOfCodeDayFourteenReindeer("Rudolph", 11,5,48);
        AdventOfCodeDayFourteenReindeer donner = new AdventOfCodeDayFourteenReindeer("Donner", 28,5,134);
        AdventOfCodeDayFourteenReindeer dasher = new AdventOfCodeDayFourteenReindeer("Dasher", 4,16,55);
        AdventOfCodeDayFourteenReindeer blitzen = new AdventOfCodeDayFourteenReindeer("Blitzen", 14,3,38);
        AdventOfCodeDayFourteenReindeer prancer = new AdventOfCodeDayFourteenReindeer("Prancer", 2,21,40);
        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 18,6,103);
        AdventOfCodeDayFourteenReindeer vixen = new AdventOfCodeDayFourteenReindeer("Donner", 18,5,84);

        allDeer.add(dancer);
        allDeer.add(cupid);
        allDeer.add(rudolph);
        allDeer.add(donner);
        allDeer.add(dasher);
        allDeer.add(blitzen);
        allDeer.add(prancer);
        allDeer.add(comet);
        allDeer.add(vixen);

        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();

        adventOfCodeDayFourteen.setup(allDeer);
        adventOfCodeDayFourteen.fly(2503);
        int result = adventOfCodeDayFourteen.getFurthestTravelledDitsance();
        System.out.println("result: " + result);
        System.out.println("highest score: " + adventOfCodeDayFourteen.getHighestScore());
    }
}
