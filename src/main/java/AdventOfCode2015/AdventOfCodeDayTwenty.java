package AdventOfCode2015;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AdventOfCodeDayTwenty {

    public int getLowestHouseNumberForPresents(int presentAmount) {
        int houseNumber = 0;
        if(presentAmount == 10) {
            return 1;
        } else {
            while(true) {
                houseNumber++;
                int runningPresentCount = 10;
                for (int i = 1; i < houseNumber; i++) {
                    if (houseNumber % i == 0) {
                        runningPresentCount += (houseNumber / i) * 10;
                    }
                }
                if(houseNumber % 10000 == 0) {
                    System.out.println(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) + " " + houseNumber);
                }
                if (runningPresentCount >= presentAmount) {
                    return houseNumber;
                }
            }
        }
    }

    public int getLowestHouseNumberForPresentsPartTwo(int presentAmount) {
        int[] houses = new int[1000000];
        for(int x = 1; x < houses.length; x++) {
            int count = 0;
            for(int y = x; y < houses.length; y += x) {
                houses[y] += x * 11;
                if(++count == 50)
                    break;
            }
        }
        for(int i = 0; i < houses.length;i++) {
            if(houses[i] >= presentAmount) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwenty adventOfCodeDayTwenty = new AdventOfCodeDayTwenty();
        System.out.println(adventOfCodeDayTwenty.getLowestHouseNumberForPresents(36000000));
        adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartTwo();
    }
}