package AdventOfCode2015;

public class AdventOfCodeDayTwenty {

    public int getLowestHouseNumberForPresentsPartOne(int presentAmount) {
        int[] houses = new int[1000000];
        for(int x = 1; x < houses.length; x++) {
            for(int y = x; y < houses.length; y += x) {
                houses[y] += x * 10;
            }
        }
        for(int i = 0; i < houses.length;i++) {
            if(houses[i] >= presentAmount) {
                return i;
            }
        }
        return -1;
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
        System.out.println(adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartOne(36000000));
        System.out.println(adventOfCodeDayTwenty.getLowestHouseNumberForPresentsPartTwo(36000000));
    }
}