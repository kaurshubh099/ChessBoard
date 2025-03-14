package com.example.chessboard;

import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.model.King;
import com.example.chessboard.model.Pawn;
import com.example.chessboard.model.Queen;
import com.example.chessboard.utils.Position;

import java.util.Scanner;

public class ChessBoardApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the chess piece (Pawn, King, Queen): ");
//        if (!scanner.hasNextLine()) {
//            System.err.println("No input provided for chess piece.");
//            return;
//        }
        String pieceType = scanner.nextLine();

        System.out.println("Enter the position (e.g., E4): ");
//        if (!scanner.hasNextLine()) {
//            System.err.println("No input provided for position.");
//            return;
//        }
        String position = scanner.nextLine();

        ChessPiece piece = createChessPiece(pieceType);
        if (piece != null) {
            testChessPiece(pieceType, piece, position);
        } else {
            System.out.println("Invalid chess piece type.");
        }
    }

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

    private static void testChessPiece(String name, ChessPiece piece, String position) {
        try {
            Position pos = Position.fromString(position);
            System.out.printf("%s possible moves from %s: %s%n", name, position, String.join(", ", piece.getPossibleMoves(pos)));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
