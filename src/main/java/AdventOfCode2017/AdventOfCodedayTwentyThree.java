package AdventOfCode2017;

import java.util.HashMap;

public class AdventOfCodedayTwentyThree {

    private HashMap<String, Long> registerValues = new HashMap<String, Long>();

    private int currentPosition = 0;

    private int multiplyCount = 0;

    public void setUp() {
        String[] registerNames = new String[]{ "a", "b", "c", "d", "e", "f", "g", "h"};
        for(String s: registerNames) { registerValues.put(s, 0l); }
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

    private long getValueofKey(String checkValue) {
        try {
            return(Long.parseLong(checkValue));
        } catch(Exception e) {
            return(registerValues.get(checkValue));
        }
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public long getValue(String key) {
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
        adventOfCodedayTwentyThree.set("a", "1");
        String[] instructions = commands.split("\n");
        while(adventOfCodedayTwentyThree.currentPosition < instructions.length) {
            String instruction = instructions[adventOfCodedayTwentyThree.currentPosition];
            adventOfCodedayTwentyThree.performAction(instruction);
        }
        System.out.println(adventOfCodedayTwentyThree.multiplyCount);
//
//        adventOfCodedayTwentyThree = new AdventOfCodedayTwentyThree();
//        adventOfCodedayTwentyThree.setUp();
//        adventOfCodedayTwentyThree.registerValues.put("a", 1l);
//
//        while(adventOfCodedayTwentyThree.currentPosition < instructions.length) {
//            String instruction = instructions[adventOfCodedayTwentyThree.currentPosition];
//            adventOfCodedayTwentyThree.performAction(instruction);
//        }
//        System.out.println(adventOfCodedayTwentyThree.getValueofKey("h"));
    }

    private static final String commands =  "set b 79\n" +
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
