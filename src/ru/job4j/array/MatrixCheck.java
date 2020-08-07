package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] matrix, int row) {
        boolean result = true;
        for (int cell = 0; cell < matrix[row].length; cell++) {
            if (matrix[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] matrix, int cell) {
        boolean result = true;
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
