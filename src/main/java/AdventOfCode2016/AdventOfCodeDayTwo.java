package AdventOfCode2016;

public class AdventOfCodeDayTwo {

    private String commands[];
    private String passcode = "";

    private int position = 5;

    public void setup(String input) {
        commands = input.split("\n");
    }

    public String getPasscode() {
        for(String command : commands) {
            for(String step : command.split("")) {
                if(step.equals("U")) {
                    stepUp();
                } else if(step.equals("L")) {
                    stepLeft();
                } else if(step.equals("D")) {
                    stepDown();
                } else if(step.equals("R")) {
                    stepRight();
                }
            }
            passcode += String.valueOf(position);
        }
        return passcode;
    }

    public String getPassCodeTwo() {
        for(String command : commands) {
            for(String step : command.split("")) {
                if(step.equals("U")) {
                    stepUpTwo();
                } else if(step.equals("L")) {
                    stepLeftTwo();
                } else if(step.equals("D")) {
                    stepDownTwo();
                } else if(step.equals("R")) {
                    stepRightTwo();
                }
            }
            buildPassCode();
        }
        return passcode;
    }

    private void buildPassCode() {
        if(position == 10) {
           passcode += "A";
        } else if(position == 11) {
            passcode += "B";
        } else if(position == 12) {
            passcode += "C";
        } else if(position == 13) {
            passcode += "D";
        } else {
            passcode += String.valueOf(position);
        }
    }

    private void stepUp() {

        if(position > 3) {
            position -= 3;
        }
    }

    private void stepDown() {
        if(position < 7) {
            position += 3;
        }
    }

    private void stepLeft() {
        if(position % 3 != 1) {
            position--;
        }
    }

    private void stepRight() {
        if((position + 1) % 3 != 1) {
            position++;
        }
    }

    private void stepRightTwo() {
        if((position > 1 && position < 5) || (position > 4 && position < 9) || (position > 9 && position < 12)) {
            position += 1;
        }
    }

    private void stepDownTwo() {
        if(position == 11 || position == 1) {
            position += 2;
        } else if((position % 4 != 1) && position != 10 && position != 12) {
            position += 4;
        }
    }

    private void stepLeftTwo() {
        if((position < 5 && position > 2) || (position < 10 && position > 5) || (position < 13 && position > 10)) {
            position--;
        }
    }

    private void stepUpTwo() {
        if(position == 13) {
            position = 11;
        } else if(position == 3) {
            position = 1;
        }  else if ((position % 4 != 1) && position != 2 && position != 4 && position != 1) {
            position -= 4;
        }
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();
        adventOfCodeDayTwo.setup(input);
        System.out.println("pass code: " + adventOfCodeDayTwo.getPasscode());

        adventOfCodeDayTwo.position = 5;
        adventOfCodeDayTwo.passcode = "";
        System.out.println("second pass code: " + adventOfCodeDayTwo.getPassCodeTwo());
    }

