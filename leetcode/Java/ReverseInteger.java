package com.leetcode.training;

public class ReverseInteger {
    public int reverse(int x) {

        long result = 0;
        int power = 0;
        Integer[] resultArray = new Integer[10];
        int minus = 1;

        if (x<0) {
            x = -x;
            minus = -1;
        }

        int n = 0;

        while (x>9) {
            resultArray[n] = x % 10;
            x = x / 10;
            n++;
            power++;
        }

        result = result + x;
        int j = 0;
        for (int i = power; i>0; i--) {


            result = result + (long) resultArray[j] * (long) Math.pow(10, i);

            j++;
        }
        result = result * minus;

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;

    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-2147483412));
    }
}
