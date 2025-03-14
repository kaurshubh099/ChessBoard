package com.example.chessboard.utils;

import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.model.King;
import com.example.chessboard.model.Pawn;
import com.example.chessboard.model.Queen;
import java.util.Set;

public class ChessPieceHelper {

    private ChessPieceHelper() {}

    private static ChessPiece createChessPiece(String pieceType) {
        switch (pieceType.toLowerCase()) {
            case "pawn":
                return new Pawn();
            case "king":
                return new King();
            case "queen":
                return new Queen();
            default:
                return null;
        }
    }

    public static Set<String> getPossibleMoves(String pieceType, String positionInput) {
        ChessPiece piece = createChessPiece(pieceType);

        if (piece != null) {
            try {
                Position position = Position.fromString(positionInput);
                Set<String> possibleMoves = piece.getPossibleMoves(position);
                System.out.printf("%s possible moves from %s: %s%n", capitalize(pieceType), positionInput, String.join(", ", possibleMoves));
                return possibleMoves;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid chess piece type!");
        }
        return null;
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
