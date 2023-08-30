package com.leetcode.training;

public class SqrtX {
    public int mySqrt(int x) {
        if ((x==0) || (x==1)) {
            return x;
        }

        int max = 46341;
        int min = 1;
        int current;

        while (true) {
            current = min + (max - min) / 2;
            if ((long) current * (long) current <= (long) x) {
                if ((long) (current + 1) * (long) (current + 1) > (long) x) {
                    return current;
                }
                min = current;
            } else {
                max=current;
            }

        }

    }

    public static void main(String[] args) {
        SqrtX x = new SqrtX();
        System.out.println(x.mySqrt(4));
    }
}
