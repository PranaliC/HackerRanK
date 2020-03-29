package com.hackerrank.algorithms.warmup;

public class StaircasePrinting {

    static void staircase(int n) {

        StringBuilder spaceBuilder = new StringBuilder();
        StringBuilder hashBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            spaceBuilder.append(" ");
            hashBuilder.append("#");
        }
        String spaceString = spaceBuilder.toString();
        String hashString = hashBuilder.toString();
        for (int i =0 ; i < n; i++){
            System.out.println(spaceString.substring(0,n-i-1) + hashString.substring(0,i+1));
        }

    }

    public static void main(String[] args) {
        StaircasePrinting.staircase(4);
    }

}
