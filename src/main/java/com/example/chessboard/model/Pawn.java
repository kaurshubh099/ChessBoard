package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import java.util.HashSet;
import java.util.Set;

public class Pawn implements ChessPiece {
    @Override
    public Set<String> getPossibleMoves(Position pos) {
        Set<String> moves = new HashSet<>();
        if(pos.row() == 1 && Position.isValidPosition(pos.row() + 2, pos.col())) {
            moves.add(Position.toString(pos.row() + 2, pos.col()));
        }
        if (Position.isValidPosition(pos.row() + 1, pos.col())) {
            moves.add(Position.toString(pos.row() + 1, pos.col()));
        }
        return moves;
    }
}
