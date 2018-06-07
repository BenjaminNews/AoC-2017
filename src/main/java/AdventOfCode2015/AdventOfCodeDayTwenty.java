package AdventOfCode2015;

import java.util.ArrayList;

public class AdventOfCodeDayTwenty {

    public int getDeliveredPresents(int houseNumber) {
        ArrayList<Integer> perfectlyDivided = new ArrayList<Integer>();
        if(houseNumber == 1) {
            return 10;
        } else {
            perfectlyDivided.add(houseNumber);
            for (int i = 1; i < houseNumber; i++) {
                if (houseNumber % i == 0) {
                    perfectlyDivided.add(i);
                }
            }
            int totalPresents = 0;
            for (int i : perfectlyDivided) {
                totalPresents += houseNumber / i * 10;
            }
            return totalPresents;
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        int i = 1;
        int numberOfPresents = adventOfCodeDayTwenty.getDeliveredPresents(i);
        i++;
        while(numberOfPresents < 36000000) {
            if(adventOfCodeDayTwenty.getDeliveredPresents(i) > numberOfPresents) {
                numberOfPresents = adventOfCodeDayTwenty.getDeliveredPresents(i);
                System.out.println(i + " presents: " + numberOfPresents);
            }
            i++;
        }
    }
}
