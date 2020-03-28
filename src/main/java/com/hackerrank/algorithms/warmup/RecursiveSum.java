package com.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.List;

/**
 * We define super digit of an integer  using the following rules:
 *
 * Given an integer, we need to find the super digit of the integer.
 *
 * If  has only  digit, then its super digit is .
 * Otherwise, the super digit of  is equal to the super digit of the sum of the digits of .
 * For example, the super digit of  will be calculated as:
 *
 * 	super_digit(9875)   	9+8+7+5 = 29
 * 	super_digit(29) 	2 + 9 = 11
 * 	super_digit(11)		1 + 1 = 2
 * 	super_digit(2)		= 2
 * You are given two numbers  and . The number  is created by concatenating the string   times. Continuing the above example where , assume your value . Your initial  (spaces added for clarity).
 *
 *     superDigit(p) = superDigit(9875987598759875)
 *                   5+7+8+9+5+7+8+9+5+7+8+9+5+7+8+9 = 116
 *     superDigit(p) = superDigit(116)
 *                   1+1+6 = 8
 *     superDigit(p) = superDigit(8)
 * All of the digits of  sum to . The digits of  sum to .  is only one digit, so it's the super digit.
 *
 * Function Description
 *
 * Complete the function superDigit in the editor below. It must return the calculated super digit as an integer.
 *
 * superDigit has the following parameter(s):
 *
 * n: a string representation of an integer
 * k: an integer, the times to concatenate  to make
 * Input Format
 *
 * The first line contains two space separated integers,  and .
 *
 * Constraints
 *
 * Output Format
 *
 * Return the super digit of , where  is created as described above.
 *
 * Sample Input 0
 *
 * 148 3
 * Sample Output 0
 *
 * 3
 * Explanation 0
 *
 * Here  and , so .
 *
 * super_digit(P) = super_digit(148148148)
 *                = super_digit(1+4+8+1+4+8+1+4+8)
 *                = super_digit(39)
 *                = super_digit(3+9)
 *                = super_digit(12)
 *                = super_digit(1+2)
 *                = super_digit(3)
 *                = 3.
 * Sample Input 1
 *
 * 9875 4
 * Sample Output 1
 *
 * 8
 * Sample Input 2
 *
 * 123 3
 * Sample Output 2
 *
 * 9
 * Explanation 2
 *
 * Here  and , so .
 *
 * super_digit(P) = super_digit(123123123)
 *                = super_digit(1+2+3+1+2+3+1+2+3)
 *                = super_digit(18)
 *                = super_digit(1+8)
 *                = super_digit(9)
 *                = 9
 */
public class RecursiveSum {
    public static int superDigit(String n, int k) {

        List<Integer> initialNumbers = getArrayOfIntegers(n);
        int sum =  0;
        for( int number : initialNumbers){
            sum = sum + recurssiveSum(number);
            sum = recurssiveSum(sum);
        }
        sum = sum * k;
        sum = recurssiveSum(sum);
        return sum;
    }

    private static List<Integer> getArrayOfIntegers(String n) {
        List<Integer> integers = new ArrayList<>();
        String str = n;
        while (str.length() > 9){
            integers.add(Integer.parseInt(str.substring(0,9)));
            str = str.substring(9);
        }
        if (str.trim().length() > 0) {
            integers.add(Integer.parseInt(str));
        }
        return integers;
    }

    private static int recurssiveSum(int number) {
        int sum = sumOfDigits(number);
        if(sum < 10){
            return sum;
        } else {
           return recurssiveSum(sum);
        }

    }

    private static int sumOfDigits(int number) {
        if(number >= 10 ) {
            int lastDigit = number % 10;
            return lastDigit + sumOfDigits(number/10);
        } else{
            return number;
        }
    }

}
