package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import java.util.HashSet;
import java.util.Set;

public class Queen implements ChessPiece {

    private static final int[][] QUEEN_DIRECTIONS = {
            {0, 1}, {0, -1}, {-1, 0}, {1, 0},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    @Override
    public Set<String> getPossibleMoves(Position position) {
        Set<String> moves = new HashSet<>();

        for (int[] direction : QUEEN_DIRECTIONS) {
            int newRow = position.row();
            int newCol = position.col();

            while (true) {
                newRow += direction[0];
                newCol += direction[1];

                if (!Position.isValidPosition(newRow, newCol)) {
                    break;
                }

                moves.add(Position.toString(newRow, newCol));
            }
        }

        return moves;
    }
}
