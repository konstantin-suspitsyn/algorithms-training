package com.leetcode.training;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if ((j > strs[i].length() - 1) || strs[0].charAt(j)!=strs[i].charAt(j)) {
                    return String.valueOf(result);
                }
            }
            result.append(String.valueOf(strs[0].charAt(j)));
        }
        return String.valueOf(result);

    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }
}
