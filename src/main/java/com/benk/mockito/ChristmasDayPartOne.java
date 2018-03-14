package com.benk.mockito;

import java.util.List;

public class ChristmasDayPartOne {

    private StringSplitter stringSplitter;

    public ChristmasDayPartOne(StringSplitter stringSplitter) {
        this.stringSplitter = stringSplitter;
    }

    public int partOne(String input) { // 1122
        List<String> stringSections = stringSplitter.split(input);

        int result = 0;
        for (int i = 0; i < stringSections.size(); i++) {
            String section = stringSections.get(i);
            String nextSection;

            if (i + 1 < stringSections.size()) {
                nextSection = stringSections.get(i+1);
            } else {
                nextSection = stringSections.get(0);
            }

            if (section.equals(nextSection)) {
                result += Integer.parseInt(section);
            }
        }
        return result;
    }
}
