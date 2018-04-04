package AdventOfCode2016;

import java.util.ArrayList;

public class AdventOfCodeDayNine {

    ArrayList<Integer> openBracketIndexes = new ArrayList<>();
    ArrayList<Integer> closeBracketIndexes = new ArrayList<>();

    public int getDecompressedLength(String input) {

        getIndexesOfBrackets(input);
        int decompressedLength = 0;
        if(!input.contains("(")) {
            return input.length();
        }
        for(int i = 0; i < closeBracketIndexes.size(); i++) {
            getIndexesOfBrackets(input);
            int indexValue = closeBracketIndexes.get(i);
            if(input.charAt(indexValue + 1) == '(') {
                closeBracketIndexes.remove(i + 1);
                openBracketIndexes.remove(i + 1);
            } else {
                //d the insert without removing from the arrayLists
                String values = input.substring(openBracketIndexes.get(i) + 1, closeBracketIndexes.get(i));
                int characterRange = Integer.parseInt(values.split("x")[0]) + 1;
                int amount = Integer.parseInt(values.split("x")[1]);
                String insertValue = input.substring(closeBracketIndexes.get(i) + 1, closeBracketIndexes.get(i) + characterRange);
                String built = "";
                for(int x = 1; x < amount; x++) {
                    built += insertValue;
                }

                input  = input.replace("(" + values + ")", built);
                decompressedLength += input.length();
            }

        }
        return decompressedLength;

    }
//        String result = "";
//        if(input.contains("(")) {
//            char[] elements = input.toCharArray();
//            for(int i = 0; i < elements.length; i++) {
//                if(elements[i] == '(') {
//                    int x = i + 1;
//                    String value = "";
//                    while(elements[x] != ')') {
//                        value += elements[x];
//                        x++;
//                    }
//                    System.out.println(value);
//                    result += multiplyValues(input, value);
//                }
//            }
//        } else {
//           return input.length();
//        }
//        return result.length();
//    }

    private String multiplyValues(String input, String value) {
        int numberOfCharsToCopy = Integer.parseInt(value.split("x")[0]);
        int timesToCopy = Integer.parseInt(value.split("x")[1]);

        int startIndex = input.indexOf(')');

        String subset = input.substring(startIndex + 1, startIndex + (numberOfCharsToCopy + 1));
        String insertValue = "";
        for (int count = 0; count < timesToCopy - 1; count++) {
            insertValue += subset;
        }

        input = input.replace("(" + numberOfCharsToCopy + "x" + timesToCopy + ")", insertValue);
        return input;
    }

    private void getIndexesOfBrackets(String input) {
        char[] values = input.toCharArray();
        for(int i = 0; i < values.length; i++) {
            if(values[i] == '(') {
                openBracketIndexes.add(i);
            } else if(values[i] == ')') {
                closeBracketIndexes.add(i);
            }
        }
    }
}
