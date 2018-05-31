package AdventOfCode2016;

import java.util.ArrayList;
import java.util.Arrays;

public class AdventOfCodeDayFifteen {

    private ArrayList<int[]> discs = new ArrayList<int[]>();

    public void setup(String arrangement) {
        String[] discProperties = arrangement.split("\n");
        for(String s : discProperties) {
            String[] discValues = s.split(" ");
            int size = Integer.parseInt(discValues[3]);
            int discPosition = Integer.parseInt(discValues[discValues.length - 1].replace(".", ""));
            int[] disc = new int[size];
            Arrays.fill(disc, 0);
            disc[discPosition] = 1;
            discs.add(disc);
        }
    }

    private void moveDiscs() {
        for(int[] disc : discs) {
            int endElementValue = disc[disc.length - 1];
            int[] startElements = Arrays.copyOfRange(disc, 0 , disc.length - 1);
            disc[0] = endElementValue;
            for(int i = 0, x = 1; i < startElements.length; i++, x++) {
                disc[x] = startElements[i];
            }
        }
    }

    public int getBounceEscapeCount() {
        int delayCount = 0;
        int capsuleLevel = 0;
        while(true) {
            if (discs.get(capsuleLevel)[0] == 1) {
                capsuleLevel++;
                moveDiscs();
                if (capsuleLevel == discs.size())
                    break;
            } else {
                moveDiscs();
                capsuleLevel = 0;
            }
            delayCount++;
        }
        return delayCount - discs.size();
    }

    public static void main(String[] args) {
        AdventOfCodeDayFifteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifteen();
        adventOfCodeDayFifthteen.setup(input);
        int result = adventOfCodeDayFifthteen.getBounceEscapeCount();
        System.out.println(result);

        adventOfCodeDayFifthteen = new AdventOfCodeDayFifteen();
        adventOfCodeDayFifthteen.setup(inputTwo);
        result = adventOfCodeDayFifthteen.getBounceEscapeCount();
        System.out.println(result);
    }

    private static final String input = "Disc #1 has 13 positions; at time=0, it is at position 11.\n" +
                                        "Disc #2 has 5 positions; at time=0, it is at position 0.\n" +
                                        "Disc #3 has 17 positions; at time=0, it is at position 11.\n" +
                                        "Disc #4 has 3 positions; at time=0, it is at position 0.\n" +
                                        "Disc #5 has 7 positions; at time=0, it is at position 2.\n" +
                                        "Disc #6 has 19 positions; at time=0, it is at position 17.";

    private static final String inputTwo =  "Disc #1 has 13 positions; at time=0, it is at position 11.\n" +
                                            "Disc #2 has 5 positions; at time=0, it is at position 0.\n" +
                                            "Disc #3 has 17 positions; at time=0, it is at position 11.\n" +
                                            "Disc #4 has 3 positions; at time=0, it is at position 0.\n" +
                                            "Disc #5 has 7 positions; at time=0, it is at position 2.\n" +
                                            "Disc #6 has 19 positions; at time=0, it is at position 17.\n" +
                                            "Disc #7 has 11 positions; at time=0, it is at position 0.";
}
