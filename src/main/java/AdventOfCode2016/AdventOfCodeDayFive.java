package AdventOfCode2016;

import java.security.MessageDigest;

public class AdventOfCodeDayFive {

    public String partOne(String data) {
        String result = "";
        int x = 0;
        while (result.length() < 8) {
            String hash = md5(data + x);
            if (hash.startsWith("00000")) {
                result += hash.charAt(5);
            }
            x++;
        }
        return result;
    }

    public String partTwo(String data) {
        String[] result = new String[8];
        int x = 0;
        while(hasNullElement(result)) {
            String hash = md5(data + x);
            if (hash.startsWith("00000")) {
                if ((int)hash.charAt(5) > 47 && (int)hash.charAt(5) < 56) {
                    int position = Integer.parseInt(String.valueOf(hash.charAt(5)));
                    if (result[position] == null) {
                        result[position] = String.valueOf(hash.charAt(6));
                    }
                }
            }
            x++;
        }
        return printArray(result);
    }

    private String printArray(String[] result) {
        String s = "";
        for(String s1 : result) {
            s+= s1;
        }
        return s;
    }

    private boolean hasNullElement(String[] checkValues) {
        for (String s: checkValues) {
            if (s == null) { return true; }
        }
        return false;
    }

    public String md5( String input ) {
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

    public static void main(String[] args) {
        AdventOfCodeDayFive adventOfCodeDayFive = new AdventOfCodeDayFive();
        String input = "ojvtpuvg";
        System.out.println(adventOfCodeDayFive.partOne(input));
        System.out.println(adventOfCodeDayFive.partTwo(input));
    }
}