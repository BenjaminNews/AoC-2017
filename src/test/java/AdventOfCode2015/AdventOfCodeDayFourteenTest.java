package AdventOfCode2015;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AdventOfCodeDayFourteenTest {

    private AdventOfCodeDayFourteen adventOfCodeDayFourteen;
    private ArrayList<AdventOfCodeDayFourteenReindeer> reindeer;
    private AdventOfCodeDayFourteenReindeer comet;
    private AdventOfCodeDayFourteenReindeer dancer;

    @Before
    public void setup() {
        adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        reindeer = new ArrayList<>();
        comet = new AdventOfCodeDayFourteenReindeer("Comet", 14, 10, 127);
        dancer = new AdventOfCodeDayFourteenReindeer("Dancer", 16, 11, 162);
        reindeer.add(comet);
        reindeer.add(dancer);
        adventOfCodeDayFourteen.setup(reindeer);
    }

    @Test
    public void resultAfterOneSecond() {
        adventOfCodeDayFourteen.fly(1);
        int result = adventOfCodeDayFourteen.getFurthestTravelledDitsance();
        assertEquals(16, result);
    }

    @Test
    public void resultAfterOneThounsandSeconds() {
        adventOfCodeDayFourteen.fly(1000);
        int result = adventOfCodeDayFourteen.getFurthestTravelledDitsance();
        assertEquals(1120, result);
    }

    @Test
    public void afterOneStepDancerWins() {
        adventOfCodeDayFourteen.fly(1);
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(1, result);
    }

    @Test
    public void afterOneHundredAndFourtyStepsDancerWins() {
        adventOfCodeDayFourteen.fly(140);
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(139, result);
    }

    @Test
    public void afterOneThousandStepsDancerWins() {
        adventOfCodeDayFourteen.fly(1000);
        int cometScore = comet.getScore();
        int dancerScore = dancer.getScore();
        int result = adventOfCodeDayFourteen.getHighestScore();
        assertEquals(688, dancerScore);
        assertEquals(311, cometScore);
        assertEquals(688, result);
    }
}

