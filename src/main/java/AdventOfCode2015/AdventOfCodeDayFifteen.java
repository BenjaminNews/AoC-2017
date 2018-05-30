package AdventOfCode2015;

public class AdventOfCodeDayFifthteen {

    public void testy(int size) {
        for(int w = 0; w < size; w++) {
            for(int x = 0; x < size; x++) {
                for(int y = 0; y < size; y++) {
                    for(int z = 0; z < size; z++) {
                        if(w+ x + y + z == size) {
                            System.out.println(w + ", " + x + ", " + y + ", " + z);
                        }
                    }
                }

            }
        }
    }

    //Butterscotch: capacity -1, durability -2, flavor 6, texture 3, calories 8
    private int getButterScotchScore(int amount) {
        int score = -1 * amount > 0 ? -1 * amount : 0;
        score += -2 * amount > 0 ? -2 * amount : 0;
        score += 6 * amount > 0 ? 6 * amount : 0;
        score += 3 * amount > 0 ? 3 * amount : 0;
        return score;
    }

    //Cinnamon: capacity 2, durability 3, flavor -2, texture -1, calories 3
    private int getCinnamonScore(int amount) {
        int score = 2 * amount > 0 ? 3 * amount : 0;
        score += 3 * amount > 0 ? 3 * amount : 0;
        score += -2 * amount > 0 ? -2 * amount : 0;
        score += 1 * amount > 0 ? 1 * amount : 0;
        return score;
    }

    public static void main(String[] args) {
        AdventOfCodeDayFifthteen adventOfCodeDayFifthteen = new AdventOfCodeDayFifthteen();
        adventOfCodeDayFifthteen.testy(5);
    }
}
