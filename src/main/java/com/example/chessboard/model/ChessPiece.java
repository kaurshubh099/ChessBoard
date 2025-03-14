package com.example.chessboard.model;

import com.example.chessboard.utils.Position;
import java.util.Set;

public interface ChessPiece {
    Set<String> getPossibleMoves(Position position);
}
