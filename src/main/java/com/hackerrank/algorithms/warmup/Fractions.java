package com.hackerrank.algorithms.warmup;

import java.text.DecimalFormat;

public class Fractions {

    static void plusMinus(int[] arr) {
       Double arraySize = new Double(arr.length);
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(true);
        format.setMinimumFractionDigits(6);
        Double zeros = 0.000000;

        Double positives = 0.000000;
        Double negatives = 0.000000;

        for (int x :arr) {
            if(x > 0){
                positives++;
            } else if (x < 0 ){
                negatives++;
            } else {
                zeros++;
            }
        }
        System.out.println(format.format(positives/arraySize));
        System.out.println(format.format(negatives/arraySize));
        System.out.println(format.format(zeros/arraySize));

    }

    public static void main(String[] args) {
        Fractions.plusMinus( new int[] {-4, 3, -9, 0, 4, 1 });
    }
}
