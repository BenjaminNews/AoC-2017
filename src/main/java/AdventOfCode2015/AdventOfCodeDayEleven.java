package AdventOfCode2015;

public class AdventOfCodeDayEleven {

    byte[] asciiArray;

    public String getPassword(String input) {
        asciiArray = input.getBytes();

        boolean valid = false;
        while(valid == false)
        if(doesntContainInvalidCharacters() && hasIncrementingMatchingCharacters() && hasPair() ) {
            return getArrayAsString();
        } else {
            incrementAsciiArray(asciiArray);
        }
        return "no passwords found for input: " + input;
    }

    private boolean hasIncrementingMatchingCharacters() {
        for(int i = 0; i < asciiArray.length - 2; i++) {
            int checkValOne = asciiArray[i];
            int checkValTwo = asciiArray[i+1];
            int checkValThree = asciiArray[i+2];
            if((checkValOne + 1 == checkValTwo) && (checkValTwo + 1 == checkValThree)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasPair() {
        int matchingPairs = 0;
        for(int i = 0; i < asciiArray.length - 1; i++) {
            if (asciiArray[i] == asciiArray [i + 1]) {
                matchingPairs++;
                i++;
            }
        }
        if(matchingPairs > 1) {
            return true;
        }
        return false;
    }

    private boolean doesntContainInvalidCharacters() {

        if(getArrayAsString().contains("i") || getArrayAsString().contains("o") || getArrayAsString().contains("l")) {
            return false;
        }
        return true;
    }

    private void incrementAsciiArray(byte[] asciiArray) {
        int incrementPosition = asciiArray.length - 1;

        if(asciiArray[incrementPosition] >= 122) {
            asciiArray[incrementPosition] = 97;
            if(asciiArray[incrementPosition - 1] >= 122) {
                asciiArray[incrementPosition - 1] = 97;
                if(asciiArray[incrementPosition - 2] >= 122) {
                    asciiArray[incrementPosition - 2] = 97;
                    if(asciiArray[incrementPosition - 3] >= 122) {
                        asciiArray[incrementPosition - 3] = 97;
                        if(asciiArray[incrementPosition - 4] >= 122) {
                            asciiArray[incrementPosition - 4] = 97;
                            if(asciiArray[incrementPosition - 5] >= 122) {
                                asciiArray[incrementPosition - 5] = 97;
                            } else {
                                asciiArray[incrementPosition - 5]++;
                            }
                        } else {
                            asciiArray[incrementPosition - 4]++;
                        }
                    } else {
                        asciiArray[incrementPosition - 3]++;
                    }
                } else {
                    asciiArray[incrementPosition - 2]++;
                }
            } else {
                asciiArray[incrementPosition - 1]++;
            }
        } else {
            asciiArray[incrementPosition]++;
        }
    }

    public String getArrayAsString() {
        String arrayString = "";
        for(byte b : asciiArray) {
            arrayString += (char)b;
        }
        return arrayString;
    }

    public static void main(String[] args) {
        AdventOfCodeDayEleven adventOfCodeDayEleven = new AdventOfCodeDayEleven();
        String input = "hepxcrrq";

        String passwordOne = adventOfCodeDayEleven.getPassword(input);
        System.out.println("password one: " + passwordOne);

        String passwordTwo = adventOfCodeDayEleven.getPassword("hepxxzaa");
        System.out.println("password two: " + passwordTwo);
    }
}
