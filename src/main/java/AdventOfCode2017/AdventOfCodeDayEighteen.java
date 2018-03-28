package AdcentOfCode2017;

import java.util.HashMap;

public class AdventOfCodeDayEighteen {

    private HashMap<String, Integer> notes = new HashMap<String, Integer>();
    private HashMap<String, Integer> notesPlayed = new HashMap<String, Integer>();

    private int instructionPosition = 0;

    private String lastPlayedSound;

    private void setup() {
        notes.put("i", 0);
        notes.put("a", 0);
        notes.put("p", 0);
        notes.put("b", 0);
        notes.put("f", 0);
        notes.put("1", 0);
    }

    public int getRecovery(String input) {

        String[] commands = input.split("\n");

        for (int i = 0; i < commands.length; i++) {
            String[] commandInstructions = commands[i].split(" ");

            String instruction = commandInstructions[0];
            String key = commandInstructions[1];
            System.out.println(instruction);
            if(instruction.equals("set")) {
                set(commandInstructions[2], key);
            } else if(instruction.equals("add")) {
                add(commandInstructions[2], key);
            } else if(instruction.equals("mul")) {
                multiply(commandInstructions[2], key);
            } else if(instruction.equals("mod")) {
                mod(commandInstructions[2], key);
            } else if(instruction.equals("jgz")) {
                jgz(commandInstructions[2], key);
            } else if(instruction.equals("snd")) {
                snd(key);
            } else if(commands.equals("rcv")) {
                rcv();
            }
        }

        return notesPlayed.get(lastPlayedSound);
    }

    private void rcv() {
        if(notesPlayed.containsKey(lastPlayedSound)) {
            if(notesPlayed.get(lastPlayedSound) != 0) {
                System.out.println("last played sound: " + lastPlayedSound + " " + notesPlayed.get(lastPlayedSound));
            }
        }
    }

    private void snd(String key) {
        System.out.println("playing sound of (" + key + "): " + notes.get(key));
        notesPlayed.put(key, notes.get(key));
        lastPlayedSound = key;
    }

    private void jgz(String commandInstruction, String key) {
        int updateValueOne = notes.get(key);
        if(updateValueOne > 0) {
            int newSetValue;
            if (isInt(commandInstruction)) {
                newSetValue = Integer.parseInt(commandInstruction);
            } else {
                newSetValue = notes.get(key);
            }
            instructionPosition += updateValueOne + newSetValue;
        } else {
            instructionPosition++;
        }
    }

    private void mod(String commandInstruction, String key) {
        int updateValueOne = notes.get(key);
        int newSetValue;
        if(isInt(commandInstruction)) {
            newSetValue = Integer.parseInt(commandInstruction);
        } else {
            newSetValue = notes.get(key);
        }
        if(updateValueOne != 0) {
            notes.replace(key, updateValueOne % newSetValue);
        }
        instructionPosition++;
    }

    private void multiply(String commandInstruction, String key) {
        int updateValueOne = notes.get(key);
        int newSetValue;
        if(isInt(commandInstruction)) {
            newSetValue = Integer.parseInt(commandInstruction);
        } else {
            newSetValue = notes.get(key);
        }
        notes.replace(key, updateValueOne * newSetValue);
        instructionPosition++;
    }

    private void add(String commandInstruction, String key) {
        int updateValueOne = notes.get(key);
        int newSetValue;
        if(isInt(commandInstruction)) {
            newSetValue = Integer.parseInt(commandInstruction);
        } else {
            newSetValue = notes.get(key);
        }
        notes.replace(key, updateValueOne * newSetValue);
        instructionPosition++;
    }

    private void set(String commandInstruction, String key) {
        String updateValue = commandInstruction;
        int newSetValue = 0;
        if(isInt(updateValue)) {
            newSetValue = Integer.parseInt(updateValue);
        } else {
            newSetValue = notes.get(key);
        }
        if(notes.containsKey(key)) {
            notes.replace(key, newSetValue);
        } else {
            notes.put(key, newSetValue);
        }
        instructionPosition++;
    }

    private boolean isInt(String s) {
        try{
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AdventOfCodeDayEighteen adventOfCodeDayEighteen = new AdventOfCodeDayEighteen();
        adventOfCodeDayEighteen.setup();
        int result = adventOfCodeDayEighteen.getRecovery(input);
    }

    private static String input = "set i 31\n" +
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

