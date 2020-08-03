package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = (array.length - index) - 1;
            array[temp] = array[index];
            array[index] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int[] inputBack = back(input);
        System.out.println(Arrays.toString(inputBack));
    }
}
