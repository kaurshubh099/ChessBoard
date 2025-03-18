package com.example.chessboard.utils;

import com.example.chessboard.model.*;

import java.util.Set;

public class ChessPieceHelper {

    private ChessPieceHelper() {
    }

    private static ChessPiece createChessPiece(PieceType pieceType) {
        switch (pieceType) {
            case PAWN:
                return new Pawn();
            case KING:
                return new King();
            case QUEEN:
                return new Queen();
            default:
                return null;
        }
    }

    public static Set<String> getPossibleMoves(String pieceType, String positionInput) {
        ChessPiece piece = null;
        try {
            piece = createChessPiece(PieceType.valueOf(pieceType.toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid chess piece type: " + pieceType);
            return null;
        }

        try {
            Position position = Position.fromString(positionInput);
            Set<String> possibleMoves = piece.getPossibleMoves(position);
            System.out.printf("%s possible moves from %s: %s%n", capitalize(pieceType), positionInput, String.join(", ", possibleMoves));
            return possibleMoves;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        return null;
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
