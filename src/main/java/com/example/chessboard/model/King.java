package com.example.chessboard.model;

import com.example.chessboard.utils.Position;

import java.util.HashSet;
import java.util.Set;

public class King implements ChessPiece {
    @Override
    public Set<String> getPossibleMoves(Position pos) {
        Set<String> moves = new HashSet<>();

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                if (Position.isValidPosition(pos.row() + i, pos.col() + j)) {
                    moves.add(Position.toString(pos.row() + i, pos.col() + j));
                }
            }
        }
        return moves;
    }
}
