package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PawnTest {

    @Test
    void getPossibleMoves() {
        Pawn pawn = new Pawn();
        assertEquals(1, pawn.getPossibleMoves(new Position(0, 0)).size());
        assertEquals(2, pawn.getPossibleMoves(new Position(1, 1)).size());
        assertEquals(0, pawn.getPossibleMoves(new Position(1, 8)).size());
        assertEquals(0, pawn.getPossibleMoves(new Position(7, 7)).size());
    }

}
