package com.example.chessboard.utils;

public class Position {
    public static final int BOARD_SIZE = 8;
    private static final char[] COLUMNS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

    private final int row;
    private final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int row() {
        return row;
    }

    public int col() {
        return col;
    }

    public static Position fromString(String input) {
        if (input == null || input.length() != 2) {
            throw new IllegalArgumentException("Invalid position format");
        }
        char colChar = input.charAt(0);
        int col = colChar - 'A';
        int row = 8 - Character.getNumericValue(input.charAt(1));
        if (!isValidPosition(row, col)) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        return new Position(row, col);
    }

    public static boolean isValidPosition(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE;
    }

    public static String toString(int row, int col) {
        return COLUMNS[col] + String.valueOf(8 - row);
    }
}
