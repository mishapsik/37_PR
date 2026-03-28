package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Code01Test {
    @Test
    void testAdd() {
        Code01 code = new Code01();
        assertEquals(5, code.add(2, 3));
        assertEquals(0, code.add(0, 0));
        assertEquals(-1, code.add(5, -6));
    }
}