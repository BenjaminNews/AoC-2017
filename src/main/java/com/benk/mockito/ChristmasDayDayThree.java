package com.benk.mockito;

public class ChristmasDayDayThree {
//   100 99 98 97 96 95 94 93 92 91
//   65  64 63 62 61 60 59 58 57 90
//   66  37 36 35 34 33 32 31 56 89
//   67  38 17 16 15 14 13 30 55 88
//   68  39 18  5  4  3 12 29 54 87
//   69  40 19  6  1  2 11 28 53 86
//   70  41 20  7  8  9 10 27 52 85
//   71  42 21 22 23 24 25 26 51 84
//   72  43 44 45 46 47 48 49 50 83
//   73  74 75 76 77 78 79 80 81 82

    public int calculateMoves(int startingPosition) {
        if(startingPosition != 1) {
            if (startingPosition < 10 && startingPosition % 2 == 0) {
                if(startingPosition % 2 == 1) {
                    return 2;
                } else {
                    return 1;
                }
            } else if(startingPosition <= 25) {
                if(startingPosition % 2 == 1) {
                    return 3;
                }
                else if(startingPosition % 3 == 1) {
                    return 4;
                } else {return 2;}
            } else if(startingPosition > 25) {


            }
        }
        return 0;
    }
}
