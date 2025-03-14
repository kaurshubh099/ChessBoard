package com.example.chessboard;

import com.example.chessboard.model.ChessPiece;
import com.example.chessboard.utils.Position;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.Set;

import static com.example.chessboard.utils.ChessPieceHelper.createChessPiece;

@SpringBootApplication
public class ChessBoardApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChessBoardApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chessboard Simulator!");
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("Enter the type of chess piece (Pawn, King, Queen): ");
            if (!scanner.hasNextLine()) {
                System.err.println("No input provided for chess piece.");
                break;
            }
            String pieceType = scanner.nextLine().trim().toLowerCase();

            System.out.println("Enter the initial position (e.g., D5): ");
            if (!scanner.hasNextLine()) {
                System.err.println("No input provided for position.");
                break;
            }
            String positionInput = scanner.nextLine().trim().toUpperCase();

            ChessPiece piece = createChessPiece(pieceType);

            if (piece != null) {
                try {
                    Position position = Position.fromString(positionInput);
                    Set<String> possibleMoves = piece.getPossibleMoves(position);
                    System.out.printf("%s possible moves from %s: %s%n", capitalize(pieceType), positionInput, String.join(", ", possibleMoves));
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input: " + e.getMessage());
                }
            } else {
                System.out.println("Invalid chess piece type!");
            }

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

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
