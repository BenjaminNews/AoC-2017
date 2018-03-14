package com.benk.mockito;

public class ChristmasDayPartFive {

    private int[] galaxy;

    public int calculateMoves(int galaxySize) {
        //int[] christmasGalaxy = createGalaxy(0);

        if(galaxySize == 0) {
            return 1;
        }
        int size = (int)Math.sqrt(galaxySize);

        int[][] multi = new int[size][size];

        for(int i = 1; i < multi.length; i++) {
            for(int j = 1; j < multi[i].length; j++) {
                multi[i][j] = j;
                System.out.println("values at [" + i + "][" + j + "] is: " + multi[i][j]);

            }
        }
        return -1;
    }

//    private int[] createGalaxy(int size) {
//        int[] galaxy = new int[size];
//
//        for(int position = 0; position >= size; position--) {
//            galaxy[position] = position;
//        }
//
//        return galaxy;
//    }

}
