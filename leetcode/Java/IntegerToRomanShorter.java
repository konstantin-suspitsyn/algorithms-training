package com.leetcode.training;

public class IntegerToRomanShorter {
    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num = num - values[i];
                sb.append(roman[i]);
            }
        }

        return String.valueOf(sb);


    }

    public static void main(String[] args) {
        IntegerToRomanShorter integerToRoman = new IntegerToRomanShorter();
        System.out.println(integerToRoman.intToRoman(3));
    }


}
