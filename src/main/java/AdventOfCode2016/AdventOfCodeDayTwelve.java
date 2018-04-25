package AdventOfCode2016;

import java.util.HashMap;

public class AdventOfCodeDayTwelve {

    private String[] instructions;
    private HashMap<String, Integer> keyValues = new HashMap<>();
    private int currentPosition = 0;

    public int executeInstructions() {

        while(currentPosition < instructions.length) {
            String instruction = instructions[currentPosition];
            if(instruction.startsWith("cpy")) {
                copy(instruction.split(" ")[1], instruction.split(" ")[2]);
            } else if(instruction.startsWith("inc")) {
                increment(instruction.split(" ")[1]);
            } else if (instruction.startsWith("dec")) {
                decrement(instruction.split(" ")[1]);
            } else if(instruction.startsWith("jnz")) {
                jump(instruction.split(" ")[1], instruction.split(" ")[2]);
            }
        }
        return keyValues.get("a");
    }

    private void jump(String key, String distance) {
        int keyValue = parseInt(key);
        int jumpDistance = parseInt(distance);
        if(keyValue != 0) {
            currentPosition += jumpDistance;
        } else {
            currentPosition++;
        }
    }

    private void decrement(String key) {
        int newvalue = keyValues.get(key);
        keyValues.put(key, --newvalue);
        currentPosition++;
    }

    private void increment(String key) {
        int newvalue = keyValues.get(key);
        keyValues.put(key, ++newvalue);
        currentPosition++;
    }

    private void copy(String locationOne, String locationTwo) {
        int copyValue = parseInt(locationOne);
        keyValues.put(locationTwo, copyValue);
        currentPosition++;
    }

    private int parseInt(String intStringValue) {
        try{
            return Integer.parseInt(intStringValue);
        } catch(Exception e) {
            return keyValues.get(intStringValue);
        }
    }

    public void setUp(String input) {
        String[] registerNames = new String[] { "a", "b", "c", "d" };
        
        for(String s : registerNames) {
            keyValues.put(s, 0);
        }
        instructions = input.split("\n");
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwelve adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        adventOfCodeDayTwelve.setUp(input);

        System.out.println("result: " + adventOfCodeDayTwelve.executeInstructions());

        adventOfCodeDayTwelve = new AdventOfCodeDayTwelve();

        adventOfCodeDayTwelve.setUp(input);

        adventOfCodeDayTwelve.keyValues.put("c", 1);

        System.out.println("result: " + adventOfCodeDayTwelve.executeInstructions());
    }

    private static final String input = "cpy 1 a\n" +
                                        "cpy 1 b\n" +
                                        "cpy 26 d\n" +
                                        "jnz c 2\n" +
                                        "jnz 1 5\n" +
                                        "cpy 7 c\n" +
                                        "inc d\n" +
                                        "dec c\n" +
                                        "jnz c -2\n" +
                                        "cpy a c\n" +
                                        "inc a\n" +
                                        "dec b\n" +
                                        "jnz b -2\n" +
                                        "cpy c b\n" +
                                        "dec d\n" +
                                        "jnz d -6\n" +
                                        "cpy 16 c\n" +
                                        "cpy 12 d\n" +
                                        "inc a\n" +
                                        "dec d\n" +
                                        "jnz d -2\n" +
                                        "dec c\n" +
                                        "jnz c -5";
}
