package com.leetcode.training;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<String, String> parentheses  = new HashMap<String, String>() {{
            put("}", "{");
            put("]", "[");
            put(")", "(");
        }};


        StringBuilder sb = new StringBuilder(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {

            String tempS = String.valueOf(s.charAt(i));

            if (parentheses.containsKey(tempS)) {
                String prevCharInStringBuilder;

                try {
                    prevCharInStringBuilder = String.valueOf(sb.charAt(sb.length()-1));
                } catch (StringIndexOutOfBoundsException e) {
                    return false;
                }

                if (parentheses.get(tempS).equals(prevCharInStringBuilder)) {
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    return false;
                }
            } else {
                sb.append(tempS);
            }
        }

        if (sb.length()==0) {
            return true;
        }

        return false;
    }
}
