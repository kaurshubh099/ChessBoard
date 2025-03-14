package com.example.chessboard;

import com.example.chessboard.utils.ChessPieceHelper;

import java.util.Scanner;

public class ChessBoardImplementation {

    public static void runChessBoardSimulator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chessboard Simulator!");
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Enter the type of chess piece and initial position (e.g., King, D5): ");
            if (!scanner.hasNextLine()) {
                System.err.println("No input provided.");
                break;
            }
            String input = scanner.nextLine().trim();
            String[] inputParts = input.split(",");
            if (inputParts.length != 2) {
                System.out.println("Invalid input format! Please use the format 'PieceType, Position' (e.g., King, D5).");
                continue;
            }

            String pieceType = inputParts[0].trim();
            String positionInput = inputParts[1].trim().toUpperCase();

            ChessPieceHelper.getPossibleMoves(pieceType, positionInput);

            System.out.println("Do you want to try again? (yes/no): ");
            if (!scanner.hasNextLine()) {
                System.err.println("No input provided for continuation.");
                break;
            }
            String response = scanner.nextLine().trim().toLowerCase();
            continueRunning = response.equals("yes");
        }

        System.out.println("Thank you for using the Chessboard Simulator!");
    }
}
