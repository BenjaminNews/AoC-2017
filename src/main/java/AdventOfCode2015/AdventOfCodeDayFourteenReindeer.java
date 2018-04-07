package AdventOfCode2015;

public class AdventOfCodeDayFourteenReindeer {
    private final int length;
    private final String name;
    private final int speed;
    private final int restTime;
    private int restimeCountDown;
    private int movementCountDown = 0;

    private int distanceTravelled = 0;

    private boolean isResting = false;

    private int score = 0;

    public AdventOfCodeDayFourteenReindeer(String name, int speed, int length, int restTime) {
        this.name = name;
        this.speed = speed;
        this.length = length;
        this.restTime = restTime;
        this.restimeCountDown = restTime;
    }

    public void fly() {
        if(!isResting && movementCountDown != length) {
            distanceTravelled += speed;
            movementCountDown++;
        } else {
            isResting = true;
            if(--restimeCountDown == 0) {
                isResting = false;
                movementCountDown = 0;
                restimeCountDown = restTime;
            }
        }
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public void incrementScore() {
        this.score++;
    }

    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }
}

