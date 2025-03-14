package com.example.chessboard;

import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.model.King;
import com.example.chessboard.model.Pawn;
import com.example.chessboard.model.Queen;
import com.example.chessboard.utils.Position;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChessBoardApplicationTests {

    @Test
    void testPossibleMoves() {
        ChessBoardApplication app = new ChessBoardApplication();

        ChessPiece king = new King();
        Position kingPosition = Position.fromString("E4");
        Set<String> kingMoves = king.getPossibleMoves(kingPosition);
        assertNotNull(kingMoves);
        assertFalse(kingMoves.isEmpty());

        ChessPiece pawn = new Pawn();
        Position pawnPosition = Position.fromString("E2");
        Set<String> pawnMoves = pawn.getPossibleMoves(pawnPosition);
        assertNotNull(pawnMoves);
        assertFalse(pawnMoves.isEmpty());

        ChessPiece queen = new Queen();
        Position queenPosition = Position.fromString("D1");
        Set<String> queenMoves = queen.getPossibleMoves(queenPosition);
        assertNotNull(queenMoves);
        assertFalse(queenMoves.isEmpty());
    }
}
