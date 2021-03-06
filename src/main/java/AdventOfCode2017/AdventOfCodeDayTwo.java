package AdventOfCode2017;

import java.util.Arrays;

public class AdventOfCodeDayTwo {

    public int getResultPartOne(String input) {
        int runningScore = 0;
        for(String line : input.split("\n")) {
            int[] allValues = Arrays.stream(getInputLines(line)).mapToInt(Integer::parseInt).sorted().toArray();
            runningScore += allValues[allValues.length - 1] - allValues[0];
        }
        return runningScore;
    }

    public int getResultPartTwo(String input) {
        int runningScore = 0;
        for(String line: input.split("\n")) {
            int[] allValues = Arrays.stream(getInputLines(line)).mapToInt(Integer::parseInt).sorted().toArray();
            for (int i = 0; i < allValues.length; i++) {
                runningScore += getEvenNumbers(getInputLines(line), allValues, i);
            }
        }
        return runningScore;
    }

    private int getEvenNumbers(String[] values, int[] allValues, int i) {
        int masterValue = allValues[i];
        for (int x = i + 1; x < values.length; x++) {
            int currentValue = allValues[x];
            if (masterValue % currentValue == 0) {
                return (masterValue / currentValue);
            } else if (currentValue % masterValue == 0) {
                return (currentValue / masterValue);
            }
        }
        return 0;
    }

    private String[] getInputLines(String line) {
       return line.contains("\t") ? line.split("\t") : line.split(" ");
    }

    public static void main(String[] args) {
        AdventOfCodeDayTwo adventOfCodeDayTwo = new AdventOfCodeDayTwo();
        System.out.println("part one: " + adventOfCodeDayTwo.getResultPartOne(input));
        System.out.println("part two: " + adventOfCodeDayTwo.getResultPartTwo(input));
    }

    private static final String input = "1208\t412\t743\t57\t1097\t53\t71\t1029\t719\t133\t258\t69\t1104\t373\t367\t365\n" +
            "4011\t4316\t1755\t4992\t228\t240\t3333\t208\t247\t3319\t4555\t717\t1483\t4608\t1387\t3542\n" +
            "675\t134\t106\t115\t204\t437\t1035\t1142\t195\t1115\t569\t140\t1133\t190\t701\t1016\n" +
            "4455\t2184\t5109\t221\t3794\t246\t5214\t4572\t3571\t3395\t2054\t5050\t216\t878\t237\t3880\n" +
            "4185\t5959\t292\t2293\t118\t5603\t2167\t5436\t3079\t167\t243\t256\t5382\t207\t5258\t4234\n" +
            "94\t402\t126\t1293\t801\t1604\t1481\t1292\t1428\t1051\t345\t1510\t1417\t684\t133\t119\n" +
            "120\t1921\t115\t3188\t82\t334\t366\t3467\t103\t863\t3060\t2123\t3429\t1974\t557\t3090\n" +
            "53\t446\t994\t71\t872\t898\t89\t982\t957\t789\t1040\t100\t133\t82\t84\t791\n" +
            "2297\t733\t575\t2896\t1470\t169\t2925\t1901\t195\t2757\t1627\t1216\t148\t3037\t392\t221\n" +
            "1343\t483\t67\t1655\t57\t71\t1562\t447\t58\t1561\t889\t1741\t1338\t88\t1363\t560\n" +
            "2387\t3991\t3394\t6300\t2281\t6976\t234\t204\t6244\t854\t1564\t210\t195\t7007\t3773\t3623\n" +
            "1523\t77\t1236\t1277\t112\t171\t70\t1198\t86\t1664\t1767\t75\t315\t143\t1450\t1610\n" +
            "168\t2683\t1480\t200\t1666\t1999\t3418\t2177\t156\t430\t2959\t3264\t2989\t136\t110\t3526\n" +
            "8702\t6973\t203\t4401\t8135\t7752\t1704\t8890\t182\t9315\t255\t229\t6539\t647\t6431\t6178\n" +
            "2290\t157\t2759\t3771\t4112\t2063\t153\t3538\t3740\t130\t3474\t1013\t180\t2164\t170\t189\n" +
            "525\t1263\t146\t954\t188\t232\t1019\t918\t268\t172\t1196\t1091\t1128\t234\t650\t420";
}