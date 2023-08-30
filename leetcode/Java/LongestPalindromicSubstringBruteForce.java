package com.leetcode.training;

/**
 * 5
 */
public class LongestPalindromicSubstringBruteForce {
    public String longestPalindrome(String s) {
        String resultingString = null;
        int maxLength = 0;
        boolean isSubString = true;

        if (s.length() == 1) {
            return s;
        }

        for (int i=0; i<s.length()-1; i++) {
            for (int k=i+1; k<=s.length(); k++) {
                String sub = s.substring(i, k);
                for(int j = 0; j<=sub.length()/2; j++) {
                    if (sub.charAt(j)!=(sub.charAt(sub.length()-j-1))) {
                        isSubString = false;
                        break;
                    }
                }
                if ((isSubString==true) & (maxLength < sub.length())) {
                    maxLength = sub.length();
                    if (maxLength == s.length()) {
                        return s;
                    }
                    resultingString = sub;
                }

                isSubString = true;

            }

        }
        return resultingString;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstringBruteForce longestPalindromicSubstringBruteForce = new LongestPalindromicSubstringBruteForce();
        String out = longestPalindromicSubstringBruteForce.longestPalindrome("bb");
        System.out.println(out);
    }

}
