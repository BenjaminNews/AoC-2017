package AdventOfCode2016;

import java.security.MessageDigest;

public class AdventOfCodeDayFourteen {

    public String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(input.getBytes("UTF-8"));
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++) {
                sb.append(String.format("%02x", array[i]));
            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public int getIndex(String input, int saltCodes) {
        int passCount = 0, startIndex = 0;
        while(passCount < saltCodes) {
            char tripleMatchResult = getTripleCharacter(md5(input + startIndex));
            if(tripleMatchResult != ' ') {
                for(int i = 1; i < 1000; i++) {
                    if(containsQuadChar(tripleMatchResult, md5(input + String.valueOf(startIndex + i)))) {
                        passCount++;
                        break;
                    }
                }
            }
            startIndex++;
        }
        return startIndex - 1;
    }

    private boolean containsQuadChar(char tripleChar, String md5ResultTwo) {
        char[] chars = md5ResultTwo.toCharArray();
        for(int i = 0; i + 4 < chars.length; i++) {
            if(chars[i] == tripleChar) {
                if(chars[i] == chars[i + 4] && chars[i] == chars[i + 3] && chars[i] == chars[i + 2] && chars[i] == chars[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private char getTripleCharacter(String md5Result) {
        char[] characters = md5Result.toCharArray();
        for(int i = 0; i + 2 < characters.length; i++) {
            if (characters[i] == characters[i + 1] && characters[i + 1] ==characters[i + 2]) {
                return characters[i];
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        AdventOfCodeDayFourteen adventOfCodeDayFourteen = new AdventOfCodeDayFourteen();
        System.out.println(adventOfCodeDayFourteen.getIndex("yjdafjpo", 64));
    }
}