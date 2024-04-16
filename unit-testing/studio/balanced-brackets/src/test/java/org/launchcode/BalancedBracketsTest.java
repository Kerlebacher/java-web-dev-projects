package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void unbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void unbalancedBracketsRightCase() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }

    @Test
    public void unbalancedBracketsLeftCase() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }

    @Test
    public void urandom() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]]["));
    }
}