package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Code02Test {
    @Test
    void testGreet() {
        Code02 code = new Code02();
        assertEquals("Hello, World!", code.greet("World"));
        assertEquals("Hello, Student!", code.greet("Student"));
    }
}