package AdventOfCode2017;

import java.util.HashMap;

public class AdventOfCodedayTwentyThree {

    private HashMap<String, Integer> registerValues = new HashMap<String, Integer>();

    private static int currentPosition = 0;

    private int multiplyCount = 0;

    public void setUp() {
        String[] registerNames = new String[]{ "a", "b", "c", "d", "e", "f", "g", "h"};
        for(String s: registerNames) { registerValues.put(s, 0); }
    }

    public void set(String x, String y) {
        registerValues.put(x, getValueofKey(y));
        currentPosition++;
    }

    public void sub(String x, String y) {
        registerValues.put(x, getValueofKey(x) - getValueofKey(y));
        currentPosition++;
    }

    public void mul(String x, String y) {
        registerValues.put(x, getValueofKey(x) * getValueofKey(y));
        currentPosition++;
        multiplyCount++;
    }
    public void jnz(String x, String y) {
        if(getValueofKey(x) != 0) {
            currentPosition += getValueofKey(y);
        } else {
            currentPosition++;
        }
    }

    private int getValueofKey(String checkValue) {
        try {
            return(Integer.parseInt(checkValue));
        } catch(Exception e) {
            return(registerValues.get(checkValue));
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getValue(String key) {
        return registerValues.get(key);
    }

    private void performAction(String action) {
        if(action.startsWith("set")) {
            set(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("sub")) {
            sub(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("mul")) {
            mul(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("jnz")) {
            jnz(action.split(" ")[1], action.split(" ")[2]);
        }
    }

    public static void main(String[] args) {
        AdventOfCodedayTwentyThree adventOfCodedayTwentyThree = new AdventOfCodedayTwentyThree();
        adventOfCodedayTwentyThree.setUp();

        String[] instructions = commands.split("\n");
        while(currentPosition < instructions.length) {
            String instruction = instructions[currentPosition];
            adventOfCodedayTwentyThree.performAction(instruction);
        }
        System.out.println(adventOfCodedayTwentyThree.multiplyCount);
    }

    private static final String commands =  "set a 0\n" +
                                            "set b 79\n" +
                                            "set c b\n" +
                                            "jnz a 2\n" +
                                            "jnz 1 5\n" +
                                            "mul b 100\n" +
                                            "sub b -100000\n" +
                                            "set c b\n" +
                                            "sub c -17000\n" +
                                            "set f 1\n" +
                                            "set d 2\n" +
                                            "set e 2\n" +
                                            "set g d\n" +
                                            "mul g e\n" +
                                            "sub g b\n" +
                                            "jnz g 2\n" +
                                            "set f 0\n" +
                                            "sub e -1\n" +
                                            "set g e\n" +
                                            "sub g b\n" +
                                            "jnz g -8\n" +
                                            "sub d -1\n" +
                                            "set g d\n" +
                                            "sub g b\n" +
                                            "jnz g -13\n" +
                                            "jnz f 2\n" +
                                            "sub h -1\n" +
                                            "set g b\n" +
                                            "sub g c\n" +
                                            "jnz g 2\n" +
                                            "jnz 1 3\n" +
                                            "sub b -17\n" +
                                            "jnz 1 -23";
}
