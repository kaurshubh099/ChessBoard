package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import java.util.HashSet;
import java.util.Set;

public class King implements ChessPiece {

    private static final int[][] KING_MOVES = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };

    @Override
    public Set<String> getPossibleMoves(Position position) {
        Set<String> moves = new HashSet<>();
        for (int[] move : KING_MOVES) {
            int newRow = position.row() + move[0];
            int newCol = position.col() + move[1];
            if (Position.isValidPosition(newRow, newCol)) {
                moves.add(Position.toString(newRow, newCol));
            }
        }
        return moves;
    }
}
