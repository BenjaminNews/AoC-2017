package AdcentOfCode2017;

import java.math.BigInteger;

public class AdventOfCodeDayFifthteen {

    private long generatorAStartingValue;
    private long generatorBStartingValue;
    private long generatorAFactor;
    private long generatorBFactor;

    private int steps = 0;
    private int matches = 0;

    public AdventOfCodeDayFifthteen(int generatorAStartingValue, int generatorAFactor, int generatorBStartingValue, int generatorBfactor, int steps) {
        this.generatorAFactor = generatorAFactor;
        this.generatorBFactor = generatorBfactor;

        this.generatorAStartingValue = generatorAStartingValue * generatorAFactor;
        this.generatorBStartingValue = generatorBStartingValue * generatorBFactor;

        this.steps = steps;
    }

    public int getSteps() {
        return this.steps;
    }

    private void updateGeneratorValues() {
        generatorAStartingValue = ((generatorAStartingValue * generatorAFactor) % 2147483647);

        String generatorAInBinary = String.format("%032d", new BigInteger(Long.toBinaryString((long)generatorAStartingValue)));

        generatorBStartingValue = ((generatorBStartingValue * generatorBFactor) % 2147483647);

        String generatorBInBinary = String.format("%032d", new BigInteger(Long.toBinaryString((long)generatorBStartingValue)));

        String genaratorASixteenBits = generatorAInBinary.substring(16);
        String generatorBSixteenBits = generatorBInBinary.substring(16);

        if (genaratorASixteenBits.equals(generatorBSixteenBits)) {
            matches++;
            System.out.println("matches: " + matches);
        }
    }

    private void updateGeneratorValuesTwo(int i) {
        generatorAStartingValue = ((generatorAStartingValue * generatorAFactor) % 2147483647);

        String generatorAInBinary = String.format("%032d", new BigInteger(Long.toBinaryString((long)generatorAStartingValue)));

        generatorBStartingValue = ((generatorBStartingValue * generatorBFactor) % 2147483647);

        String generatorBInBinary = String.format("%032d", new BigInteger(Long.toBinaryString((long)generatorBStartingValue)));

        String generatorASixteenBits = generatorAInBinary.substring(16, generatorAInBinary.length());
        String generatorBSixteenBits = generatorBInBinary.substring(16, generatorBInBinary.length());

        if ((generatorAStartingValue % 4 == 0) && (generatorBStartingValue % 8 == 0)) {
            if(Integer.parseInt(generatorASixteenBits, 2) % 4 == 0) {
                System.out.println("generator a value parsed from binary divisible by four: " + Integer.parseInt(generatorASixteenBits, 2));
                if(Integer.parseInt(generatorBSixteenBits, 2) % 8 == 0) {
                    System.out.println("generator b value parsed from binary divisible by eight: " + Integer.parseInt(generatorBSixteenBits, 2));
                    if (generatorASixteenBits.equals(generatorBSixteenBits)) {
                        matches++;
                        System.out.println("matches: " + matches);
                    }
                }
            }

        }
    }

    public int getMatches() {
        return matches;
    }

    public static void main(String[] args) {

//        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(783, 16807, 325, 48271,40000000);
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen(783, 16807, 325, 48271, 5000000);

        adventOfCodeDayFifthteen.performSteps(adventOfCodeDayFifthteen.getSteps());
        System.out.println("result: " + adventOfCodeDayFifthteen.getMatches());
    }

    public void performSteps(int stepCount) {
        for(int i = 0; i < stepCount; i++ ) {
            //updateGeneratorValues();
            updateGeneratorValuesTwo(i);
        }
    }
}
