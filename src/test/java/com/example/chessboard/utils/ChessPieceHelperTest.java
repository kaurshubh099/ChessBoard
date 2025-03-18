package com.example.chessboard.utils;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class ChessPieceHelperTest {

    @Test
    void testGetPossibleMovesForPawn() {
        Set<String> expectedMoves = Set.of("B5", "B6");

        Set<String> moves = ChessPieceHelper.getPossibleMoves("pawn", "B7");

        assertNotNull(moves, "Possible moves should not be null");
        assertEquals(expectedMoves, moves);
    }

    @Test
    void testGetPossibleMovesForKing() {
        Set<String> expectedMoves = Set.of("F1", "F2", "E2", "D1", "D2");

        Set<String> moves = ChessPieceHelper.getPossibleMoves("king", "E1");

        assertNotNull(moves, "Possible moves should not be null");
        assertEquals(expectedMoves, moves);
    }

    @Test
    void testGetPossibleMovesForQueen() {
        Set<String> expectedMoves = Set.of("H1", "G1", "F1", "E1", "H5", "G4", "F3", "E2", "C1", "D2", "B1", "D3", "C2", "A1", "D4", "D5", "B3", "D6", "D7", "A4", "D8");
        Set<String> moves = ChessPieceHelper.getPossibleMoves("queen", "D1");

        assertNotNull(moves, "Possible moves should not be null");
        assertEquals(expectedMoves, moves);
    }

    @Test
    void testGetPossibleMovesForInvalidPiece() {
        Set<String> moves = ChessPieceHelper.getPossibleMoves("invalid", "D1");
        assertNull(moves, "Possible moves should be null for an invalid piece type");
        assertEquals(moves, null);
    }

    @Test
    void testGetPossibleMovesForInvalidPosition() {
        Set<String> moves = ChessPieceHelper.getPossibleMoves("king", "Z9");
        assertNull(moves, "Possible moves should be null for an invalid position");
    }

    @Test
    void testCapitalize() throws Exception {
        Method capitalizeMethod = ChessPieceHelper.class.getDeclaredMethod("capitalize", String.class);
        capitalizeMethod.setAccessible(true);

        assertEquals("Pawn", capitalizeMethod.invoke(null, "pawn"));
        assertEquals("King", capitalizeMethod.invoke(null, "king"));
        assertEquals("Queen", capitalizeMethod.invoke(null, "queen"));
        assertEquals("", capitalizeMethod.invoke(null, ""));
        assertNull(capitalizeMethod.invoke(null, (String) null));
    }
}
