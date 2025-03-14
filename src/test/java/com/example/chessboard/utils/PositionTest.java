package com.example.chessboard.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void isValidPosition() {
        assertTrue(Position.isValidPosition(0, 0));
        assertTrue(Position.isValidPosition(7, 7));
        assertFalse(Position.isValidPosition(-1, 0));
        assertFalse(Position.isValidPosition(0, -1));
        assertFalse(Position.isValidPosition(8, 0));
        assertFalse(Position.isValidPosition(0, 8));
    }

    @Test
    void toStringTest() {
        assertEquals("A8", Position.toString(0, 0));
        assertEquals("H1", Position.toString(7, 7));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInvalidPositionFormat() {
        assertThrows(IllegalArgumentException.class, () -> Position.fromString(null));
        assertThrows(IllegalArgumentException.class, () -> Position.fromString("A"));
        assertThrows(IllegalArgumentException.class, () -> Position.fromString("A9"));
        assertThrows(IllegalArgumentException.class, () -> Position.fromString("I1"));
    }
}
