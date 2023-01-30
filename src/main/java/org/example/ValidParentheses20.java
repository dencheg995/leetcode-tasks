package org.example;

import java.util.Stack;

/**
 * Solution for https://leetcode.com/problems/removing-stars-from-a-string/
 */
public class ValidParentheses20 {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            if (s.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (s.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            }  else if (s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();

    }
}
