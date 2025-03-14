package com.example.chessboard.model;

import com.example.chessboard.utils.Position;

import java.util.HashSet;
import java.util.Set;

public class Queen implements ChessPiece {
    @Override
    public Set<String> getPossibleMoves(Position pos) {
        Set<String> moves = new HashSet<>();

        // Horizontal and vertical moves
        for (int i = 0; i < Position.BOARD_SIZE; i++) {
            if (i != pos.col()) moves.add(Position.toString(pos.row(), i));
            if (i != pos.row()) moves.add(Position.toString(i, pos.col()));
        }

        // Diagonal moves
        for (int i = -Position.BOARD_SIZE; i <= Position.BOARD_SIZE; i++) {
            if (Position.isValidPosition(pos.row() + i, pos.col() + i) && i != 0)
                moves.add(Position.toString(pos.row() + i, pos.col() + i));
            if (Position.isValidPosition(pos.row() + i, pos.col() - i) && i != 0)
                moves.add(Position.toString(pos.row() + i, pos.col() - i));
        }

        return moves;
    }
}
