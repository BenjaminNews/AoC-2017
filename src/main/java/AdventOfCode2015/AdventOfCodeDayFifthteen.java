package AdventOfCode2015;

public class AdventOfCodeDayFifthteen {

    public int partOne() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(4, -2, 0, 0, 5);
        Cookie cookieB = new Cookie(0, 5, -1, 0, 8);
        Cookie cookieC = new Cookie(-1, 0, 5, 0, 6);
        Cookie cookieD = new Cookie(0, 0, -2, 2, 1);

        for(int a = 1; a < 100; a++) {
            for(int b = 1; b < 100; b++) {
                for(int c = 1; c < 100; c++) {
                    for(int d = 1; d < 100; d++) {
                        if((a + b + c + d) == 100) {
                            highestScore = getCookieScore(highestScore, cookieA, cookieB, cookieC, cookieD, a, b, c, d);
                        }
                    }
                }
            }
        }
        return highestScore;
    }

    public int partTwo() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(4, -2, 0, 0, 5);
        Cookie cookieB = new Cookie(0, 5, -1, 0, 8);
        Cookie cookieC = new Cookie(-1, 0, 5, 0, 6);
        Cookie cookieD = new Cookie(0, 0, -2, 2, 1);

        for(int a = 1; a < 100; a++) {
            for(int b = 1; b < 100; b++) {
                for(int c = 1; c < 100; c++) {
                    for(int d = 1; d < 100; d++) {
                        if((a + b + c + d) == 100) {
                            int calories = cookieA.getCaloriesScore(a) + cookieB.getCaloriesScore(b) + cookieC.getCaloriesScore(c) + cookieD.getCaloriesScore(d);
                            if(calories == 500) {
                                highestScore = getCookieScore(highestScore, cookieA, cookieB, cookieC, cookieD, a, b, c, d);
                            }
                        }
                    }
                }
            }
        }
        return highestScore;
    }

    private int getCookieScore(int highestScore, Cookie cookieA, Cookie cookieB, Cookie cookieC, Cookie cookieD, int a, int b, int c, int d) {
        int endCapacityScore = cookieA.getCapacityScore(a) + cookieB.getCapacityScore(b) + cookieC.getCapacityScore(c) + cookieD.getCapacityScore(d) > 0 ?
                               cookieA.getCapacityScore(a) + cookieB.getCapacityScore(b) + cookieC.getCapacityScore(c) + cookieD.getCapacityScore(d) : 0;
        int endDurabilityScore = cookieA.getDurabilityScore(a) + cookieB.getDurabilityScore(b) +cookieC.getDurabilityScore(c) + cookieD.getDurabilityScore(d) > 0 ?
                                 cookieA.getDurabilityScore(a) + cookieB.getDurabilityScore(b) +cookieC.getDurabilityScore(c) + cookieD.getDurabilityScore(d) : 0;
        int endFlavorScore = cookieA.getFlavorScore(a) + cookieB.getFlavorScore(b) + cookieC.getFlavorScore(c) + cookieD.getFlavorScore(d) > 0 ?
                             cookieA.getFlavorScore(a) + cookieB.getFlavorScore(b) + cookieC.getFlavorScore(c) + cookieD.getFlavorScore(d) : 0;
        int endTextureScore = cookieA.getTextureScore(a) + cookieB.getTextureScore(b) + cookieC.getTextureScore(c) + cookieD.getTextureScore(d) > 0 ?
                              cookieA.getTextureScore(a) + cookieB.getTextureScore(b) + cookieC.getTextureScore(c) + cookieD.getTextureScore(d) : 0;
        int totalScore = endCapacityScore * endDurabilityScore * endFlavorScore * endTextureScore;
        return totalScore > highestScore ? totalScore : highestScore;
    }

    public int partOneTest() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(-1, -2, 6, 3, 8);
        Cookie cookieB = new Cookie(2, 3, -2, -1, 3);
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                if (a + b == 100) {
                    highestScore = getCookieScoreForTests(highestScore, cookieA, cookieB, a, b);
                }
            }
        }
        return highestScore;
    }

    public int partTwoTest() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(-1, -2, 6, 3, 8);
        Cookie cookieB = new Cookie(2, 3, -2, -1, 3);
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                if (a + b == 100) {
                    int calories = cookieA.getCaloriesScore(a) + cookieB.getCaloriesScore(b);
                    if(calories == 500) {
                        highestScore = getCookieScoreForTests(highestScore, cookieA, cookieB, a, b);
                    }
                }
            }
        }
        return highestScore;
    }

    private int getCookieScoreForTests(int highestScore, Cookie cookieA, Cookie cookieB, int a, int b) {
        int endCapacityScore = cookieA.getCapacityScore(a) + cookieB.getCapacityScore(b) > 0 ?
                               cookieA.getCapacityScore(a) + cookieB.getCapacityScore(b) : 0;
        int endDurabilityScore = cookieA.getDurabilityScore(a) + cookieB.getDurabilityScore(b) > 0 ?
                                 cookieA.getDurabilityScore(a) + cookieB.getDurabilityScore(b) : 0;
        int endFlavorScore = cookieA.getFlavorScore(a) + cookieB.getFlavorScore(b) > 0 ?
                             cookieA.getFlavorScore(a) + cookieB.getFlavorScore(b) : 0;
        int endTextureScore = cookieA.getTextureScore(a) + cookieB.getTextureScore(b) > 0 ?
                              cookieA.getTextureScore(a) + cookieB.getTextureScore(b) : 0;
        int totalScore = endCapacityScore * endDurabilityScore * endFlavorScore * endTextureScore;
        return totalScore > highestScore ? totalScore : highestScore;
    }

    public static void main(String[] args) {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        System.out.println(adventOfCodeDayFifthteen.partOne());
        System.out.println(adventOfCodeDayFifthteen.partTwo());
    }

    private class Cookie {
        private int capacity;
        private int durability;
        private int flavor;
        private int texture;
        private int calories;

        Cookie (int capacity, int durability, int flavor, int texture, int calories) {
            this.capacity = capacity;
            this.durability = durability;
            this.flavor = flavor;
            this.texture = texture;
            this.calories = calories;
        }

        public int getCapacityScore(int scoops) {
            return scoops * capacity;
        }

        public int getDurabilityScore(int scoops) {
            return scoops * durability;
        }

        public int getFlavorScore(int scoops) {
            return scoops * flavor;
        }

        public int getTextureScore(int scoops) {
            return scoops * texture;
        }

        public int getCaloriesScore(int scoops) {
            return scoops * calories;
        }
    }
}
