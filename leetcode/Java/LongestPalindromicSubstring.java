package com.leetcode.training;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        String answer = String.valueOf(s.charAt(0));
        int maxLenght = 0;

        for (int i = 0; i<s.length()-1; i++) {
            int n = 1;
//            if (s.length() % 2 == 0) {
//                n = 1;
//            } else {
//                n = 2;
//            }

            boolean isSync = true;

            while ((isSync==true) & (i>=0) & (i+n <= s.length()-1)) {
                if ((s.charAt(i) == s.charAt(i+n)) & (maxLenght < n)) {
                    isSync = true;
                    maxLenght = n;
                    answer = s.substring(i, i+n);
                    n++;
                    i--;
                } else {
                    isSync = false;
                }
            }

            isSync = true;

        }

        return answer;
    }

    public static void main (String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        longestPalindromicSubstring.longestPalindrome("bbbad");
    }
}
