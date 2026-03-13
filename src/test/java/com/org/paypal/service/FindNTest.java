package com.org.paypal.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNTest {
    private static final String[] EXPECTED = {
        "1",        // n=1
        "11",       // n=2
        "21",       // n=3
        "1211",     // n=4
        "111221",   // n=5
        "312211",   // n=6
        "13112221", // n=7
        "1113213211", // n=8
        "31131211131221", // n=9
        "13211311123113112211" // n=10
    };

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    void testFindN(int n) {
        assertEquals(EXPECTED[n - 1], FindN.find(n));
    }
}
