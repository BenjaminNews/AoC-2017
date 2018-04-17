package AdventOfCode2017;

public class AdventOfCodeDayFifthteen {

    private int generatorAStartingValue;
    private int generatorBStartingValue;
    private int generatorAFactor;
    private int generatorBFactor;

    private int steps = 0;
    private int matches = 0;

    public AdventOfCodeDayFifthteen(int generatorAStartingValue, int generatorAFactor, int generatorBStartingValue, int generatorBfactor, int steps) {
        this.generatorAFactor = generatorAFactor;
        this.generatorBFactor = generatorBfactor;

        this.generatorAStartingValue = generatorAStartingValue * generatorAFactor;
        this.generatorBStartingValue = generatorBStartingValue * generatorBFactor;

        this.steps = steps;
    }

    private void updateGeneratorValuesPartOne() {
        long p1 = generatorAStartingValue;
        long p2 = generatorBStartingValue;
        int c = 0;
        for(int i = 0; i < steps; i++) {
            p1 = (p1 * generatorAFactor) % 2147483647;
            p2 = (p2 * generatorBFactor) % 2147483647;
            if ((p1 & 65535) == (p2 & 65535))
                c++;
        }
        matches = c;
    }

    public void updateGeneratorValuesPartTwo() {

        long p1 = generatorAStartingValue;
        long p2 = generatorBStartingValue;
        int c = 0;
        for (int i = 0; i < steps; i++) {
            do {
                p1 = (p1 * generatorAFactor) % 2147483647;
            } while (p1 % 4 != 0);
            do {
                p2 = (p2 * generatorBFactor) % 2147483647;
            } while (p2 % 8 != 0);

            if ((p1 & 65535) == (p2 & 65535)) {
                c++;
            }
        }
        matches = c;
    }

    public int getMatches() {
        return matches;
    }

    public void performStepsPartOne() {
        for(int i = 0; i < steps; i++ ) {
            updateGeneratorValuesPartOne();
        }
    }

    public void performStepsPartTwo() {
        for(int i = 0; i < steps; i++ ) {
            updateGeneratorValuesPartTwo();
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(783, 16807, 325, 48271, 40000000);
        adventOfCodeDayFifthteen.performStepsPartOne();
        System.out.println("result: " + adventOfCodeDayFifthteen.getMatches());

        adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(783, 16807, 325, 48271, 5000000);
        adventOfCodeDayFifthteen.performStepsPartTwo();
        System.out.println("result: " + adventOfCodeDayFifthteen.getMatches());
    }
}
