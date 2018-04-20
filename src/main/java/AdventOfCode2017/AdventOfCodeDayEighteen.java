package AdventOfCode2017;

import java.util.HashMap;

public class AdventOfCodeDayEighteen {

    private int lastPlayedSound = -1;

    private HashMap<String, Integer> registerValues = new HashMap<String, Integer>();

    private static int currentPosition = 0;

    private boolean recovered = false;
    public void setUp() {
        String[] registerNames = new String[]{ "i", "a", "p", "b", "f" };
        for(String s: registerNames) { registerValues.put(s, 0); }
    }

    public void set(String x, String y) {
        registerValues.put(x, getValueofKey(y));
        currentPosition++;
    }

    public void add(String x, String y) {
        registerValues.put(x, getValueofKey(x) + getValueofKey(y));
        currentPosition++;
    }

    public void mul(String x, String y) {
        registerValues.put(x, getValueofKey(x) * getValueofKey(y));
        currentPosition++;
    }

    public void mod(String x, String y) {
        registerValues.put(x, getValueofKey(x) % getValueofKey(y));
        currentPosition++;
    }

    public void jgz(String x, String y) {
        if(getValueofKey(x) > 0) {
            currentPosition += getValueofKey(y);
        } else {
            currentPosition++;
        }
    }

    public void snd(String x) {
        lastPlayedSound = registerValues.get(x);
        currentPosition++;
    }

    public int rcv(String x) {
        if(getValueofKey(x) != 0) {
            set(x, String.valueOf(lastPlayedSound));
            currentPosition++;
            System.out.println("a value: " + getValueofKey("a"));
            System.out.println("b value: " + getValueofKey("b"));

            return lastPlayedSound;
        } else {
            currentPosition++;
        }
        return 0;
    }

    private int getValueofKey(String checkValue) {
        try {
            return(Integer.parseInt(checkValue));
        } catch(Exception e) {
            return(registerValues.get(checkValue));
        }
    }

    private void performAction(String action) {
        if(action.startsWith("snd")) {
            snd(action.split(" ")[1]);
        } else if(action.startsWith("set")) {
            set(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("add")) {
            add(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("mul")) {
            mul(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("mod")) {
            mod(action.split(" ")[1], action.split(" ")[2]);
        } else if(action.startsWith("rcv")) {
            rcv(action.split(" ")[1]);
        } else if(action.startsWith("jgz")) {
            jgz(action.split(" ")[1], action.split(" ")[2]);
        }
    }

    public int getRecovery() {
        return lastPlayedSound;
    }

    public int performActions(String actions) {
        String[] actionsToPerform = actions.split("\n");

        while(recovered == false && currentPosition < actionsToPerform.length) {
            String instruction = actionsToPerform[currentPosition];
            if(instruction.startsWith("rcv")) {
                int x = rcv(instruction.split(" ")[1]);
                if(x != 0) {
                    return lastPlayedSound;
                }
            } else {
                performAction(instruction);
            }
        }
        return lastPlayedSound;
    }

    public static void main(String[] args) {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        adventOfCodeDayEighteen.setUp();

        adventOfCodeDayEighteen.performActions(input);
        int result = adventOfCodeDayEighteen.getRecovery();
        System.out.println("last played sound: " + result);
    }

    private static String input =  "set i 31\n" +
                                    "set a 1\n" +
                                    "mul p 17\n" +
                                    "jgz p p\n" +
                                    "mul a 2\n" +
                                    "add i -1\n" +
                                    "jgz i -2\n" +
                                    "add a -1\n" +
                                    "set i 127\n" +
                                    "set p 735\n" +
                                    "mul p 8505\n" +
                                    "mod p a\n" +
                                    "mul p 129749\n" +
                                    "add p 12345\n" +
                                    "mod p a\n" +
                                    "set b p\n" +
                                    "mod b 10000\n" +
                                    "snd b\n" +
                                    "add i -1\n" +
                                    "jgz i -9\n" +
                                    "jgz a 3\n" +
                                    "rcv b\n" +
                                    "jgz b -1\n" +
                                    "set f 0\n" +
                                    "set i 126\n" +
                                    "rcv a\n" +
                                    "rcv b\n" +
                                    "set p a\n" +
                                    "mul p -1\n" +
                                    "add p b\n" +
                                    "jgz p 4\n" +
                                    "snd a\n" +
                                    "set a b\n" +
                                    "jgz 1 3\n" +
                                    "snd b\n" +
                                    "set f 1\n" +
                                    "add i -1\n" +
                                    "jgz i -11\n" +
                                    "snd a\n" +
                                    "jgz f -16\n" +
                                    "jgz a -19";
}

