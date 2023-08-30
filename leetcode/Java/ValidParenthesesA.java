package com.leetcode.training;

import java.util.Stack;

public class ValidParenthesesA {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);

            if (
                    (currentChar == '(') ||
                    (currentChar == '[') ||
                    (currentChar == '{')
            ) {
                stack.push(currentChar);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char shouldBeOpennedBrace = stack.pop();

                    if (
                            ((currentChar == '}') && (shouldBeOpennedBrace != '{')) ||
                            ((currentChar == ']') && (shouldBeOpennedBrace != '[')) ||
                            ((currentChar == ')') && (shouldBeOpennedBrace != '('))

                    ) {
                        return false;
                    }
                }
            }



        }

        if (stack.empty()) {
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        ValidParenthesesA validParenthesesA = new ValidParenthesesA();
        validParenthesesA.isValid("()[]{}");
    }
}
