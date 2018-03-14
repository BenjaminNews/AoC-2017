package com.benk.mockito;

import java.util.ArrayList;
import java.util.Collections;

public class ChristmasDayPartThree {

//    5 1 9 5
//    7 5 3
//    2 4 6 8
//    The first row's largest and smallest values are 9 and 1, and their difference is 8.
//    The second row's largest and smallest values are 7 and 3, and their difference is 4.
//    The third row's difference is 6.

    public static int calculateRowChecksum(String s) {
        //String sorted = "1208\t412\t743\t57\t1097\t53\t71\t1029\t719\t133\t258\t69\t1104\t373\t367\t365\n";

        String[] splitted = s.split("\t|\n|\\s");
        ArrayList<Integer> myListOfNumbers = new ArrayList<Integer>();



        for(int i = 0; i < splitted.length; i++) {
            System.out.println(splitted[i]);
            myListOfNumbers.add(Integer.parseInt(splitted[i]));
        }

        Collections.sort(myListOfNumbers);
        System.out.println(myListOfNumbers);
        System.out.println(myListOfNumbers.get(myListOfNumbers.size() -1) - myListOfNumbers.get(0));
        return myListOfNumbers.get(myListOfNumbers.size() -1) - myListOfNumbers.get(0);
    }

    public static void main(String[] args) {
        ChristmasDayPartThree christmasDayPartThree = new ChristmasDayPartThree();
        int total = 0;
        total += calculateRowChecksum("1208\t412\t743\t57\t1097\t53\t71\t1029\t719\t133\t258\t69\t1104\t373\t367\t365\n");
        total += calculateRowChecksum("4011\t4316\t1755\t4992\t228\t240\t3333\t208\t247\t3319\t4555\t717\t1483\t4608\t1387\t3542\n");
        total += calculateRowChecksum("675\t134\t106\t115\t204\t437\t1035\t1142\t195\t1115\t569\t140\t1133\t190\t701\t1016\n");
        total += calculateRowChecksum("4455\t2184\t5109\t221\t3794\t246\t5214\t4572\t3571\t3395\t2054\t5050\t216\t878\t237\t3880\n");

        total += calculateRowChecksum("4185\t5959\t292\t2293\t118\t5603\t2167\t5436\t3079\t167\t243\t256\t5382\t207\t5258\t4234\n");

        total += calculateRowChecksum("94\t402\t126\t1293\t801\t1604\t1481\t1292\t1428\t1051\t345\t1510\t1417\t684\t133\t119\n");
        total += calculateRowChecksum("120\t1921\t115\t3188\t82\t334\t366\t3467\t103\t863\t3060\t2123\t3429\t1974\t557\t3090\n");
        total += calculateRowChecksum("53\t446\t994\t71\t872\t898\t89\t982\t957\t789\t1040\t100\t133\t82\t84\t791\n");
        total += calculateRowChecksum("2297\t733\t575\t2896\t1470\t169\t2925\t1901\t195\t2757\t1627\t1216\t148\t3037\t392\t221");
        total += calculateRowChecksum("1343\t483\t67\t1655\t57\t71\t1562\t447\t58\t1561\t889\t1741\t1338\t88\t1363\t560\n");
        total += calculateRowChecksum("2387\t3991\t3394\t6300\t2281\t6976\t234\t204\t6244\t854\t1564\t210\t195\t7007\t3773\t3623\n");
        total += calculateRowChecksum("1523\t77\t1236\t1277\t112\t171\t70\t1198\t86\t1664\t1767\t75\t315\t143\t1450\t1610\n");
        total += calculateRowChecksum("168\t2683\t1480\t200\t1666\t1999\t3418\t2177\t156\t430\t2959\t3264\t2989\t136\t110\t3526\n");
        total += calculateRowChecksum("8702\t6973\t203\t4401\t8135\t7752\t1704\t8890\t182\t9315\t255\t229\t6539\t647\t6431\t6178\n");
        total += calculateRowChecksum("2290\t157\t2759\t3771\t4112\t2063\t153\t3538\t3740\t130\t3474\t1013\t180\t2164\t170\t189\n");
        total += calculateRowChecksum("525\t1263\t146\t954\t188\t232\t1019\t918\t268\t172\t1196\t1091\t1128\t234\t650\t420");

        System.out.println(total);
    }
}

