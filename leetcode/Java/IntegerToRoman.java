package com.leetcode.training;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {

        Map<Integer, String> nums = new HashMap<>();

        nums.put(0, "");
        nums.put(1, "I");
        nums.put(2, "II");
        nums.put(3, "III");
        nums.put(4, "IV");
        nums.put(5, "V");
        nums.put(6, "VI");
        nums.put(7, "VII");
        nums.put(8, "VIII");
        nums.put(9, "IX");
        nums.put(10, "X");
        nums.put(20, "XX");
        nums.put(30, "XXX");
        nums.put(40, "XL");
        nums.put(50, "L");
        nums.put(60, "LX");
        nums.put(70, "LXX");
        nums.put(80, "LXXX");
        nums.put(90, "XC");
        nums.put(100, "C");
        nums.put(200, "CC");
        nums.put(300, "CCC");
        nums.put(400, "CD");
        nums.put(500, "D");
        nums.put(600, "DC");
        nums.put(700, "DCC");
        nums.put(800, "DCCC");
        nums.put(900, "CM");
        nums.put(1000, "M");
        nums.put(2000, "MM");
        nums.put(3000, "MMM");

        String result = "";

        int multiply = 0;

        while (num > 0) {
            result = nums.get((Integer) (num % 10) * (int) Math.pow(10, multiply)) + result;
            num = num / 10;
            multiply++;
        }

        return result;

    }

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(3));
    }

}
