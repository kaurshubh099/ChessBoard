package com.example.chessboard;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.chessboard.ChessBoardImplementation.runChessBoardSimulator;

@SpringBootApplication
public class ChessBoardApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ChessBoardApplication.class, args);
    }

    @Override
    public void run(String... args) {
        runChessBoardSimulator();
    }
}
