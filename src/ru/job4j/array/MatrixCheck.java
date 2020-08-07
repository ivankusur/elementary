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
}
