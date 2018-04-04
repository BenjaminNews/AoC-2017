package AdventOfCode2017;

import java.util.ArrayList;
import java.util.HashMap;

public class AdventOfCodeDayTwentyThreeTest {

    ArrayList<String> commands = new ArrayList();
    HashMap<String, Integer> values = new HashMap<>();

    public void setUp(String input) {
        for(String s: input.split("\n")) {
            commands.add(s);
        }
        values.put("a", 0);
        values.put("b", 0);
        values.put("c", 0);
        values.put("d", 0);
        values.put("e", 0);
        values.put("f", 0);
        values.put("g", 0);
        values.put("h", 0);
    }

    public void move(String command) {
        String[] values = command.split(" ");

        if(values[0].equals("set")) {
            set(values);
        } else if(values[0].equals("sub")) {
            sub(values);
        } else if(values[0].equals("mul")) {
            mul(values);
        } else if(values[0].equals("jnz")) {
            jnz(values);
        }
    }

    private void jnz(String[] values) {

    }

    private void mul(String[] insertValues) {

        int keyValue = values.get(insertValues[1]);
        int multiplyValue = 0;

        if(isInt(insertValues[2])) {
            multiplyValue = Integer.parseInt(insertValues[2]);
        } else {
            multiplyValue = values.get(insertValues[2]);
        }

        values.put(insertValues[1], (keyValue * multiplyValue));
    }

    private void sub(String[] insertValues) {

        int keyValue = values.get(insertValues[1]);
        int updateValue = 0;

        if(isInt(insertValues[2])) {
            updateValue = Integer.parseInt(insertValues[2]);
        } else {
            updateValue = values.get(insertValues[2]);
        }

        values.put(insertValues[1], keyValue + updateValue);
    }

    private void set(String[] insertValues) {

        int updateValue = 0;

        if(isInt(insertValues[2])) {
            updateValue = Integer.parseInt(insertValues[2]);
        } else {
            updateValue = values.get(insertValues[2]);
        }
        
        values.put(insertValues[1], updateValue);
    }

    private boolean isInt(String s) {
        try{
            Integer.parseInt(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}