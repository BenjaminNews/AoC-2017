package AdventOfCode2015;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFourteenTest {

    @Test
    public void resultAfterOneSecond() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        ArrayList<AdventOfCodeDayFourteenReindeer> reindeer = new ArrayList<>();

        int movementCount = 1;

        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);

        adventOfCodeDayFourteen.setup(reindeer);
        adventOfCodeDayFourteen.fly(movementCount);
        int result = adventOfCodeDayFourteen.getFurthestTravelledDitsance();
        assertEquals(16, result);
    }

    @Test
    public void resultAfterOneThounsandSeconds() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        ArrayList<AdventOfCodeDayFourteenReindeer> reindeer = new ArrayList<>();

        int movementCount = 1000;

        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);

        adventOfCodeDayFourteen.setup(reindeer);
        adventOfCodeDayFourteen.fly(movementCount);
        int result = adventOfCodeDayFourteen.getFurthestTravelledDitsance();
        assertEquals(1120, result);
    }

    @Test
    public void afterOneStepDancerWins() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        ArrayList<AdventOfCodeDayFourteenReindeer> reindeer = new ArrayList<>();

        int movementCount = 1;

        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);
        adventOfCodeDayFourteen.setup(reindeer);
        adventOfCodeDayFourteen.fly(movementCount);
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(1, result);
    }

    @Test
    public void afterOneHundredAndFourtyStepsDancerWins() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        ArrayList<AdventOfCodeDayFourteenReindeer> reindeer = new ArrayList<>();

        int movementCount = 140;

        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);
        adventOfCodeDayFourteen.setup(reindeer);
        adventOfCodeDayFourteen.fly(movementCount);
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(139, result);
    }

    @Test
    public void afterOneThousandStepsDancerWins() {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        ArrayList<AdventOfCodeDayFourteenReindeer> reindeer = new ArrayList<>();

        int movementCount = 1000;

        AdventOfCodeDayFourteenReindeer comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        AdventOfCodeDayFourteenReindeer dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);
        adventOfCodeDayFourteen.setup(reindeer);
        adventOfCodeDayFourteen.fly(movementCount);
        int cometScore = comet.getScore();
        int dancerScore = dancer.getScore();
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(689, dancerScore);
        assertEquals(312, cometScore);
        assertEquals(689, result);
    }
}