    private static final String input = "LLRRLLRLDDUURLLRDUUUDULUDLUULDRDDDULLLRDDLLLRRDDRRUDDURDURLRDDULRRRLLULLULLRUULDLDDDUUURRRRURURDUDLLRRLDLLRRDRDLLLDDRRLUDDLDDLRDRDRDDRUDDRUUURLDUDRRLULLLDRDRRDLLRRLDLDRRRRLURLLURLRDLLRUDDRLRDRRURLDULURDLUUDURLDRURDRDLULLLLDUDRLLURRLRURUURDRRRULLRULLDRRDDDULDURDRDDRDUDUDRURRRRUUURRDUUDUDDDLRRUUDDUUDDDUDLDRDLRDUULLRUUDRRRDURLDDDLDLUULUDLLRDUDDDDLDURRRDRLLRUUUUDRLULLUUDRLLRDLURLURUDURULUDULUDURUDDULDLDLRRUUDRDDDRLLRRRRLDRRRD\n" +
            "DRRRDULLRURUDRLRDLRULRRLRLDLUDLUURUUURURULRLRUDRURRRLLUDRLLDUDULLUUDLLUUUDDRLRUDDDDLDDUUDULDRRRDULUULDULDRUUULRUDDDUDRRLRLUDDURLLDRLUDUDURUUDRLUURRLUUUDUURUDURLUUUDRDRRRDRDRULLUURURDLUULLDUULUUDULLLDURLUDRURULDLDLRDRLRLUURDDRLDDLRRURUDLUDDDLDRLULLDRLLLURULLUURLUDDURRDDLDDDDRDUUULURDLUUULRRLRDLDRDDDRLLRUDULRRRUDRRLDRRUULUDDLLDUDDRLRRDLDDULLLRDURRURLLULURRLUULULRDLULLUUULRRRLRUDLRUUDDRLLLLLLLURLDRRUURLDULDLDDRLLLRDLLLDLRUUDRURDRDLUULDDRLLRRURRDULLULURRDULRUDUDRLUUDDDDUULDDDUUDURLRUDDULDDDDRUULUUDLUDDRDRD\n" +
            "RRRULLRULDRDLDUDRRDULLRLUUDLULLRUULULURDDDLLLULRURLLURUDLRDLURRRLRLDLLRRURUDLDLRULDDULLLUUDLDULLDRDLRUULDRLURRRRUDDLUDLDDRUDDUULLRLUUDLUDUDRLRUULURUDULDLUUDDRLLUUURRURUDDRURDLDRRDRULRRRRUUUDRDLUUDDDUDRLRLDRRRRUDDRLLRDRLUDRURDULUUURUULLRDUUULRULRULLRULRLUDUDDULURDDLLURRRULDRULDUUDDULDULDRLRUULDRDLDUDRDUDLURLLURRDLLDULLDRULDLLRDULLRURRDULUDLULRRUDDULRLDLDLLLDUDLURURRLUDRRURLDDURULDURRDUDUURURULLLUDDLDURURRURDDDRRDRURRUURRLDDLRRLDDULRLLLDDUDRULUULLULUULDRLURRRLRRRLDRRLULRLRLURDUULDDUDLLLUURRRLDLUDRLLLRRUU\n" +
            "URLDDDLDRDDDURRRLURRRRLULURLDDUDRDUDDLURURLLRDURDDRLRUURLDLLRDLRUUURLRLDLDRUDDDULLDULLDUULURLDRDUDRRLRRLULRDDULUDULDULLULDLRRLRRLLULRULDLLDULRRLDURRRRDLURDLUDUUUDLURRRRRUDDUDUUDULDLURRDRLRLUDUDUUDULDDURUDDRDRUDLRRUDRULDULRDRLDRUDRLLRUUDDRLURURDRRLRURULLDUUDRDLULRUULUDURRULLRLUUUUUDULRLUUDRDUUULLULUDUDDLLRRLDURRDDDLUDLUUDULUUULDLLLLUUDURRUDUDLULDRRRULLLURDURDDLRRULURUDURULRDRULLRURURRUDUULRULUUDDUDDUURLRLURRRRDLULRRLDRRDURUDURULULLRUURLLDRDRURLLLUUURUUDDDLDURRLLUUUUURLLDUDLRURUUUDLRLRRLRLDURURRURLULDLRDLUDDULLDUDLULLUUUDLRLDUURRR\n" +
            "RLLDRDURRUDULLURLRLLURUDDLULUULRRRDRLULDDRLUDRDURLUULDUDDDDDUDDDDLDUDRDRRLRLRLURDURRURDLURDURRUUULULLUURDLURDUURRDLDLDDUURDDURLDDDRUURLDURRURULURLRRLUDDUDDDLLULUDUUUDRULLLLULLRDDRDLRDRRDRRDLDLDDUURRRDDULRUUURUDRDDLRLRLRRDLDRDLLDRRDLLUULUDLLUDUUDRDLURRRRULDRDRUDULRLLLLRRULDLDUUUURLDULDDLLDDRLLURLUDULURRRUULURDRUDLRLLLRDDLULLDRURDDLLDUDRUDRLRRLULLDRRDULDLRDDRDUURDRRRLRDLDUDDDLLUDURRUUULLDRLUDLDRRRRDDDLLRRDUURURLRURRDUDUURRDRRUDRLURLUDDDLUDUDRDRURRDDDDRDLRUDRDRLLDULRURULULDRLRLRRLDURRRUL";
}