package com.example.chessboard.utils;

import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.model.King;
import com.example.chessboard.model.Pawn;
import com.example.chessboard.model.Queen;

public class ChessPieceHelper {

    public static ChessPiece createChessPiece(String pieceType) {
        switch (pieceType) {
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
}
