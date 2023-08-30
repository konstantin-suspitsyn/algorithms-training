package com.leetcode.training;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {

        int lengthOfNeedle = needle.length();
        int lengthOfHaystack = haystack.length();
        int difference = lengthOfHaystack-lengthOfNeedle;

        for (int i = 0; i <= difference; i++) {
            if (needle.equals(haystack.substring(i, i + lengthOfNeedle))) {
                return i;
            }
        }

        return -1;
    }
}

