package com.example.chessboard;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ChessBoardImplementationTest {

    @Test
    void testRunChessBoardSimulatorWithValidInput() {
        String input = "King, D5\nno\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("Welcome to the Chessboard Simulator!"));
        assertTrue(output.contains("Do you want to try again? (yes/no): "));
        assertTrue(output.contains("Thank you for using the Chessboard Simulator!"));
    }

    @Test
    void testRunChessBoardSimulatorWithInvalidInputFormat() {
        String input = "InvalidInput\nno\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("Invalid input format! Please use the format 'PieceType, Position' (e.g., King, D5)."));
    }

    @Test
    void testRunChessBoardSimulatorWithNoInput() {
        String input = "\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("No input provided."));
    }

    @Test
    void testRunChessBoardSimulatorWithContinuation() {
        String input = "King, D5\nyes\nQueen, D1\nno\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("Do you want to try again? (yes/no): "));
        assertTrue(output.contains("Thank you for using the Chessboard Simulator!"));
    }

    @Test
    void testRunChessBoardSimulatorWithNoContinuationInput() {
        String input = "King, D5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("Do you want to try again? (yes/no): "));
        assertTrue(output.contains("No input provided for continuation."));
        assertTrue(output.contains("Thank you for using the Chessboard Simulator!"));
    }

    @Test
    void testRunChessBoardSimulatorWhenContinuationInputIsBlank() {
        String input = "King, D5\n \n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardImplementation.runChessBoardSimulator();

        String output = out.toString();
        assertTrue(output.contains("Do you want to try again? (yes/no): "));
        assertTrue(output.contains("No input provided for continuation."));
        assertTrue(output.contains("Thank you for using the Chessboard Simulator!"));
    }
}
