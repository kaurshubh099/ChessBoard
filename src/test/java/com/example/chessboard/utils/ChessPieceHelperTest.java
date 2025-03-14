package com.example.chessboard.utils;

import com.example.chessboard.ChessBoardApplication;
import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.model.King;
import com.example.chessboard.model.Pawn;
import com.example.chessboard.model.Queen;
import org.junit.jupiter.api.Test;

import static com.example.chessboard.utils.ChessPieceHelper.createChessPiece;
import static org.junit.jupiter.api.Assertions.*;

public class ChessPieceHelperTest {

    @Test
    void testCreateChessPiece() {
        ChessPiece pawn = createChessPiece("pawn");
        assertNotNull(pawn);
        assertTrue(pawn instanceof Pawn);

        ChessPiece king = createChessPiece("king");
        assertNotNull(king);
        assertTrue(king instanceof King);

        ChessPiece queen = createChessPiece("queen");
        assertNotNull(queen);
        assertTrue(queen instanceof Queen);

        ChessPiece invalid = createChessPiece("invalid");
        assertNull(invalid);
    }
}
