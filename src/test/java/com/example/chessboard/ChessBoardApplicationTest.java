package com.example.chessboard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChessBoardApplicationTest {

    @Test
    void testRunWithValidInput() {
        String input = "King, D5\nno\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ChessBoardApplication.main(new String[]{});

        String output = out.toString();
        assertTrue(output.contains("Welcome to the Chessboard Simulator!"));
        assertTrue(output.contains("Do you want to try again? (yes/no): "));
        assertTrue(output.contains("Thank you for using the Chessboard Simulator!"));
    }
}
