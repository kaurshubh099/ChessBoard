package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueenTest {

    @Test
    void getPossibleMoves() {
        Queen queen = new Queen();
        assertEquals(21, queen.getPossibleMoves(new Position(0, 0)).size());
        assertEquals(23, queen.getPossibleMoves(new Position(1, 1)).size());
        assertEquals(21, queen.getPossibleMoves(new Position(7, 7)).size());
    }

}
