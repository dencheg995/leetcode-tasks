package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParentheses20Test {

    private final ValidParentheses20 validParentheses20 = new ValidParentheses20();

    @Test
    void test1() {

        assertTrue(validParentheses20.isValid("()"));
        assertTrue(validParentheses20.isValid("()[]{}"));
        assertFalse(validParentheses20.isValid("(]"));
    }

}