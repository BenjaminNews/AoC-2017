package AdventOfCode2015;

public class AdventOfCodeDayFifthteen {

    void partOne() {
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

                            int cookieOneCapactiyScore = cookieA.getCapacityScore(a) ;
                            int cookieTwoCapactiyScore = cookieB.getCapacityScore(b);
                            int cookieThreeCapactiyScore = cookieC.getCapacityScore(c);
                            int cookieFourCapactiyScore = cookieD.getCapacityScore(d);

                            int endCapacityScore = (cookieOneCapactiyScore + cookieTwoCapactiyScore + cookieThreeCapactiyScore + cookieFourCapactiyScore) > 0 ?
                                                    cookieOneCapactiyScore + cookieTwoCapactiyScore + cookieThreeCapactiyScore + cookieFourCapactiyScore : 0;

                            int cookieOneDurabilityScore = cookieA.getDurabilityScore(a);
                            int cookieTwoDurabilityScore = cookieB.getDurabilityScore(b);
                            int cookieThreeDurabilityScore = cookieC.getDurabilityScore(c);
                            int cookieFourDurabilityScore = cookieD.getDurabilityScore(d);

                            int endDurabilityScore = (cookieOneDurabilityScore + cookieTwoDurabilityScore + cookieThreeDurabilityScore + cookieFourDurabilityScore) > 0 ?
                                                      cookieOneDurabilityScore + cookieTwoDurabilityScore + cookieThreeDurabilityScore + cookieFourDurabilityScore : 0;

                            int cookieOneFlavorScore = cookieA.getFlavorScore(a);
                            int cookieTwoFlavorScore = cookieB.getFlavorScore(b);
                            int cookieThreeFlavorScore = cookieC.getFlavorScore(c);
                            int cookieFourFlavorScore = cookieD.getFlavorScore(d);

                            int endFlavorScore = (cookieOneFlavorScore + cookieTwoFlavorScore + cookieThreeFlavorScore + cookieFourFlavorScore) > 0 ?
                                                  cookieOneFlavorScore + cookieTwoFlavorScore + cookieThreeFlavorScore + cookieFourFlavorScore : 0;

                            int cookieOneTextureScore = cookieA.getTextureScore(a);
                            int cookieTwoTextureScore = cookieB.getTextureScore(b);
                            int cookieThreeTextureScore = cookieC.getTextureScore(c);
                            int cookieFourTextureScore = cookieD.getTextureScore(d);

                            int endTextureScore = (cookieOneTextureScore + cookieTwoTextureScore + cookieThreeTextureScore + cookieFourTextureScore) > 0 ?
                                                   cookieOneTextureScore + cookieTwoTextureScore + cookieThreeTextureScore + cookieFourTextureScore : 0;


                            int totalScore = endCapacityScore * endDurabilityScore * endFlavorScore * endTextureScore;
                            if(totalScore > highestScore) {
                                System.out.println(totalScore);
                                highestScore = totalScore;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("highest score: " + highestScore);
    }

    public int forTest() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(-1, -2, 6, 3, 8);
        Cookie cookieB = new Cookie(2, 3, -2, -1, 3);
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                if (a + b == 100) {

                    int cookieOneCapactiyScore = cookieA.getCapacityScore(a) ;
                    int cookieTwoCapactiyScore = cookieB.getCapacityScore(b);
                    int cookieOneDurabilityScore = cookieA.getDurabilityScore(a);
                    int cookieTwoDurabilityScore = cookieB.getDurabilityScore(b);
                    int cookieOneFlavorScore = cookieA.getFlavorScore(a);
                    int cookieTwoFlavorScore = cookieB.getFlavorScore(b);
                    int cookieOneTextureScore = cookieA.getTextureScore(a);
                    int cookieTwoTextureScore = cookieB.getTextureScore(b);

                    int capacityScore = (cookieOneCapactiyScore + cookieTwoCapactiyScore) > 0 ? cookieOneCapactiyScore + cookieTwoCapactiyScore : 0 ;
                    int durabilityScore = (cookieOneDurabilityScore + cookieTwoDurabilityScore) > 0 ? cookieOneDurabilityScore + cookieTwoDurabilityScore : 0;
                    int flavorScore = (cookieOneFlavorScore + cookieTwoFlavorScore) > 0 ? cookieOneFlavorScore + cookieTwoFlavorScore : 0;
                    int textureScore = (cookieOneTextureScore + cookieTwoTextureScore) > 0 ? cookieOneTextureScore + cookieTwoTextureScore : 0;
                    int totalScore = capacityScore * durabilityScore * flavorScore * textureScore;
                    if(totalScore > highestScore) {
                        System.out.println(totalScore);
                        highestScore = totalScore;
                    }
                }
            }
        }
        System.out.println("highest score: " + highestScore);
        return highestScore;
    }

    void partTwo() {
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
                                int cookieOneCapactiyScore = cookieA.getCapacityScore(a);
                                int cookieTwoCapactiyScore = cookieB.getCapacityScore(b);
                                int cookieThreeCapactiyScore = cookieC.getCapacityScore(c);
                                int cookieFourCapactiyScore = cookieD.getCapacityScore(d);

                                int endCapacityScore = (cookieOneCapactiyScore + cookieTwoCapactiyScore + cookieThreeCapactiyScore + cookieFourCapactiyScore) > 0 ?
                                                        cookieOneCapactiyScore + cookieTwoCapactiyScore + cookieThreeCapactiyScore + cookieFourCapactiyScore : 0;

                                int cookieOneDurabilityScore = cookieA.getDurabilityScore(a);
                                int cookieTwoDurabilityScore = cookieB.getDurabilityScore(b);
                                int cookieThreeDurabilityScore = cookieC.getDurabilityScore(c);
                                int cookieFourDurabilityScore = cookieD.getDurabilityScore(d);

                                int endDurabilityScore = (cookieOneDurabilityScore + cookieTwoDurabilityScore + cookieThreeDurabilityScore + cookieFourDurabilityScore) > 0 ?
                                                          cookieOneDurabilityScore + cookieTwoDurabilityScore + cookieThreeDurabilityScore + cookieFourDurabilityScore : 0;

                                int cookieOneFlavorScore = cookieA.getFlavorScore(a);
                                int cookieTwoFlavorScore = cookieB.getFlavorScore(b);
                                int cookieThreeFlavorScore = cookieC.getFlavorScore(c);
                                int cookieFourFlavorScore = cookieD.getFlavorScore(d);

                                int endFlavorScore = (cookieOneFlavorScore + cookieTwoFlavorScore + cookieThreeFlavorScore + cookieFourFlavorScore) > 0 ?
                                                      cookieOneFlavorScore + cookieTwoFlavorScore + cookieThreeFlavorScore + cookieFourFlavorScore : 0;

                                int cookieOneTextureScore = cookieA.getTextureScore(a);
                                int cookieTwoTextureScore = cookieB.getTextureScore(b);
                                int cookieThreeTextureScore = cookieC.getTextureScore(c);
                                int cookieFourTextureScore = cookieD.getTextureScore(d);

                                int endTextureScore = (cookieOneTextureScore + cookieTwoTextureScore + cookieThreeTextureScore + cookieFourTextureScore) > 0 ?
                                                       cookieOneTextureScore + cookieTwoTextureScore + cookieThreeTextureScore + cookieFourTextureScore : 0;

                                int totalScore = endCapacityScore * endDurabilityScore * endFlavorScore * endTextureScore;
                                if (totalScore > highestScore) {
                                    System.out.println(totalScore);
                                    highestScore = totalScore;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("highest score: " + highestScore);
    }

    public int forTestPartTwo() {
        int highestScore = Integer.MIN_VALUE;
        Cookie cookieA = new Cookie(-1, -2, 6, 3, 8);
        Cookie cookieB = new Cookie(2, 3, -2, -1, 3);
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                if (a + b == 100) {
                    int calories = cookieA.getCaloriesScore(a) + cookieB.getCaloriesScore(b);
                    if(calories == 500) {
                        int cookieOneCapactiyScore = cookieA.getCapacityScore(a);
                        int cookieTwoCapactiyScore = cookieB.getCapacityScore(b);
                        int cookieOneDurabilityScore = cookieA.getDurabilityScore(a);
                        int cookieTwoDurabilityScore = cookieB.getDurabilityScore(b);
                        int cookieOneFlavorScore = cookieA.getFlavorScore(a);
                        int cookieTwoFlavorScore = cookieB.getFlavorScore(b);
                        int cookieOneTextureScore = cookieA.getTextureScore(a);
                        int cookieTwoTextureScore = cookieB.getTextureScore(b);

                        int capacityScore = (cookieOneCapactiyScore + cookieTwoCapactiyScore) > 0 ? cookieOneCapactiyScore + cookieTwoCapactiyScore : 0;
                        int durabilityScore = (cookieOneDurabilityScore + cookieTwoDurabilityScore) > 0 ? cookieOneDurabilityScore + cookieTwoDurabilityScore : 0;
                        int flavorScore = (cookieOneFlavorScore + cookieTwoFlavorScore) > 0 ? cookieOneFlavorScore + cookieTwoFlavorScore : 0;
                        int textureScore = (cookieOneTextureScore + cookieTwoTextureScore) > 0 ? cookieOneTextureScore + cookieTwoTextureScore : 0;
                        int totalScore = capacityScore * durabilityScore * flavorScore * textureScore;
                        if (totalScore > highestScore) {
                            System.out.println(totalScore);
                            highestScore = totalScore;
                        }
                    }
                }
            }
        }
        System.out.println("highest score: " + highestScore);
        return highestScore;
    }

    public static void main(String[] args) {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();

        //adventOfCodeDayFifthteen.partOne();
        adventOfCodeDayFifthteen.partTwo();
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
