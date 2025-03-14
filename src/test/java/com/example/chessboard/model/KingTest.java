package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KingTest {

    @Test
    void getPossibleMoves() {
        King king = new King();
        assertEquals(3, king.getPossibleMoves(new Position(0, 0)).size());
        assertEquals(5, king.getPossibleMoves(new Position(0, 1)).size());
        assertEquals(8, king.getPossibleMoves(new Position(1, 1)).size());
        assertEquals(3, king.getPossibleMoves(new Position(7, 7)).size());
    }

}
