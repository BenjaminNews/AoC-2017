package AdventOfCode2015;

public class AdventOfCodeDayTen {

    public String getStepResult(String input) {
        String startValue = input;
        String result = "";

        char[] values = startValue.toCharArray();
        for (int checkPoint = 0; checkPoint < values.length; checkPoint++) {
            int count = 1;
            for (int nextCharPosition = checkPoint + 1; nextCharPosition < values.length; nextCharPosition++) {
                if (values[checkPoint] == values[nextCharPosition]) {
                    count++;
                } else {
                    break;
                }
            }
            result += String.valueOf(count) + Character.toString(values[checkPoint]);
            checkPoint += count - 1;
        }

        return result;
    }

    public String performRounds(String input, int count) {
        for(int i = 0; i < count; i++) {
            input = getStepResult(input);
            System.out.println("i: " + i + " " + input);
        }
        return input;
    }

    public static void main(String[] args) {
        AdventOfCodeDayTen adventOfCodeDayTen = new AdventOfCodeDayTen();
        String input = "1113222113";
        String result = adventOfCodeDayTen.performRounds(input, 40);
        System.out.println(result);
        System.out.println("\n\nlength of result: " + result.length());;
        result = adventOfCodeDayTen.performRounds(result, 10);
        System.out.println(result);
        System.out.println("length of result: " + result.length());
    }
}
